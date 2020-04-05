package lesson3.HomeWork;

public class Main {

    public static void main(String[] args) {
        AddressBook addr = new AddressBook();

        addr.add("pizza", 1112);
        addr.add("ololo", 1112);

        System.out.println(addr.get(1112));



    }

}
