package com.controller;

import com.dao.UserRepository;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shitengyun596
 * @version 2018/5/23
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")// 注意，此处使用的是GetMapping注解，该注解的作用类似与@RequestMapping(value="/user/{id}" ,method=RequestMethod.GET)，@PostMapping注解同理
    public User findById(@PathVariable Long id) {
        return this.userRepository.findOne(id);
    }
}
