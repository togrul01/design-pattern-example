package org.company.abstract_factory.banking;

import org.company.abstract_factory.ProductOwner;
import org.company.abstract_factory.ProjectTeamFactory;
import org.company.abstract_factory.Tester;
import org.company.abstract_factory.Developer;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProductOwner getProductOwner() {
        return new BankingPO();
    }
}
