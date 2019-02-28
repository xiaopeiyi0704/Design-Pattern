package Behavior.Strategy;

public class Add implements Strategy {

    public void doOperation(int num1, int num2){
        System.out.println(num1+num2);
    }
}
