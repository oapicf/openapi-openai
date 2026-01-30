package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * One of the available [TTS models](/docs/models#tts): &#x60;tts-1&#x60; or &#x60;tts-1-hd&#x60; 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "One of the available [TTS models](/docs/models#tts): `tts-1` or `tts-1-hd` ")
public class CreateSpeechRequestModel   {
  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSpeechRequestModel createSpeechRequestModel = (CreateSpeechRequestModel) o;return true;
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSpeechRequestModel {\n");
    
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

