package org.company.abstract_factory.website;

import org.company.abstract_factory.ProductOwner;

public class WebSitePO implements ProductOwner {
    @Override
    public void manageProduct() {
        System.out.println("WebSitePO manages website project...");
    }
}
