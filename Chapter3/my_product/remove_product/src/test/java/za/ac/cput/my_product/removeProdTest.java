package za.ac.cput.my_product;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2015/02/20.
 */
public class removeProdTest {

    Product p1,p2,p3, p4;
    removeProd rP = new removeProd();

    @Before
    public void setUp() {

        p1 = new Product(12345, "Blue Lace", 230.00f, 28.00f, 350.00f);
        p2 = new Product(11254, "White Cotton", 180.00f, 10.00f, 118.00f);
        p3 = new Product(54321, "Blue Lace", 230.00f, 28.00f, 350.00f);
        p4 = new Product(12345, "Blue Lace", 230.00f, 28.00f, 350.00f);

        rP.initHashMap((p1.getProductNumber(12345)),p1);
        rP.initHashMap((p2.getProductNumber(12345)),p2);
        rP.initHashMap((p3.getProductNumber(54321)),p3);

    }

    @Test
    public void testSetHashMap() throws Exception {

        org.junit.Assert.assertEquals(true, (rP.getInitHashMap().containsKey(12345)));

    }

    @Test
    public void testRemoveHashMap() throws Exception {

        rP.removeHashMap(p2);
        org.junit.Assert.assertEquals(true, (rP.getInitHashMap().containsKey(54321)));

    }
}
