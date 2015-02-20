package za.ac.cput.my_product;

/**
 * Created by student on 2015/02/20.
 */
public class Product {

    int productNumber;
    String productDescription;
    float productCost;
    float productMarkUp;
    float productSellPrice;

    public Product() {
    }

    public Product(int productNumber, String productDescription, float productCost, float productMarkUp, float productSellPrice) {
        this.productNumber = productNumber;
        this.productDescription = productDescription;
        this.productCost = productCost;
        this.productMarkUp = productMarkUp;
        this.productSellPrice = productSellPrice;
    }

    public int getProductNumber(int prodNum) {
        return productNumber = prodNum;
    }

    public String getProductDescription(String prodDesc) {
        return productDescription = prodDesc;
    }

    public float getProductCost(float prodCost) {
        return productCost = prodCost;
    }

    public float getProductMarkUp(float prodMakUp) {
        return productMarkUp = prodMakUp;
    }

    public float getProductSellPrice(float prodSellPrice) {
        return productSellPrice = prodSellPrice;
    }
}
