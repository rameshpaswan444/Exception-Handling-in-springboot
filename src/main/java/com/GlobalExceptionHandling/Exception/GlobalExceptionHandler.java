package com.GlobalExceptionHandling.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = NoSuchCustomerExistsException.class)

    public ResponseEntity<ApiResponse> handleException(NoSuchCustomerExistsException ex){
        String message=ex.getMessage();
       ApiResponse noSuchCustomerExistsException=new ApiResponse(message,false);


               return new ResponseEntity<ApiResponse>(noSuchCustomerExistsException,HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(value = CustomerAlreadyExistsException.class)
    public ResponseEntity<ApiResponse> handleException(CustomerAlreadyExistsException ex){
        String message=ex.getMessage();
      ApiResponse customerAlreadyExistsException=new ApiResponse(message,false);
        return new ResponseEntity<ApiResponse>(customerAlreadyExistsException,HttpStatus.BAD_REQUEST);
    }

}
