package com.bkwblz.geocoordinates.finder;

import com.bkwblz.geocoordinates.GeographicalCoordinate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GeoCoordinatesAggregateFinderImpl implements GeoCoordinatesAggregateFinder {

    @Autowired
    public List<GeoCoordinateDelegatedFinder> delegatedFinders;

    @Override
    public Optional<GeographicalCoordinate> findGeoCoordinateByZipCode(String zipCode) {
        return delegatedFinders.stream().map(f -> f.findGeoCoordinateByZipCode(zipCode))
                .filter(Optional::isPresent).map(Optional::get)
                .findFirst();
    }
}
