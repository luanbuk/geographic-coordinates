package com.bkwblz.geocoordinates.finder.tomtom;

import com.bkwblz.geocoordinates.GeographicCoordinate;
import com.bkwblz.geocoordinates.finder.GeoCoordinateDelegatedFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TomTomGeoCoordinateBoundary implements GeoCoordinateDelegatedFinder {

    @Autowired
    private TomTomConfigs configs;

    @Override
    public Optional<GeographicCoordinate> findGeoCoordinateByZipCode(String zipCode) {

        System.out.println(configs.getHost());
        System.out.println(configs.getKey());

        return Optional.empty();
    }
}
