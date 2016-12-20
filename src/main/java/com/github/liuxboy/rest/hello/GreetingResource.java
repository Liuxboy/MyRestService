package com.github.liuxboy.rest.hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Component
@Path("services")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
public class GreetingResource {

    private final static Logger logger = LoggerFactory.getLogger(GreetingResource.class);

    private static final String template = "Hello, %s!";
    private final AtomicLong getCounter = new AtomicLong();
    private final AtomicLong postCounter = new AtomicLong();

    @GET
    @Path("/greeting/getGreeting/")
    public Greeting getGreeting(@QueryParam(value = "name") String name) {
        logger.info("getGreeting-->" + Thread.currentThread() + "-->" +getCounter.toString());
        return new Greeting(getCounter.incrementAndGet(),
                String.format(template, name));
    }

    @POST
    @Path("/greeting/postGreeting/")
    public Greeting postGreeting(PostGreet postGreet) {
        logger.info("postGreeting->" + Thread.currentThread() + "-->"+ postCounter.toString());
        return new Greeting(postCounter.incrementAndGet(),
                String.format(template, postGreet.getName()));
    }
}
