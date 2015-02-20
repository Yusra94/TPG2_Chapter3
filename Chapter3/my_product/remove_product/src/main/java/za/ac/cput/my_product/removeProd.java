package za.ac.cput.my_product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by student on 2015/02/20.
 */
public class removeProd {

    Map<Integer, Product> setHashMap = new HashMap<Integer, Product>();

    Product p  = new Product();

    public void initHashMap(Integer prodNum, Product p) {

        setHashMap.put(prodNum, p);

    }

    public Map getInitHashMap() {

        return setHashMap;

    }

    public void removeHashMap(Product p)
    {
        setHashMap.remove(p);
    }

}
