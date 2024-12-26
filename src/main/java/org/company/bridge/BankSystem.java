package org.company.bridge;

public class BankSystem extends Application{

    public BankSystem(Developer developer) {
        super(developer);
    }
    @Override
    public void developApplication() {
        System.out.println("Developing Bank System Application");
      getDeveloper().writeCode();
    }
}
