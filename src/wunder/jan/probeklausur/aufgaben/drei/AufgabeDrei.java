package wunder.jan.probeklausur.aufgaben.drei;

import java.util.NoSuchElementException;

public class AufgabeDrei {

    public static int getSingleElement(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int element = arr[i];
            int elementCount = 0;

            for (int k = 0; k < arr.length; k++) {

                if (arr[k] == element) {

                    elementCount++;
                }
            }

            if (elementCount == 1) {

                return arr[i];
            }
        }

        throw new NoSuchElementException();
    }

}