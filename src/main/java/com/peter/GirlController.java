package com.peter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {

	@Autowired
	private GirlRepo girlRepo;

	@GetMapping(value = "/girls")
	public List<Girl> girlList() {
		return girlRepo.findAll();
	}
}
