package kalkulatorku;

public class Kalkulator {

    public static double tambah(double a, double b) {
        return a + b;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException(
                "Tidak bisa dibagi dengan nol!"
            );
        }
        return a / b;
    }

    public static double luasPersegi(double sisi) {
        return sisi * sisi;
    }
}
