public class Manager extends Karyawan {
    private double insentif;
    private String divisi;
    
    public Manager(String nama, int gajiPokok, Perusahaan perusahaan, double insentif, String divisi) {
        super(nama, gajiPokok, perusahaan);
        this.insentif = insentif;
        this.divisi = divisi;
    }
    
    public double getInsentif() {
        return insentif;
    }
    
    public void setInsentif(double insentif) {
        this.insentif = insentif;
    }
    
    public String getDivisi() {
        return divisi;
    }
    
    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }
    
    @Override
    public double hitungGaji() {
        return getGajiPokok() + insentif;
    }
    
    @Override
    public void info() {
        System.out.println("Nama Manager: " + getNama());
        System.out.println("Divisi: " + divisi);
        System.out.println("Gaji Pokok: " + Util.formatRupiah(getGajiPokok()));
        System.out.println("Insentif: " + Util.formatRupiah(insentif));
        System.out.println("Perusahaan: " + getPerusahaan().getNamaPerusahaan());
        System.out.println();
    }
}
