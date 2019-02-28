package Behavior.Strategy;

public class Context {

    Strategy strategy;

    /*public Context(Strategy s){
        this.strategy=s;
    }*/

    public void execute(int num1, int num2){
        strategy.doOperation(num1, num2);
    }
}
