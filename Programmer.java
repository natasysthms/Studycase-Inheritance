public class Programmer extends Karyawan {
    private double bonus;
    
    public Programmer(String nama, int gajiPokok, Perusahaan perusahaan, double bonus) {
        super(nama, gajiPokok, perusahaan);
        this.bonus = bonus;
    }
    
    public double getBonus() {
        return bonus;
    }
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
    public double hitungGaji() {
        return getGajiPokok() + bonus;
    }
    
    
    public void info() {
        System.out.println("Nama Programmer: " + getNama());
        System.out.println("Gaji Pokok: Rp " + currencyFormatter.format(getGajiPokok()));
        System.out.println("Bonus: Rp " + currencyFormatter.format(bonus));
        System.out.println("Perusahaan: " + getPerusahaan().getNamaPerusahaan());
        System.out.println();
    }
}