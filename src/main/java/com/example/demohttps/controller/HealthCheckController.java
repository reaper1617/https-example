package com.example.demohttps.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/ready")
    public ResponseEntity<Boolean> ready(){
        return ResponseEntity.ok(Boolean.TRUE);
    }

}
