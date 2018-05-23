package com.service;

import com.dao.GirlRepo;
import com.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GirlService {

    @Autowired
    private GirlRepo girlRepo;

    @Transactional
    public void insertTwo() {
        Girl A = new Girl("F", 25);
        girlRepo.save(A);

        Girl B = new Girl("D", 26);
        girlRepo.save(B);

    }
}
