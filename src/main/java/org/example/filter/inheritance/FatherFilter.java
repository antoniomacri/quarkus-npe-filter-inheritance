package org.example.filter.inheritance;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;


@Provider
@ApplicationScoped
public class FatherFilter implements ContainerRequestFilter {
    @Inject
    ExampleService exampleService;


    @Override
    public void filter(ContainerRequestContext requestContext) {
        exampleService.doSomething();
    }
}
