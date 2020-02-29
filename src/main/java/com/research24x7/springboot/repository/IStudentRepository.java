package com.research24x7.springboot.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;


public interface IStudentRepository extends PagingAndSortingRepository<StudentEntity, Long> {
}
