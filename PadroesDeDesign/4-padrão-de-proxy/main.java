import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Criando os objetos reais (RealSubject = Warehouse no livro)
        RealSubject armazemSP = new RealSubject("Sao Paulo - SP");
        armazemSP.addStock("SKU-001", 2);
        armazemSP.addStock("SKU-002", 0);

        RealSubject armazemRJ = new RealSubject("Rio de Janeiro - RJ");
        armazemRJ.addStock("SKU-001", 1);
        armazemRJ.addStock("SKU-002", 3);

        List<RealSubject> warehouses = new ArrayList<>();
        warehouses.add(armazemSP);
        warehouses.add(armazemRJ);

        // O Proxy gerencia o acesso aos RealSubjects usando a mesma interface Subject
        Subject proxy = new Proxy(warehouses);

        // O Client depende apenas da interface Subject (conforme o diagrama UML)
        Client client = new Client(proxy);

        // Montando um pedido (Order) com varios itens (Item)
        Item notebook = new Item("SKU-001", "Notebook");
        Item mouse = new Item("SKU-002", "Mouse");
        Item teclado = new Item("SKU-999", "Teclado (sem estoque)");

        Order pedido = new Order();
        pedido.addItem(notebook);
        pedido.addItem(mouse);
        pedido.addItem(teclado);

        client.sendOrder(pedido);
    }
}

class Client {
    private Subject subject;

    public Client(Subject subject) {
        this.subject = subject;
    }

    public void sendOrder(Order order) {
        System.out.println("[Client] Enviando pedido para processamento...");
        subject.fulfillOrder(order);
    }
}

// No seu diagrama UML: <<Interface>> Subject
interface Subject {
    void fulfillOrder(Order order);
}

// No seu diagrama UML: Proxy (implementa Subject e delega para RealSubject)
class Proxy implements Subject {
    private List<RealSubject> realSubjects;

    public Proxy(List<RealSubject> realSubjects) {
        this.realSubjects = realSubjects;
    }

    @Override
    public void fulfillOrder(Order order) {
        for (Item item : order.getItemList()) {
            boolean fulfilled = false;

            for (RealSubject realSubject : realSubjects) {
                if (realSubject.currentInventory(item) > 0) {
                    Order subOrder = new Order();
                    subOrder.addItem(item);
                    realSubject.fulfillOrder(subOrder);
                    fulfilled = true;
                    break;
                }
            }

            if (!fulfilled) {
                System.out.println("[Proxy] Produto indisponivel em todos os armazens: "
                        + item.getName() + " (SKU: " + item.getSku() + ")");
            }
        }
    }
}

// No seu diagrama UML: RealSubject
class RealSubject implements Subject {
    private Hashtable<String, Integer> stock;
    private String address;

    public RealSubject(String address) {
        this.address = address;
        this.stock = new Hashtable<>();
    }

    public void addStock(String sku, int quantity) {
        this.stock.put(sku, quantity);
    }

    public String getAddress() {
        return address;
    }

    @Override
    public void fulfillOrder(Order order) {
        for (Item item : order.getItemList()) {
            int current = currentInventory(item);
            if (current > 0) {
                this.stock.replace(item.getSku(), current - 1);
                System.out.println("[RealSubject - " + address + "] Item separado e enviado: "
                        + item.getName() + " (SKU: " + item.getSku()
                        + "). Estoque restante: " + (current - 1));
            } else {
                System.out.println("[RealSubject - " + address + "] Sem estoque para: " + item.getName());
            }
        }
    }

    public int currentInventory(Item item) {
        if (stock.containsKey(item.getSku())) {
            return stock.get(item.getSku());
        }
        return 0;
    }
}

class Order {
    private List<Item> itemList;

    public Order() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.itemList.add(item);
    }

    public List<Item> getItemList() {
        return itemList;
    }
}

class Item {
    private String sku;
    private String name;

    public Item(String sku, String name) {
        this.sku = sku;
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }
}
