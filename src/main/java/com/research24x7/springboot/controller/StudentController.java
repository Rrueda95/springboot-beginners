package com.research24x7.springboot.controller;

import com.research24x7.springboot.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class StudentController {

    @Autowired
    IStudentRepository dao;

    @Autowired
    private Environment env;

    public IStudentRepository getDao() {

        return dao;
    }
}