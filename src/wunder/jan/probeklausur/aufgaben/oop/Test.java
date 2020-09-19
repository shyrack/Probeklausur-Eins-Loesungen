package wunder.jan.probeklausur.aufgaben.oop;

public class Test {

    public static void main(String[] args) {

        Tier hund = new Tier("Gustav", 40);
        Tier ratte = new Tier("Bernd", 20);

        hund.feed();
        System.out.println(hund.getWeight());
        System.out.println(ratte.getWeight());

    }

}
