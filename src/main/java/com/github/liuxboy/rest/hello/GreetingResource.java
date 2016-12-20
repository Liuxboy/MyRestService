package com.github.liuxboy.rest.hello;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Component
@Path("services")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public class GreetingResource {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GET
    @Path("/greeting/getGreeting/")
    public Greeting getGreeting(@QueryParam(value="name") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }

    @POST
    @Path("/greeting/postGreeting/")
    public Greeting postGreeting(PostGreet postGreet) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, postGreet.getName()));
    }
}
