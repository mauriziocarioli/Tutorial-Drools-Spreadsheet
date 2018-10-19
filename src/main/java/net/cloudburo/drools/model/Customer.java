package net.cloudburo.drools.model;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.String;

public class Customer implements Serializable {

    private static final long serialVersionUID = -2948084449274181330L;

    private String lifestage;
    private String assets;
    private List<String> customerNeeds = new ArrayList<String>();


    public Customer() {
    }

    public void setLifeStage(String lifestage) {

        this.lifestage = lifestage;
    }

    public String getLifeStage() {

        return lifestage;
    }

    public List<String> getCustomerNeeds() {
        return customerNeeds;
    }

    public void setCustomerNeeds(List<String> customerNeeds) {
        this.customerNeeds = customerNeeds;
    }

    public void addNeed(String need) {

        this.customerNeeds.add(need);
    }

    public void setAssets(String assets) {
        this.assets = assets;
    }

    public String getAssets() {
        return assets;
    }

}
