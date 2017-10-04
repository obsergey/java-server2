package org.example.server.web;

import org.springframework.web.bind.annotation.*;

/**
 * Created by osergey on 04.10.2017.
 */
@RestController
public class TestController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }
}
