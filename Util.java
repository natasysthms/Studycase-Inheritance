import java.text.NumberFormat;
import java.util.Locale;

public class Util {
    private static final NumberFormat currencyFormatter = NumberFormat.getNumberInstance(new Locale("id", "ID"));
    
    public static String formatRupiah(double amount) {
        return "Rp " + currencyFormatter.format(amount);
    }
}
