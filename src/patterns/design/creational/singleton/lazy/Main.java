package patterns.design.creational.singleton.lazy;

public class Main {
    public static void main(String[] args) {
        LazyInitializedSingleton obj1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton obj2 = LazyInitializedSingleton.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
