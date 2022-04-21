package patterns.design.creational.singleton.static_block;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance ;
    static {
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private StaticBlockSingleton(){
    }
    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
