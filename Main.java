//Natasya Alfanisa Thomas
//245160407111088
public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan("PT. Inovasi Teknologi");

        try {
            Karyawan karyawan1 = new Karyawan("Budi", 5000000, perusahaan);
            Karyawan karyawan2 = new Karyawan("Anakin", 6500000, perusahaan);
            Karyawan karyawan3 = new Karyawan("Rudi", 5500000, perusahaan);

            System.out.println("Informasi Karyawan:");
            karyawan1.info();
            karyawan2.info();
            karyawan3.info();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}