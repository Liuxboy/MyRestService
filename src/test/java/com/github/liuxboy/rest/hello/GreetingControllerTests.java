package com.github.liuxboy.rest.hello;

import org.junit.Test;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

/**
 * 这种测试类，得先启动rest-services服务，然后再启动Test对应case
 */
public class GreetingControllerTests {

    private static final String SERVICES_URL = "http://127.0.0.1/services";
    @Test
    public void testGetGreeting() throws Exception {
        RestTemplate template = new RestTemplate();
        String str = template.postForObject(SERVICES_URL + "/getGreeting", "lcd", String.class);
        Assert.notNull(str);
    }

    @Test
    public void testPostGreeting() throws Exception {
        PostGreet request = new PostGreet();
        request.setName("lcd");
        RestTemplate template = new RestTemplate();
        String str = template.postForObject(SERVICES_URL + "/postGreeting", request, String.class);
        Assert.notNull(str);
    }

}
