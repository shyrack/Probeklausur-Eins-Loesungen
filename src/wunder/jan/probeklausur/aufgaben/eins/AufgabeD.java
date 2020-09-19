package wunder.jan.probeklausur.aufgaben.eins;

import javax.swing.*;

public class AufgabeD {

    public static void test() {

        try {

            int i = Integer.parseInt(JOptionPane.showInputDialog("Zahl eingeben"));

        } catch (NumberFormatException e) {

            System.out.println("Fehler!");
        }

    }

}