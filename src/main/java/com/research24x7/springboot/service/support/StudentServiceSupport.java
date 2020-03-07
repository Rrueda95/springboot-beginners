
package com.research24x7.springboot.service.support;

import java.util.List;

import static java.util.stream.Collectors.toList;

import com.research24x7.springboot.dto.StudentDTO;
import com.research24x7.springboot.repository.IStudentRepository;
import com.research24x7.springboot.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("studentServiceSupportBean")
public class StudentServiceSupport implements IStudentService {


    @Autowired
    private IStudentRepository studentRepository;


    @Override
    public List<StudentDTO> findAll() {

        return this.studentRepository.findAll().stream().map((e) -> {

            return new StudentDTO(e.getDni(), e.getName(), e.getLastName(),
                    e.getStreet(), e.getPostal(), e.getStreetNumber(),
                    e.getNationality().getName());

        }).collect(toList());
    }
}
