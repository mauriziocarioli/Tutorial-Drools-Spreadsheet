package net.cloudburo.drools.model;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public class Customer implements Serializable {

    private static final long serialVersionUID = -2948084449274181330L;

    public enum CustomerNeed {
        SAVINGACCOUNT,
        LIFEINSURANCE,
        DIGITALBANKING,
        STUDENTLOAN,
        MORTAGE
    }

    public enum CustomerLifeStage {
        GETTINGSTARTED,
        CAREERFOCUSED,
        ADVICEFAMILY,
        EMPTYNESTER,
        GOLDENYEARS,
        BUSINESS
    }

    public enum CustomerAssets {
        TO50K,
        FROM50KTO150K,
        FROM150KTO300K,
        OVER300K
    }

    private CustomerLifeStage lifestage;
    private CustomerAssets assets;
    private List<CustomerNeed> customerNeeds = new ArrayList<>();


    public Customer() {
        super();
    }

    public void setLifeStage(CustomerLifeStage lifestage) {

        this.lifestage = lifestage;
    }

    public CustomerLifeStage getLifeStage() {

        return lifestage;
    }

    public void addNeed(CustomerNeed need) {

        customerNeeds.add(need);
    }

    public List<CustomerNeed> getNeeds() {
        return customerNeeds;
    }

    public void setAssets(CustomerAssets assets) {
        this.assets = assets;
    }

    public CustomerAssets getAssets() {
        return assets;
    }

}
