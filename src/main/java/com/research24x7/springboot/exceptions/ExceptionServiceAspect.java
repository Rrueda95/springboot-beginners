/*
 * @(#EmployeeAfterAspect.java 10/01/2017
 * Copyright 2017 Educacionit, Inc. All rights reserved.
 * Educacionit/CONFIDENTIAL
 * */

package com.research24x7.springboot.exceptions;

import com.research24x7.springboot.service.ServiceException;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ExceptionServiceAspect {


	private static final Logger logger = Logger.getLogger (ExceptionServiceAspect.class);


	public ExceptionServiceAspect() {
		
		super ();
	}


	@AfterThrowing("execution (* com.research24x7.springboot.service.support.*.*())")
	public void logExceptions(JoinPoint joinPoint) {

		logger.error("********************************************************************");
		logger.error("**********" + "Problems executing " + joinPoint.getSignature() + "*************");
		logger.error("********************************************************************");
		throw new ServiceException("Problems executing " + joinPoint.getSignature());
	}
}
