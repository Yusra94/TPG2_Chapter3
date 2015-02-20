package za.ac.cput.my_product;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by student on 2015/02/20.
 */
public class ProductSellPriceTest {

    private Product p;

    @Before
    public void setUp() throws Exception {

        p = new Product();
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testProductSellPrice() throws Exception {

        Assert.assertEquals("", 23.95f, p.getProductSellPrice(23.95f), 0);

    }
}
