package com.citylarry.workshop3.controller.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/register")
    public Mono<ResponseEntity<AuthResponse>> register(@RequestBody RegisterRequest request) {
        return service
                .register(request)
                .map(ResponseEntity::ok);
    }

    @PostMapping("/authenticate")
    public Mono<ResponseEntity<AuthResponse>> register(@RequestBody AuthRequest request) {
        return service
                .authenticate(request)
                .map(ResponseEntity::ok);
    }

}
