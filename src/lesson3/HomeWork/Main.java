package lesson3.HomeWork;

public class Main {

    public static void main(String[] args) {
        AddressBook addr = new AddressBook();

        addr.add(112, "ololo");
        addr.add(811,"rolo");
        addr.add(811123,"rolo");

        System.out.println(addr.get("rolo"));



    }

}
