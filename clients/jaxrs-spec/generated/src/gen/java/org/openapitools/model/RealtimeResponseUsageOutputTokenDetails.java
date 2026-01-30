package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Details about the output tokens used in the Response.
 **/
@ApiModel(description = "Details about the output tokens used in the Response.")
@JsonTypeName("RealtimeResponse_usage_output_token_details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponseUsageOutputTokenDetails   {
  private Integer textTokens;
  private Integer audioTokens;

  public RealtimeResponseUsageOutputTokenDetails() {
  }

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

  @JsonProperty("text_tokens")
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

  @JsonProperty("audio_tokens")
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

