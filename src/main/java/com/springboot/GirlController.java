package com.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {

	@Autowired
	private GirlRepo girlRepo;

	@GetMapping(value = "/girls")
	public List<Girl> girlList() {
		return girlRepo.findAll();
	}

	@Autowired
	private GirlService girlService;

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
