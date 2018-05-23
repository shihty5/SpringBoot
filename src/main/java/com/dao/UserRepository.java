package com.dao;

import com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author shitengyun596
 * @version 2018/5/23
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
