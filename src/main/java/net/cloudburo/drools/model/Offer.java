package net.cloudburo.drools.model;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.String;

public class Offer implements Serializable {

    private static final long serialVersionUID = -1107826986980812417L;

    private String financialPackage;
    private List<String> products = new ArrayList<String>();
    private int discount;


    public Offer() {
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setFinancialPackage(String financialPackage) {
        this.financialPackage = financialPackage;
    }

    public String getFinancialPackage() {
        return financialPackage;
    }

    public List<String> getProducts() {
        return products;
    }

    public void addSingleProduct(String prod){
        products.add(prod);
    }

}
