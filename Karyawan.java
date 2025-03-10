import java.text.NumberFormat;
import java.util.Locale;

public class Karyawan {
    private String nama;
    private int gajiPokok;
    private Perusahaan perusahaan;
    
    // NumberFormat untuk memformat angka mata uang
    protected static final NumberFormat currencyFormatter = NumberFormat.getNumberInstance(new Locale("id", "ID"));

    public Karyawan(String nama, int gajiPokok, Perusahaan perusahaan) {
        setNama(nama);
        this.gajiPokok = gajiPokok;
        this.perusahaan = perusahaan;
    }

    public void setNama(String nama) {
        if (nama == null || nama.length() < 4) {
            throw new IllegalArgumentException("Nama harus minimal 4 karakter");
        }
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }
    
    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    public double hitungGaji() {
        return gajiPokok;
    }
    
    public void infoGaji() {
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Total Gaji: Rp " + currencyFormatter.format(hitungGaji()));
    }

    public void info() {
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Gaji Pokok: Rp " + currencyFormatter.format(gajiPokok));
        System.out.println("Perusahaan: " + perusahaan.getNamaPerusahaan());
        System.out.println();
    }
}
