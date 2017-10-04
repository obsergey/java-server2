package org.example.server.web;

import org.example.server.model.HelloRequest;
import org.example.server.model.HelloResponse;
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
    public HelloResponse hello(@RequestParam("name") String name) {
        return new HelloResponse(name);
    }

    @PostMapping("/hello-body")
    public HelloResponse hello(@RequestBody HelloRequest request) {
        return new HelloResponse(request.getName());
    }
}
