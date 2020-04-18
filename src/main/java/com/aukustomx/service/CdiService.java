package com.aukustomx.service;

import org.apache.logging.log4j.Logger;

import javax.enterprise.inject.Any;
import javax.inject.Inject;
import java.util.Arrays;

public class CdiService {

    @Any
    @Inject
    private Logger logger;

    public void logArguments(final String[] args) {
        logger.info(Arrays.asList(args).toString());
        logger.info("Lazy... {}", () -> "evaluation");
    }
}
