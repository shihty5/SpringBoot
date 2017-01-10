package com.peter;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepo extends JpaRepository<Girl, Integer> {
	public List<Girl> findByAge(Integer age);
}
