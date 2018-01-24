package Matma;

public class Matma {

    public static int abs(int x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    public static float abs(float x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    public static int pow(int p, int w) {

        if (w == 0) return 1;

        int wynik = 1;

        for (int i = 0; i < w; i++)
            wynik *= p;

        return wynik;
    }
}
