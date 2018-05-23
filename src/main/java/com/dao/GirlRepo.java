package com.dao;

import com.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepo extends JpaRepository<Girl, Integer> {
    public List<Girl> findByAge(Integer age);
}
