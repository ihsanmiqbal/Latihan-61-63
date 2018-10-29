/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Bola.
 */
package pbo2.pkg10117067.latihan61.bangunruang;

/**
 *
 * @author Ihsanmi
 */
public class Bola extends BangunRuang {
    private double r;

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double hitungVolume() {
        return (4 * 22 * r * r * r) / 7/ 3;
    }
}