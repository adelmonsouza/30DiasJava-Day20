package com.adelmonsouza.day20.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/messagequeue")
public class MessageQueueController {

    @GetMapping
    public ResponseEntity<Map<String, String>> getInfo() {
        return ResponseEntity.ok(Map.of(
            "status", "success",
            "message", "MessageQueue endpoint - Day 20",
            "day", "20"
        ));
    }
}
