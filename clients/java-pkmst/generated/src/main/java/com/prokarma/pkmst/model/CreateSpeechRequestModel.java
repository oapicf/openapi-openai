package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * One of the available [TTS models](/docs/models/tts): &#x60;tts-1&#x60; or &#x60;tts-1-hd&#x60; 
 */
@ApiModel(description = "One of the available [TTS models](/docs/models/tts): `tts-1` or `tts-1-hd` ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T10:45:02.588292416Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateSpeechRequestModel   {

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
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

