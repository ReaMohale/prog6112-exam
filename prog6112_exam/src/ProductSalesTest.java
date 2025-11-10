import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductSalesTest {
    
    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales() {
        // Test data: sales array and sales limit
        int[] sales = {100, 200, 300, 400};
        int salesLimit = 250;
        ProductSales productSales = new ProductSales(sales, salesLimit);
        int expected = 2; // Expect 2 sales over limit (300, 400)
        assertEquals(expected, productSales.GetSalesOverLimit());
    }

    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {
        // Test data: sales array and sales limit
        int[] sales = {100, 200, 300, 400};
        int salesLimit = 250;
        ProductSales productSales = new ProductSales(sales, salesLimit);
        int expected = 2; // Expect 2 sales under limit (100, 200)
        assertEquals(expected, productSales.GetSalesUnderLimit());
    }
}