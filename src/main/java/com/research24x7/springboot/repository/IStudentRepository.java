
package com.research24x7.springboot.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.research24x7.springboot.entity.StudentEntity;


@Repository
public interface IStudentRepository extends JpaRepository<StudentEntity, String> {
}
