package za.ac.cput.Q_2;

/**
 * Created by student on 2015/02/20.
 */

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.Q_2.ImplementWithdraw.WithdrawCashImpl;

public class WithdrawTest {

   WithdrawCashImpl wci;

    @Before
    public void setUp() throws Exception {

            wci = new WithdrawCashImpl();

    }

    @Test
    public void testWithdraw() throws Exception {

        Assert.assertEquals(200.00f, wci.WithdrawMoney(500, 300), 0);


    }
}
