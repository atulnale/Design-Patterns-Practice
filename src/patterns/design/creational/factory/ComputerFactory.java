package patterns.design.creational.factory;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram,cpu,hdd);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram,cpu,hdd);

        return null;
    }
}
