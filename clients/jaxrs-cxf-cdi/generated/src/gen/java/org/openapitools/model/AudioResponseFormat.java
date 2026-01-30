package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The format of the output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AudioResponseFormat {

    @JsonProperty("json") JSON(String.valueOf("json")), @JsonProperty("text") TEXT(String.valueOf("text")), @JsonProperty("srt") SRT(String.valueOf("srt")), @JsonProperty("verbose_json") VERBOSE_JSON(String.valueOf("verbose_json")), @JsonProperty("vtt") VTT(String.valueOf("vtt"));


    private String value;

    AudioResponseFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AudioResponseFormat fromValue(String value) {
        for (AudioResponseFormat b : AudioResponseFormat.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



