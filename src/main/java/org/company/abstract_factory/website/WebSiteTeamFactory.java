package org.company.abstract_factory.website;

import org.company.abstract_factory.Developer;
import org.company.abstract_factory.ProductOwner;
import org.company.abstract_factory.ProjectTeamFactory;
import org.company.abstract_factory.Tester;


public class WebSiteTeamFactory implements ProjectTeamFactory {


    @Override
    public Developer getDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProductOwner getProductOwner() {
        return new WebSitePO();
    }
}
