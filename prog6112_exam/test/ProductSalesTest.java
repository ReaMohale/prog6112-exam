/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import javax.lang.model.SourceVersion;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_Lab
 */
public class ProductSalesTest {
    
    public ProductSalesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TotalSales method, of class ProductSales.
     */
    @Test
    public void testTotalSales() {
        System.out.println("TotalSales");
        int[][] productSales = null;
        ProductSales instance = new ProductSales();
        int expResult = 0;
        int result = instance.TotalSales(productSales);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AverageSales method, of class ProductSales.
     */
    @Test
    public void testAverageSales() {
        System.out.println("AverageSales");
        int[][] productSales = null;
        ProductSales instance = new ProductSales();
        double expResult = 0.0;
        double result = instance.AverageSales(productSales);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MaxSale method, of class ProductSales.
     */
    @Test
    public void testMaxSale() {
        System.out.println("MaxSale");
        int[][] productSales = null;
        ProductSales instance = new ProductSales();
        int expResult = 0;
        int result = instance.MaxSale(productSales);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MinSale method, of class ProductSales.
     */
    @Test
    public void testMinSale() {
        System.out.println("MinSale");
        int[][] productSales = null;
        ProductSales instance = new ProductSales();
        int expResult = 0;
        int result = instance.MinSale(productSales);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSupportedSourceVersion method, of class ProductSales.
     */
    @Test
    public void testGetSupportedSourceVersion() {
        System.out.println("getSupportedSourceVersion");
        ProductSales instance = new ProductSales();
        SourceVersion expResult = null;
        SourceVersion result = instance.getSupportedSourceVersion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
