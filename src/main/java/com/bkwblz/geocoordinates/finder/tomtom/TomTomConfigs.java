package com.bkwblz.geocoordinates.finder.tomtom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TomTomConfigs {

    @Value("${environment.integrations.tomtom.host}")
    private String host = "host";

    @Value("${environment.integrations.tomtom.key}")
    private String key = "key";

    public String getHost() {
        return host;
    }

    public String getKey() {
        return key;
    }
}
