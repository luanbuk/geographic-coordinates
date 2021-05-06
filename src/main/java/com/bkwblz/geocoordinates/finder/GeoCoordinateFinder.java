package com.bkwblz.geocoordinates.finder;

import com.bkwblz.geocoordinates.GeographicalCoordinate;

import java.util.Optional;

public interface GeoCoordinateFinder {

    Optional<GeographicalCoordinate> findGeoCoordinateByZipCode(String zipCode);

}
