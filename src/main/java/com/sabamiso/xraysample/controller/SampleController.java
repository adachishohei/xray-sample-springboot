package com.sabamiso.xraysample.controller;

import com.amazonaws.xray.spring.aop.XRayEnabled;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@XRayEnabled
@RestController
public class SampleController {
    @GetMapping
    public ResponseEntity<String> index() throws InterruptedException {
        Thread.sleep(3000);
        return ResponseEntity.ok("OK");
    }
}
