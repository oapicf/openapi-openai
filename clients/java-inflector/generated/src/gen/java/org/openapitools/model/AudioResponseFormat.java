package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * The format of the output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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


