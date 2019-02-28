package Creation.Singleton;

public class SingletonDriver {

    public static void main(String[] args){
        EagerSingleton es= EagerSingleton.getEagerSingletonInstance();
        es.sayHello();

        System.out.println();

        LazySingleton ls= LazySingleton.getLazySingletonInstance();
        es.sayHello();
    }

}
