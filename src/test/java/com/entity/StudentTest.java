package com.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author shitengyun596
 * @version 2018/5/23
 */
public class StudentTest {

    Student student;

    @Before
    public void init() {
        student = new Student();
    }

    @Test
    public void test() {
        student.setAge(15);
        student.setMale("Female");

        Assert.assertEquals(15, student.getAge());
    }
}
