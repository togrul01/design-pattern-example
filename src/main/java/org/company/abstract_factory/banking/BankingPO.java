package org.company.abstract_factory.banking;

import org.company.abstract_factory.ProductOwner;

public class BankingPO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("Banking PO manages products...");
    }
}
