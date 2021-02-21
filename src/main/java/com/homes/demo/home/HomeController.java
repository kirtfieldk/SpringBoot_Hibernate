package com.homes.demo.home;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    private HomeService service;

    public HomeController(HomeService service) {
        this.service = service;
    }
    @GetMapping("/v1/homes")
    public List<Home> getAllHomes(){
        return this.service.getAllHomes();
    }
    @GetMapping("/v1/homes/{id}")
    public Home getHome(@PathVariable("id") int id){
        return this.service.getHome(id);
    }
    @GetMapping("/v1/homes/neighborhood/{id}")
    public List<Home> getHomesInNeighborhood(@PathVariable("id") int id){
        return this.service.getHomesInNeighborhood(id);
    }
    @GetMapping("/v1/homes/school/{id}")
    public List<Home> getHomeInSchool(@PathVariable("id") int id){
        return this.service.getHomeInSchool(id);
    }
    @PostMapping("/v1/homes")
    public Home addHome(@RequestBody Home home){
        return this.service.addHome(home);
    }
    @DeleteMapping("v1/homes/{id}")
    public void deleteHome(@PathVariable("id") int id){
        this.service.deleteHome(id);
    }
}
