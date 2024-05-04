package com.subhajit.sbhttpsapiproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsController {

    @GetMapping("/test-https-get")
    public String test(){
        return "success!";
    }
}
