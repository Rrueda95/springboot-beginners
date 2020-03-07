
package com.research24x7.springboot.service;


import java.util.List;

import com.research24x7.springboot.dto.StudentDTO;


public interface IStudentService {

    List<StudentDTO> findAll ();
}