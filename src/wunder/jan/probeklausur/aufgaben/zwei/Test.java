package wunder.jan.probeklausur.aufgaben.zwei;

public class Test {

    public static void main(String[] args) {

        int[][] test = new int[5][4];
        test[3][3] = -5;
        test[3][2] = -4;

        System.out.println(AufgabeZwei.negZeilen(test));

    }

}