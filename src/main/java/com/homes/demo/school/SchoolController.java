package com.homes.demo.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolController {
    @Autowired
    private SchoolService service;

    public SchoolController(SchoolService gb) {
        this.service = gb;
    }

    @GetMapping("/v1/schools")
    public List<School> getAllSchool(){
        return this.service.getAllSchools();
    }
    @GetMapping("/v1/schools/{id}")
    public School getSchool(@PathVariable("id")int id){
        return this.service.getSchool(id);
    }
    @PostMapping("/v1/schools")
    public School addSchool(@RequestBody School school){
        return this.service.addSchool(school);
    }
    @DeleteMapping("/v1/schools/{id}")
    public void deleteSchool(@PathVariable("id")int id){
        this.service.deleteSchool(id);
    }

}
