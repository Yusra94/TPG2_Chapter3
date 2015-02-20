package za.ac.cput.Q_2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Q_2.ImplementDeposit.DepositCashImpl;

/**
 * Created by student on 2015/02/20.
 */
public class DepositTest {

    DepositCashImpl dpi;
    @Before
    public void setUp() throws Exception {

        dpi = new DepositCashImpl();

    }

    @Test
    public void testDeposit() throws Exception {

        Assert.assertEquals(500.00f,dpi.depositMoney(400.00f, 100.00f),0);

    }
}
