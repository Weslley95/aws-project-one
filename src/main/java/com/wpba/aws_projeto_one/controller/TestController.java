package com.wpba.aws_projeto_one.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    private static final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/wpb/{name}")
    public ResponseEntity<?> dogTest(@PathVariable String name) {
        LOG.info("Test Controller - name: {}", name);
        return ResponseEntity.ok("Name: " + name);
    }
}
