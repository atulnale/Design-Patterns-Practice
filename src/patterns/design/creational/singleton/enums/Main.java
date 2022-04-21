package patterns.design.creational.singleton.enums;

public class Main {
    public static void main(String[] args) {
        EnumSingleton obj1 = EnumSingleton.INSTANCE;
        EnumSingleton obj2 = EnumSingleton.INSTANCE;
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
