import java.util.Arrays;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int trimmedMean() {
        int[] copy = sales.clone();
        int a = 0;
        Arrays.sort(copy);
        copy[0] = 0;
        copy[copy.length - 1] = 0;
        for (int i = 0; i < copy.length; i++) {
            a = a + copy[i];
        }
        a = a / (copy.length - 2);
        return a;
    }
}
