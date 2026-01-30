package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
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

  private final String value;

  AudioResponseFormat(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AudioResponseFormat fromValue(String value) {
    for (AudioResponseFormat b : AudioResponseFormat.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

