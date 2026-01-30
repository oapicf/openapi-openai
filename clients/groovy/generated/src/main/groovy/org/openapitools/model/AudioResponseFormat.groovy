package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AudioResponseFormat {

    JSON("json"),
    
    TEXT("text"),
    
    SRT("srt"),
    
    VERBOSE_JSON("verbose_json"),
    
    VTT("vtt")

    private final String value

    AudioResponseFormat(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
