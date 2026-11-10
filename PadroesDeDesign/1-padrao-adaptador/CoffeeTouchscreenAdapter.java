public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
 public OldCoffeeMachine oldCoffeeMachine;
 public void chooseFirstSelection(){
     oldCoffeeMachine.selectA();
 }
 public void chooseSecondSelection(){
     oldCoffeeMachine.selectB();

 }
}
