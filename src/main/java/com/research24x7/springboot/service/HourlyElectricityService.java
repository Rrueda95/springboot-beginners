package com.research24x7.springboot.service;

import com.research24x7.springboot.model.StudentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * HourlyElectricityService interface for all services realted to HourlyElectricity.
 * @author Crossover
 *
 */
public interface HourlyElectricityService {
  StudentEntity save(StudentEntity hourlyElectricity);
  
  Page<StudentEntity> getAllHourlyElectricityByPanelId(Long panelId, Pageable pageable);
}
