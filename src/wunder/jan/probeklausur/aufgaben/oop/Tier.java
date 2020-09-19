package wunder.jan.probeklausur.aufgaben.oop;

public class Tier {

    // Attribute
    private String name;
    private int weight;

    // Konstruktor
    public Tier(String name, int weight) {

        this.weight = weight;
        this.name = name;
    }

    // Getter
    public int getWeight() {

        return this.weight;
    }

    // Setter
    public void setWeight(int weight) {

        this.weight = weight;
    }

    // Methode
    public void feed() {

        this.weight = this.weight + 5;
    }

}