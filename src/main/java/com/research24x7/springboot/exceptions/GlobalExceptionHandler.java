
package com.research24x7.springboot.exceptions;

import com.research24x7.springboot.dto.FailureDTO;
import com.research24x7.springboot.dto.FailureResponseDTO;
import com.research24x7.springboot.service.ServiceException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@ControllerAdvice
@RestController
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Value("${message.failure.general}")
    private String message;

    private static final Logger logger = LoggerFactory.getLogger (GlobalExceptionHandler.class);


    public GlobalExceptionHandler () {

        super ();
    }



    @ExceptionHandler(ServiceException.class)
    public final ResponseEntity<FailureResponseDTO> handleNotFoundException (ServiceException ex, WebRequest request) {

        FailureResponseDTO response = new FailureResponseDTO();
        FailureDTO failure = new FailureDTO(this.message, ex.getMessage());
        response.setBody(failure);

        return new ResponseEntity<>(response, HttpStatus.SERVICE_UNAVAILABLE);
    }
}