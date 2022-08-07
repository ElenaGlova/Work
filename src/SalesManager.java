import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
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
