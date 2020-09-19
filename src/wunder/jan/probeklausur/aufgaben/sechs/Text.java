package wunder.jan.probeklausur.aufgaben.sechs;

public class Text {

    private String text;

    public Text(String s) {

        this.text = s;
    }

    public char getCharAt(int n) {

        char[] textArr = this.text.toCharArray();

        if (n < 0) {

            return textArr[textArr.length + n];
        } else {

            return textArr[n];
        }
    }

    public int getPos(char c, int n) {

        int count = 0;
        char[] textArr = this.text.toCharArray();

        for (int i = 0; i < textArr.length; i++) {

            if (textArr[i] == c) {

                count++;
            }

            if (count == n) {

                return i;
            }
        }

        throw new ArrayIndexOutOfBoundsException();
    }

    public int getCount(char c) {

        int count = 0;
        char[] textArr  = this.text.toCharArray();

        for (char x : textArr) {

            if (x == c) {

                count++;
            }
        }

        return count;
    }

}