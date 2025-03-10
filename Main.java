//Natasya Alfanisa Thomas
//245160407111088
public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan("PT. Inovasi Teknologi");

        try {
            // Membuat objek karyawan reguler
            Karyawan karyawan = new Karyawan("Budi", 5000000, perusahaan);
            
            // Membuat objek programmer
            Programmer programmer = new Programmer("Anakin", 6500000, perusahaan, 2000000);
            
            // Membuat objek manager
            Manager manager = new Manager("Reyhan", 8000000, perusahaan, 3500000, "IT");

            // Menampilkan informasi lengkap karyawan
            System.out.println("INFORMASI LENGKAP KARYAWAN:");
            karyawan.info();
            programmer.info();
            manager.info();
            
            // Menampilkan informasi gaji karyawan
            System.out.println("INFORMASI GAJI KARYAWAN:");
            karyawan.infoGaji();
            programmer.infoGaji();
            manager.infoGaji();
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
