
public class main{
    public static void main(String[] args){

        WebPage mypage = new BasicWebPage();
        mypage = new AuthorizedWebPage(mypage);
        mypage = new AuthenticatedWebPage(mypage);
        mypage.display();

    }
}

interface WebPage {
    public void display();
}

class BasicWebPage implements WebPage {

    public String html = "....";
    public String styleSheet = "...";
    public String script = "...";

    public void display(){

    }

}

abstract class WebPageDecorator implements WebPage {
    protected WebPage paga;

    public WebPageDecorator(WebPage webPage){
        this.paga = webPage;
    }

    public void display(){
        this.paga.display();
    }
}

class AuthorizedWebPage extends WebPageDecorator {
    public AuthorizedWebPage(WebPage decoratedPage){
        super(decoratedPage);
    }
    public void aothorizedUser(){
        System.out.println("Authorizing user");
    }
    public void display() {
        super.display();
        this.aothorizedUser();
    }
}

class AuthenticatedWebPage extends WebPageDecorator{
    public AuthenticatedWebPage(WebPage WebPageDecorator){
        super(WebPageDecorator);
    }
    public void authenticateUser(){
        System.out.println("authenticating user");
    }

    public void display(){
        super.display();
        this.authenticateUser();
    }
}
