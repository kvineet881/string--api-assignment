package com.example.string_api.controller;

import com.example.string_api.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private StringService service;


    @PostMapping("/accept")

    public String acceptListOfString(@RequestBody List<String> stringList){
        return service.getLangestString(stringList);
    }
    @DeleteMapping("/delete")
    public List<String> deleteLongeString(@RequestBody List<String> stringList){
        return service.deleteString(stringList);
    }

}
