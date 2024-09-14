public class TaxCalculation {
    // Constantes para las tasas de impuestos y el umbral de impuestos
    public static final double TAX_RATE_HIGH = 0.15;
    public static final double TAX_RATE_LOW = 0.10;
    public static final double TAX_THRESHOLD = 50.0;

    public static void main(String[] args) {
        // Arrays para los precios de los productos y sus tasas de impuestos
        double[] productPrices = {100, 200};
        double[] taxRates = {TAX_RATE_HIGH, TAX_RATE_LOW};

        // Variable para almacenar el impuesto total
        double totalTax = 0;

        // Bucle para calcular los impuestos para cada producto
        for (int i = 0; i < productPrices.length; i++) {
            double tax = productPrices[i] * taxRates[i];
            totalTax += tax;
        }

        // Evaluar el impuesto total en comparación con el umbral
        if (totalTax > TAX_THRESHOLD) {
            System.out.println("High total tax: " + totalTax);
        } else {
            System.out.println("Low tax");
        }
    }
}