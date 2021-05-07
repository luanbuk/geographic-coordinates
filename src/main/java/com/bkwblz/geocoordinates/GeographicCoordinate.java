package com.bkwblz.geocoordinates;

import java.math.BigDecimal;

public class GeographicCoordinate {

    public final BigDecimal latitude;

    public final BigDecimal longitude;

    public GeographicCoordinate(BigDecimal latitude, BigDecimal longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }
}
