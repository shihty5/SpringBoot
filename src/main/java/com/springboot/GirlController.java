package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlRepo girlRepo;
    @Autowired
    private GirlService girlService;

    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepo.findAll();
    }

    @PostMapping(value = "/girls")
    public Girl addGirl(@RequestParam("cupSize") String cupSize, @RequestParam("age") Integer age) {
        Girl girl = new Girl(cupSize, age);
        return girlRepo.save(girl);

    }

    @GetMapping(value = "/girls/{id}")
    public Girl getGirl(@PathVariable("id") Integer id) {
        return girlRepo.findOne(id);
    }

    @PutMapping(value = "/girls/{id}")
    public Girl updateGirl(@PathVariable("id") Integer id, @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age) {
        Girl girl = new Girl(cupSize, age);
        girl.setId(id);
        return girlRepo.save(girl);
    }

    @DeleteMapping(value = "/girls/{id}")
    public void deleteGirl(@PathVariable("id") Integer id) {
        girlRepo.delete(id);
    }

    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> getGirlByAge(@PathVariable("age") Integer age) {
        return girlRepo.findByAge(age);
    }

    @PostMapping(value = "/girls/two")
    public void insertGirl() {
        girlService.insertTwo();
    }
}
