package org.company.abstract_factory.website;

import org.company.abstract_factory.Developer;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Python developer writes Python code...");
    }
}
