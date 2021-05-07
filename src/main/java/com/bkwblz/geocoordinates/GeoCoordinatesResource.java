package com.bkwblz.geocoordinates;

import com.bkwblz.geocoordinates.exceptions.GeoCoordinateNotFoundForZipCodeException;
import com.bkwblz.geocoordinates.finder.GeoCoordinatesAggregateFinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@RestController
@RequestMapping("geographic-coordinates")
public class GeoCoordinatesResource {

    @Autowired
    private GeoCoordinatesAggregateFinder aggregateFinder;

    @GetMapping("/of-zipcodes/{zipCode}")
    public GeographicCoordinate findByZipCode(@PathVariable String zipCode){
        return this.aggregateFinder.findGeoCoordinateByZipCode(zipCode)
                .orElseThrow(() -> new GeoCoordinateNotFoundForZipCodeException(zipCode));
    }

}
