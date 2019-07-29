package org.example.filter.inheritance;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.ext.Provider;


@Provider
@ApplicationScoped
public class SonFilter extends FatherFilter {
    @Inject
    ExampleService exampleService;


    @Override
    public void filter(ContainerRequestContext requestContext) {
        exampleService.doSomething();
    }
}
