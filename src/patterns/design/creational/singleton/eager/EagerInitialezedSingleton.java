package patterns.design.creational.singleton.eager;

public class EagerInitialezedSingleton {
    private static final EagerInitialezedSingleton instance = new EagerInitialezedSingleton();
    private EagerInitialezedSingleton(){
    }
    public EagerInitialezedSingleton getInstance() {
        return instance;
    }
}
