package com.lin.controller;

import com.lin.mapper.weatherMapper;
import com.lin.pojo.weather;
import com.lin.service.weatherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class weatherController {

    @Autowired
    weatherServiceImpl service;

    @GetMapping("updateFZ")
    void updateFZ(){
        service.updateFZ();
    }

    @GetMapping("updateBJ")
    void updateBJ(){
        service.updateBJ();
    }

    @GetMapping("updateSH")
    void updateSH(){
        service.updateSH();
    }

    @GetMapping("/queryFZ")
    String queryFZ() {
        List<weather> t = service.queryFZ();
        return t.toString();
    }

    @GetMapping("/queryBJ")
    String queryBJ() {
        List<weather> t = service.queryBJ();
        return t.toString();
    }

    @GetMapping("/querySH")
    String querySH() {
        List<weather> t = service.querySH();
        return t.toString();
    }

}
