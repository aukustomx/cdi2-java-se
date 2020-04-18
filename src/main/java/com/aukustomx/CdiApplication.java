package com.aukustomx;

import com.aukustomx.service.CdiService;
import org.jboss.weld.environment.se.bindings.Parameters;
import org.jboss.weld.environment.se.events.ContainerInitialized;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

public class CdiApplication {

    private final CdiService cdiService;

    @Inject
    public CdiApplication(CdiService cdiService) {
        this.cdiService = cdiService;
    }

    public void onEvent(@Observes ContainerInitialized event, @Parameters String[] args) {
        cdiService.logArguments(args);
    }
}
