package com.bkwblz.geocoordinates.exceptions;

import com.bkwblz.geocoordinates.exceptions.GeoCoordinateNotFoundForZipCodeException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class GeoCoordinateResourceAdvice {

    @ResponseBody
    @ExceptionHandler(GeoCoordinateNotFoundForZipCodeException.class)
    @ResponseStatus(NOT_FOUND)
    public String getGeoCoordinateNotFoundForZipCodeHandler(GeoCoordinateNotFoundForZipCodeException ex){
        return ex.getMessage();
    }
}
