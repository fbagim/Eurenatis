package com.jetsetter.util;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by gim on 8/11/17.
 */
public class HttpUtil {
    public static ResponseEntity getResponseEntity(String location, Map<String, String> headerValues, String bodyMessage, HttpStatus httpStatus) throws URISyntaxException {
        HttpHeaders responseHeaders = new HttpHeaders();
        URI uri = null;
        if (location != null) {
            uri = new URI(location);
        }
        responseHeaders.setLocation(uri);
        if (headerValues != null) {
            Iterator<Map.Entry<String, String>> iterator = headerValues.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> pair = iterator.next();
                responseHeaders.set(pair.getKey(), pair.getValue());
            }
        }
        return new ResponseEntity(bodyMessage, responseHeaders, httpStatus);
    }
}
