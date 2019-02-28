package Creation.Singleton;

public class LazySingleton {

    private static LazySingleton lazySingletonInstance;
    private LazySingleton(){
        System.out.println("in LazySingleton constructor.");
    }

    public static LazySingleton getLazySingletonInstance(){
        if(lazySingletonInstance==null){
            lazySingletonInstance=new LazySingleton();
        }

        return lazySingletonInstance;
    }

    public void sayHello(){
        System.out.println("Hello World, LazySingleton!");
    }
}
