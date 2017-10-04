package org.example.server.web;

import org.springframework.web.bind.annotation.*;

/**
 * Created by ronin on 13.09.2017.
 */
@RestController
public class TestController {

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "Hello, " + name;
    }
}
