/*
 * @(#ServiceException.java 01/01/2019
 * Copyright 2018 Raul Pena, Inc. All rights reserved.
 * RAULGPENA/CONFIDENTIAL
 * */


package com.research24x7.springboot.service;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus (HttpStatus.INTERNAL_SERVER_ERROR)
public class ServiceException extends RuntimeException {


    public ServiceException (String message) {

        super (message);
    }
}