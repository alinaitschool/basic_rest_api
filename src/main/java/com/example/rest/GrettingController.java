package com.example.rest;

import com.example.commom.Greeting;
import com.example.service.GrettingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrettingController {
    private final GrettingService grettingService;

    public GrettingController(GrettingService grettingService) {
        this.grettingService = grettingService;
    }
    @GetMapping("/greet/{name}")
    public ResponseEntity<String> greet(@PathVariable String name){
        return ResponseEntity.ok(grettingService.getString(name));
    }
}
