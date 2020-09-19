package wunder.jan.probeklausur.aufgaben.fünf;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        RingFeld feld = new RingFeld(10);
        feld.set(19, 5);
        System.out.println(Arrays.toString(feld.getArr()));

        int i = 300;
        i = i - 200;


    }

}