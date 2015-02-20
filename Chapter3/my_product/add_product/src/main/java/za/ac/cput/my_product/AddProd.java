package za.ac.cput.my_product;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by student on 2015/02/20.
 */
public class AddProd {

    Set<Product> setTest = new HashSet<Product>();

    public void initSet(Product p) {

        setTest.add(p);

    }

    public Set<Product> getInitSet() {

        return setTest;

    }



}
