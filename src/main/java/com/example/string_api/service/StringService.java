package com.example.string_api.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StringService {


    public String getLangestString(List<String> stringList){
        return  stringList.stream().max(Comparator.comparingInt(String::length)).get();
    }

    public List<String> deleteString(List<String> stringList){
        List<String> list=stringList.stream()
                .filter(x -> x.length()> 10)
                .collect(Collectors.toList());
        stringList.removeAll(list);
        return stringList;
    }
}
