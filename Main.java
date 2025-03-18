public class Main {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan("PT. Inovasi Teknologi");

        try {
            
            Karyawan karyawan = new Karyawan("Budi", 5000000, perusahaan);
            
         
            Programmer programmer = new Programmer("Anakin", 6500000, perusahaan, 2000000);
            
         
            Manager manager = new Manager("Reyhan", 8000000, perusahaan, 3500000, "IT");


            System.out.println("INFORMASI LENGKAP KARYAWAN:");
            karyawan.info();
            programmer.info();
            manager.info();

            System.out.println("INFORMASI GAJI KARYAWAN:");
            karyawan.infoGaji();
            programmer.infoGaji();
            manager.infoGaji();
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
