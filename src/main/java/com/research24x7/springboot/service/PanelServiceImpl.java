package com.research24x7.springboot.service;

import com.research24x7.springboot.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * PanelServiceImpl for panel related handling.
 * @author Crossover
 *
 */
@Service
public class PanelServiceImpl implements PanelService {

  @Autowired
  IStudentRepository panelRepository;
  
  /* (non-Javadoc)
   * @see com.crossover.techtrial.service.PanelService#register(com.crossover.techtrial.model.Panel)
   */
  
  @Override
  public void register(Panel panel) { 
    panelRepository.save(panel);
  }
  
  public Panel findBySerial(String serial) {
    return panelRepository.findBySerial(serial);
  }
}
