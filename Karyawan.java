public class Karyawan {
    private String nama;
    private int gajiPokok;
    private Perusahaan perusahaan;

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

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void info() {
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Gaji Pokok: Rp " + gajiPokok);
        System.out.println("Perusahaan: " + perusahaan.getNamaPerusahaan());
        System.out.println();
    }
}
