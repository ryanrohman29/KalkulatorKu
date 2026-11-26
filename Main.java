
import kalkulatorku.Kalkulator;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== KALKULATORKU ===");

        System.out.println("Penjumlahan: "
                + Kalkulator.tambah(10, 5));

        System.out.println("Pengurangan: "
                + Kalkulator.kurang(10, 5));

        System.out.println("Perkalian: "
                + Kalkulator.kali(10, 5));

        System.out.println("Pembagian: "
                + Kalkulator.bagi(10, 5));

        System.out.println("Luas Persegi: "
                + Kalkulator.luasPersegi(5));
    }
}
