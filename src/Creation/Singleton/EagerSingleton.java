package Creation.Singleton;

public class EagerSingleton {

    private static EagerSingleton eagerSingletonInstance=new EagerSingleton();

    private EagerSingleton(){
        System.out.println("in EagerSingleton constructor.");
    }

    public static EagerSingleton getEagerSingletonInstance(){
        return eagerSingletonInstance;
    }

    public void sayHello(){
        System.out.println("Hello World, EagerSingleton!");
    }
}
