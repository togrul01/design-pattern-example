package org.company.abstract_factory;


import org.company.abstract_factory.banking.BankingTeamFactory;
import org.company.abstract_factory.website.WebSiteTeamFactory;

public class BankingApp {
    public static void main(String[] args) {
        var projectTeamFactory = new WebSiteTeamFactory();
        var developer = projectTeamFactory.getDeveloper();
        var tester = projectTeamFactory.getTester();
        var po = projectTeamFactory.getProductOwner();

        System.out.println("Creating banking system...");
        developer.writeCode();
        tester.testCode();
        po.manageProduct();
    }

}
