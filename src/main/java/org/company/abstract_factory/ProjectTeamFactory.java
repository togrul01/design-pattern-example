package org.company.abstract_factory;

import org.company.abstract_factory.website.PythonDeveloper;

public interface ProjectTeamFactory {
    Developer getDeveloper();

    Tester getTester();

    ProductOwner getProductOwner();
}
