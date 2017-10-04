package org.example.server.model;

import lombok.Data;

/**
 * Created by ronin on 13.09.2017.
 */
@Data
public class HelloResponse {
    private String greeting;

    public HelloResponse(String name) {
        this.greeting = "Hello, " + name;
    }
}
