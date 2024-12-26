package org.company.bridge;

public class StockExchange extends Application {
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developApplication() {
        System.out.println("Developing Stock Exchange Application");
        getDeveloper().writeCode();
    }

}
