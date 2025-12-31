package com.project.restapi.employeeManagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@ResponseStatus(HttpStatus.NOT_FOUND)
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourcesNotFoundException.class)
    public String handleNotFound(ResourcesNotFoundException e) {
        return e.getMessage();
    }

    @ExceptionHandler(InvalidAgeException.class)
    public String handleInvalidAge(InvalidAgeException e) {
        return e.getMessage();
    }

    @ExceptionHandler(EmailAlreadyExistsException.class)
    public String handleExistingEmail(EmailAlreadyExistsException e) {
        return e.getMessage();
    }

    @ExceptionHandler(InvalidSalaryException.class)
    public String handleInvalidSalary(InvalidSalaryException e) {
        return e.getMessage();
    }
}
