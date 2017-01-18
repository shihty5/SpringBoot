package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private GirlProperties girl;

	@RequestMapping(value = "/say/{id}", method = RequestMethod.GET)
	public String sayRest(@PathVariable("id") Integer id) {
		// return girl.getCupSize() + id;
		return "id : " + id;
	}

	@RequestMapping(value = "/say", method = RequestMethod.GET)
	public String sayParam(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
		// return girl.getCupSize() + id;
		return "id : " + id;
	}
	
	@PostMapping(value ="/post")
	public String sayPost(@PathVariable("post") String post){
		return post + girl.getCupSize();
	}
}
