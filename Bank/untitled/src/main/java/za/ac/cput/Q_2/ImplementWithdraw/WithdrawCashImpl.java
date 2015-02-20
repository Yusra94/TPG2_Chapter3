package za.ac.cput.Q_2.ImplementWithdraw;

import za.ac.cput.Q_2.WithdrawCash;

/**
 * Created by student on 2015/02/20.
 */
public class WithdrawCashImpl implements WithdrawCash{

    @Override
    public float WithdrawMoney(float balance, float amount )
    {
        return  balance - amount;
    }
}
