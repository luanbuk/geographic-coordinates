package com.bkwblz.geocoordinates.finder;

import com.bkwblz.geocoordinates.GeographicCoordinate;

import java.util.Optional;

public interface GeoCoordinateFinder {

    Optional<GeographicCoordinate> findGeoCoordinateByZipCode(String zipCode);

}
