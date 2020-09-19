package wunder.jan.probeklausur.aufgaben.vier;

public class AufgabeVier {

    public double sqrt(double n) {

        double z = n / 2;
        double r = n / z;

        while (!(Math.abs(z - r) < (Math.pow(10, -6) * n))) {

            z = (z + r) / 2;
            r = n / z;
        }

        return z;
    }

}