package com.bkwblz.geocoordinates.finder.tomtom;

import com.bkwblz.geocoordinates.GeographicalCoordinate;
import com.bkwblz.geocoordinates.finder.GeoCoordinateDelegatedFinder;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TomTomGeoCoordinateBoundary implements GeoCoordinateDelegatedFinder {
    @Override
    public Optional<GeographicalCoordinate> findGeoCoordinateByZipCode(String zipCode) {
        return Optional.empty();
    }
}
