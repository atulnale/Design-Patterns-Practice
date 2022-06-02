package patterns.design.creational.builder;

public class Client {
    public static void main(String[] args) {
        Sandwich sandwich = Sandwich.getBuilder()
                .setNoOfOnions(12)
                .setNoOfPickels(3)
                .setNoOfBeads(11)
                .build();
        System.out.println(sandwich.toString());

    }
}
