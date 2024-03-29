package com.example.msarabbitconsumer.controller;


import com.example.msarabbitconsumer.domain.User;
import com.example.msarabbitconsumer.service.ProducerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ProducerController {
    private ProducerService producerService;
    private static final Logger logger = LoggerFactory.getLogger(ProducerController.class);

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @Value("${app.message}")
    private String response;

    @PostMapping("/produce")
    public ResponseEntity<String> sendMessage(@RequestBody User user) {
        producerService.sendMessage(user);
        logger.info("user sent: " + user);
        return ResponseEntity.ok("user sent: " + user);
    }
    @PostMapping("/produce2")
    public ResponseEntity<String> sendMessageC2(@RequestBody User user) {
        producerService.sendMessageC2(user);
        logger.info("user sent: " + user);
        return ResponseEntity.ok("user sent: " + user);
    }
}
