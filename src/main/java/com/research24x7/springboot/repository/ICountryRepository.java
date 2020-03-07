
package com.research24x7.springboot.repository;


import com.research24x7.springboot.entity.CountryEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICountryRepository extends PagingAndSortingRepository<CountryEntity, Long> {
}
