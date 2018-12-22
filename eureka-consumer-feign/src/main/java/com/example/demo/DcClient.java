package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;

public interface DcClient {
    @GetMapping("/dc")
    String consumer();
}
