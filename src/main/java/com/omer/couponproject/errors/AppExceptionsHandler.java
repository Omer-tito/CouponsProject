package com.omer.couponproject.errors;

import com.omer.couponproject.dto.ResponseDTO;
import com.omer.couponproject.errors.exceptions.AuthException;
import com.omer.couponproject.errors.exceptions.CouponAppException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// This class is used to handle all exceptions that are thrown in the application.
@RestControllerAdvice
public class AppExceptionsHandler {

    @ExceptionHandler(CouponAppException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseDTO couponAppExceptionHandler(CouponAppException couponAppException) {
        return new ResponseDTO(false, couponAppException.getMessage());
    }

    @ExceptionHandler(AuthException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ResponseDTO authExceptionHandler(AuthException authException) {
        return new ResponseDTO(false, authException.getMessage());
    }
}
