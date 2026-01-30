/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
 */

/**
 * The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
 */
public enum AudioResponseFormat {
    
        JSON("json"),
        
        TEXT("text"),
        
        SRT("srt"),
        
        VERBOSE_JSON("verbose_json"),
        
        VTT("vtt");

private String value;

AudioResponseFormat(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static AudioResponseFormat fromValue(String text) {
for (AudioResponseFormat b : AudioResponseFormat.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


