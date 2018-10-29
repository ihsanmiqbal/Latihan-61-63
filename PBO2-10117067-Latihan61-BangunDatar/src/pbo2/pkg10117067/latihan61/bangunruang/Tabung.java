/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Tabung.
 */
package pbo2.pkg10117067.latihan61.bangunruang;

/**
 *
 * @author Ihsanmi
 */
public class Tabung extends BangunRuang {
    private double r;
    private double h;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double hitungVolume() {
       return (22 * r * r * h)/ 7;
    
    }
}