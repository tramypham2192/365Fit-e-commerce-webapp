package com.example.PracticeSpringDataJPA.controller;

import com.example.PracticeSpringDataJPA.entity.FormBean;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebServiceController {

    @RequestMapping(
            value = "/test",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ResponseEntity<?> post(@ModelAttribute FormBean request){
        // request.getParam() == null
        System.out.println("hello Spring");
        return ResponseEntity.ok().build();
    }
}