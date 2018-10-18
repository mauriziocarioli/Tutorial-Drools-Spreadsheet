package net.cloudburo.drools.model;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Offer implements Serializable {

    private static final long serialVersionUID = -1107826986980812417L;

    public enum Product {
        LOAN,
        SUPERLOAN,
        INSURANCE
    }

    public enum ProductPackage {
        GETTINGSTARTED_PACKAGE,
        CAREERFOCUSED_PACKAGE,
        ADVICEFAMILY_PACKAGE,
        EMPTYNESTER_PACKAGE,
        GOLDENYEARS_PACKAGE,
        BUSINESS_PACKAGE
    }

    private ProductPackage financialPackage;
    private List<Product> products = new ArrayList();
    private int discount;


    public Offer() {
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setFinancialPackage(ProductPackage financialPackage) {
        this.financialPackage = financialPackage;
    }

    public ProductPackage getFinancialPackage() {
        return financialPackage;
    }

    public void addSingleProduct(Product prod){
        products.add(prod);
    }

    public List<Product> getProducts() {
        return products;
    }

}
