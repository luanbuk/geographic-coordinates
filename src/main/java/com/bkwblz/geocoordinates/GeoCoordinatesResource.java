package com.bkwblz.geocoordinates;

import com.bkwblz.geocoordinates.exceptions.GeoCoordinateNotFoundForZipCodeException;
import com.bkwblz.geocoordinates.finder.GeoCoordinatesAggregateFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("geographical-coordinates")
public class GeoCoordinatesResource {

    @Autowired
    private GeoCoordinatesAggregateFinder aggregateFinder;

    @GetMapping("/{zipCode}")
    public GeographicalCoordinate findByZipCode(@PathVariable String zipCode){
        return this.aggregateFinder.findGeoCoordinateByZipCode(zipCode)
                .orElseThrow(() -> new GeoCoordinateNotFoundForZipCodeException(zipCode));
    }

}
