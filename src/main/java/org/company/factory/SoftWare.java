package org.company.factory;

import static org.company.factory.ProgrammingLanguage.JAVA;

public class SoftWare {
    public static void main(String[] args) {
        var developerFactory = createDeveloperFactoryByLanguage(JAVA);
        var developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    private static DeveloperFactory createDeveloperFactoryByLanguage(ProgrammingLanguage programmingLanguage) {
        return switch (programmingLanguage) {
            case JAVA -> new JavaDeveloperFactory();
            case KOTLIN -> new KotlinDeveloperFactory();
        };
    }
}
