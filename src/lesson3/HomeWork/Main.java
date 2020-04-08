package lesson3.HomeWork;

public class Main {

    public static void main(String[] args) {
        AddressBook addr = new AddressBook();

        addr.add(112, "pizza");
        addr.add(811,"clinic");
        addr.add(811123,"pizza");

        System.out.println(addr.get("pizza"));



    }

}
