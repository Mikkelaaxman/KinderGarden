package project.kindergarden;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import project.kindergarden.controllers.resources.ChildResource;

@Component
public class JerseyConfiguration extends ResourceConfig {
    public JerseyConfiguration() {
        register(ChildResource.class);
    }
}