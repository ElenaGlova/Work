public class Main {
    public static void main(String[] args) {
        int[] sales = {2, 3, 4, 5};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
    }
}
