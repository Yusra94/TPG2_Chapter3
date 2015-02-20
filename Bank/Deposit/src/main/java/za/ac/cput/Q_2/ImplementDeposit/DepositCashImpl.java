package za.ac.cput.Q_2.ImplementDeposit;

import za.ac.cput.Q_2.DepositCash;

/**
 * Created by student on 2015/02/20.
 */
public class DepositCashImpl implements DepositCash{

    @Override

    public float depositMoney(float balance, float amount )
    {
        return amount = balance + amount;
    }
}
