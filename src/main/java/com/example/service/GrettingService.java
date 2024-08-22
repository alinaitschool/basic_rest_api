package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class GrettingService {
    public String getString(String name) {
        return "Hello " + name;
    }
}
