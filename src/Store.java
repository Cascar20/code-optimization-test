public class Store {
    // Constantes para los precios de los productos
    public static final int PRICE_PRODUCT_1 = 15;
    public static final int PRICE_PRODUCT_2 = 10;
    public static final int PRICE_PRODUCT_3 = 5;

    // Constantes para las cantidades de productos vendidos
    public static final int QUANTITY_PRODUCT_1 = 2;
    public static final int QUANTITY_PRODUCT_2 = 3;
    public static final int QUANTITY_PRODUCT_3 = 4;

    // Umbral para determinar el rendimiento de las ventas
    public static final int SALES_THRESHOLD = 50;

    public static void main(String[] args) {
        // Arrays para almacenar precios y cantidades de productos
        int[] prices = {PRICE_PRODUCT_1, PRICE_PRODUCT_2, PRICE_PRODUCT_3};
        int[] quantities = {QUANTITY_PRODUCT_1, QUANTITY_PRODUCT_2, QUANTITY_PRODUCT_3};

        int totalSales = 0;

        // Bucle para calcular las ventas totales
        for (int i = 0; i < prices.length; i++) {
            totalSales += prices[i] * quantities[i];
        }

        // Evaluar el rendimiento de las ventas
        if (totalSales > SALES_THRESHOLD) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}

