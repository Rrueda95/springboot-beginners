package com.research24x7.springboot.controller;

import com.research24x7.springboot.dto.StudentResponseDTO;
import com.research24x7.springboot.repository.IStudentRepository;
import com.research24x7.springboot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping ("students")
public class StudentController {


    @Autowired
    private IStudentService service;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> get () {

        StudentResponseDTO studentResponseDTO = new StudentResponseDTO();
        studentResponseDTO.setBody(this.service.findAll());

        return ResponseEntity.ok (studentResponseDTO);
    }
}