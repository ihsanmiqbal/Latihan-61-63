/*
 *NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program kelas untuk menampilkan data
                       Kerucut.
 */
package pbo2.pkg10117067.latihan61.bangunruang;

/**
 *
 * @author Ihsanmi
 */
public class Kerucut extends BangunRuang {
    private double t;
    private double r;

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double hitungVolume() {
        return (1 * 22 * r * r * t)/ 7 / 3;
    }
    
    
}