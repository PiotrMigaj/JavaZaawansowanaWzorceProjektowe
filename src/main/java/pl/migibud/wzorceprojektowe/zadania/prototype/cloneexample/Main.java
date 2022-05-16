package pl.migibud.wzorceprojektowe.zadania.prototype.cloneexample;

public class Main {



    public static void main(String[] args) {
        Address address1 = new Address("Ig Chrz","Wrocąłw","Polska");
        Address address2 = address1.copy();

        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address1==address2);
        System.out.println(address1.equals(address2));

        User user1 = new User("Piotr","Migaj",address1);
        User user2 = user1.copy();

        System.out.println();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user1==user2);
        System.out.println(user1.equals(user2));

        Address user2address1 = user2.getAddress();
        System.out.println();
        System.out.println(address1);
        System.out.println(user2address1==address1);
        System.out.println(user2address1.equals(address1));

        System.out.println();
        Address address3 = address1.clone();
        System.out.println(address3==address1);

        System.out.println();
        User user3 = user1.clone();

        System.out.println(user3==user1);


    }

}
