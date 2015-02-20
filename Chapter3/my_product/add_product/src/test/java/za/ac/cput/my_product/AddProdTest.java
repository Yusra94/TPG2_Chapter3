package za.ac.cput.my_product;
import za.ac.cput.my_product.AddProd;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by student on 2015/02/20.
 */
public class AddProdTest {


    Product p1,p2,p3, p4;
    AddProd aP = new AddProd();

    Set<Product> np = new HashSet<Product>();

    @Before
    public void setUp() {

        p1 = new Product(12345, "Blue Lace", 230.00f, 28.00f, 350.00f);
        p2 = new Product(11254, "White Cotton", 180.00f, 10.00f, 118.00f);
        p3 = new Product(12345, "Blue Lace", 230.00f, 28.00f, 350.00f);
        p4 = new Product(12345, "Blue Lace", 230.00f, 28.00f, 350.00f);

        aP.initSet(p1);
        aP.initSet(p2);
        aP.initSet(p3);

    }


    @Test
    public void testAddProd() throws Exception {

        Assert.assertEquals(true, (aP.getInitSet().contains(p2)));

    }

}
