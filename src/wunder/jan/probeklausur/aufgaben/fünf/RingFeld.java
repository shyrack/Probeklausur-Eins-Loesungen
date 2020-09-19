package wunder.jan.probeklausur.aufgaben.fünf;

public class RingFeld {

    private int[] arr;

    public RingFeld(int size) {

        if (size <= 0) {

            throw new ArrayIndexOutOfBoundsException();
        } else {

            this.arr = new int[size];
        }

    }

    public int get(int pos) {

        if (pos < 0) {

            throw new ArrayIndexOutOfBoundsException();
        }

        int realIndex = pos;

        while ((realIndex - this.arr.length) >= 0) {

            realIndex = realIndex - this.arr.length;
        }

        return this.arr[realIndex];
    }

    public void set(int pos, int val) {

        if (pos < 0) {

            throw new ArrayIndexOutOfBoundsException();
        }

        int realIndex = pos;

        while ((realIndex - this.arr.length) >= 0) {

            realIndex = realIndex - this.arr.length;
        }

        this.arr[realIndex] = val;
    }

    public int[] getArr() {

        return this.arr;
    }

}