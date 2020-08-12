package ru.sbrf.JavaSchool;

public class Lesson3 {

    public static void main(String[] args) throws Exception {
        byte a = 12;
        short b = 23;
        int c = 8;
        int d = 20000004;
        char e = '8';


        System.out.println(sumByteShort(a,b));
        System.out.println(multipleIntLong(c,d));
        System.out.println(getMaxNumber(c,d));
        System.out.println(isCharA(e));
        System.out.println(isCharNumber(e));
        System.out.println(charToInt(e));
        System.out.println(intToChar(c));
        toBinaries();
        maxToBinaries();
    }

    public static byte sumByteShort (byte a, short b) {
        int c = a + b;
        return (byte) c;
    }

    public static int multipleIntLong (int a, long b) {
        return (int) (a*b);
    }

    public static int getMaxNumber(int a, int b) {
        return a>b ? a : b;
    }

    public static boolean isCharA(char a) {
        return a=='A';
    }

    public static boolean isCharNumber(char a) {
        /* switch (a) {
            case ('0'):
            case ('1'):
            case ('2'):
            case ('3'):
            case ('4'):
            case ('5'):
            case ('6'):
            case ('7'):
            case ('8'):
            case ('9'):
                return true;
            default:
                return false;
        } */
        return a>=48&&a<=57;
    }

    public static void toBinaries() {
        for (int i=0; i<31; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }

    public static void maxToBinaries() {
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE+1));
    }

    public static int charToInt (char a) {
        return (int) a;
    }

    public static char intToChar (int a) {
        return (char) a;
    }

}
