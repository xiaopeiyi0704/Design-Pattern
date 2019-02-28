package Behavior.Strategy;

//创建一个interface有一个动作
//创建几个class implements interface
//创建一个统一的类和方法来执行interface的动作，根据需要来决定哪一个类动作
public class Driver {

    public static void main(String[] args){

        Context context=new Context();
        context.strategy=new Add();
        context.execute(5,5);

        context.strategy=new Substract();
        context.execute(5,5);


    }
}
