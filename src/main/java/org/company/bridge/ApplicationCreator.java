package org.company.bridge;

import java.util.Arrays;

public class ApplicationCreator {
    public static void main(String[] args) {
        Application[] apps = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new KotlinDeveloper())
        };
        Arrays.stream(apps).forEach(Application::developApplication);
    }
}
