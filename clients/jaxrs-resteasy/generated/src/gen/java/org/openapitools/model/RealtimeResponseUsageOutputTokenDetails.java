package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Details about the output tokens used in the Response.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponseUsageOutputTokenDetails   {
  
  private Integer textTokens;
  private Integer audioTokens;

  /**
   * The number of text tokens used in the Response.
   **/
  
  @ApiModelProperty(value = "The number of text tokens used in the Response.")
  @JsonProperty("text_tokens")
  public Integer getTextTokens() {
    return textTokens;
  }
  public void setTextTokens(Integer textTokens) {
    this.textTokens = textTokens;
  }

  /**
   * The number of audio tokens used in the Response.
   **/
  
  @ApiModelProperty(value = "The number of audio tokens used in the Response.")
  @JsonProperty("audio_tokens")
  public Integer getAudioTokens() {
    return audioTokens;
  }
  public void setAudioTokens(Integer audioTokens) {
    this.audioTokens = audioTokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeResponseUsageOutputTokenDetails realtimeResponseUsageOutputTokenDetails = (RealtimeResponseUsageOutputTokenDetails) o;
    return Objects.equals(this.textTokens, realtimeResponseUsageOutputTokenDetails.textTokens) &&
        Objects.equals(this.audioTokens, realtimeResponseUsageOutputTokenDetails.audioTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textTokens, audioTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponseUsageOutputTokenDetails {\n");
    
    sb.append("    textTokens: ").append(toIndentedString(textTokens)).append("\n");
    sb.append("    audioTokens: ").append(toIndentedString(audioTokens)).append("\n");
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

