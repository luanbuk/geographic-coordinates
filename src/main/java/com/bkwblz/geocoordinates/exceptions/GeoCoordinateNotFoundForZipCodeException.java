package com.bkwblz.geocoordinates.exceptions;

import static java.lang.String.format;

public class GeoCoordinateNotFoundForZipCodeException extends RuntimeException{
    public GeoCoordinateNotFoundForZipCodeException(String zipCode){
        super(format("Geographic coodinate was not found for this zipCode [%s]", zipCode));
    }
}
