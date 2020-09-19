package wunder.jan.probeklausur.aufgaben.zwei;

public class AufgabeZwei {

    public static int negZeilen(int[][] arr) {

        int negCount = 0;

        for (int i = 0; i < arr.length; i++) { // Zeilen

            for (int k = 0; k < arr[i].length; k++) { // Spalten

                if (arr[i][k] < 0) {

                    negCount++;
                    break;
                }

            }

        }

        return negCount;
    }

}