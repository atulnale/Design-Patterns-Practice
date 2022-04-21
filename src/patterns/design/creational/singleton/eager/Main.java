package patterns.design.creational.singleton.eager;

public class Main {
    public static void main(String[] args) {
        EagerInitialezedSingleton obj1 = EagerInitialezedSingleton.getInstance();
        EagerInitialezedSingleton obj2 = EagerInitialezedSingleton.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
