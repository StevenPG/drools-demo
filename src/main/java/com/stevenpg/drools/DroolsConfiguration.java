package com.stevenpg.drools;

import org.kie.api.builder.KieFileSystem;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import java.io.IOException;

@Configuration
public class DroolsConfiguration {

    public KieFileSystem kieFileSystem() throws IOException {
        KieFileSystem kieFileSystem = getKieServices().newKieFileSystem();
        for (Resource file : getRuleFiles()) {
            kieFileSystem.write(
                    ResourceFactory.newClassPathResource(
                            RULES_PATH + file.getFilename(), "UTF-8"));
        }
        return kieFileSystem;
    }

}
