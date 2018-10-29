/*
 * NAMA       : Nur Ihsan Muhammad Iqbal S
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117067
 * DESKRIPSI PROGRES : Program ini berisi program untuk menampilkan hasil
                       Data Living Thing.
 */
package pbo2.pkg10117067.latihan62.livingthing;

/**
 *
 * @author Ihsanmi
 */
public class PBO210117067Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human nHuman = new Human();
        nHuman.setNama("Ihsan Muhammad Iqbal");
        nHuman.walk(nHuman.getNama());       
        nHuman.breath("Ihsan Muhammad Iqbal");
        nHuman.eat("Ihsan Muhammad Iqbal");
    }
    
}