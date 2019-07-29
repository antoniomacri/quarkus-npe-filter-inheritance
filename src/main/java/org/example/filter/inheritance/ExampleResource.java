package org.example.filter.inheritance;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/test")
public class ExampleResource {

    @GET
    @Path("/father")
    @Produces(MediaType.TEXT_PLAIN)
    public String father() {
        return "OK";
    }


    @GET
    @Path("/son")
    @Produces(MediaType.TEXT_PLAIN)
    public String son() {
        return "OK";
    }
}
