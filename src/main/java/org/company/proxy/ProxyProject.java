package org.company.proxy;

import java.util.logging.Logger;


public class ProxyProject implements Project {
    private static final Logger logger = Logger.getLogger(ProxyProject.class.getName());
    private final String url;
    private RealProject realProject;

    public ProxyProject(String url) {
        this.url = url;
        logger.info("ProxyProject created with URL: " + url);
    }

    @Override
    public void run() {
        if (realProject == null) {
            logger.info("Initializing RealProject with URL: " + url);
            realProject = new RealProject(url);
        }
        logger.info("Running RealProject");
        realProject.run();
    }
}

