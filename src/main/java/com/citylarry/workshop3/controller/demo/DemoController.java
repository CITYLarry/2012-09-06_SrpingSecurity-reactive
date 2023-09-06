package com.citylarry.workshop3.controller.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

    @GetMapping
    public Mono<ResponseEntity<String>> sayHello() {
        return Mono
                .just("Hello from reactive secured world")
                .map(ResponseEntity::ok);
    }
}
