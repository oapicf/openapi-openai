package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Details about the output tokens used in the Response.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Details about the output tokens used in the Response.")
public class RealtimeResponseUsageOutputTokenDetails   {
  
  private Integer textTokens;

  private Integer audioTokens;

  /**
   * The number of text tokens used in the Response.
   **/
  public RealtimeResponseUsageOutputTokenDetails textTokens(Integer textTokens) {
    this.textTokens = textTokens;
    return this;
  }

  
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
  public RealtimeResponseUsageOutputTokenDetails audioTokens(Integer audioTokens) {
    this.audioTokens = audioTokens;
    return this;
  }

  
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

