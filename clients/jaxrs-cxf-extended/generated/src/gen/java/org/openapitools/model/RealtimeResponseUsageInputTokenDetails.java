package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Details about the input tokens used in the Response.
 */
@ApiModel(description="Details about the input tokens used in the Response.")

public class RealtimeResponseUsageInputTokenDetails  {
  
 /**
  * The number of cached tokens used in the Response.
  */
  @ApiModelProperty(value = "The number of cached tokens used in the Response.")
  private Integer cachedTokens;

 /**
  * The number of text tokens used in the Response.
  */
  @ApiModelProperty(value = "The number of text tokens used in the Response.")
  private Integer textTokens;

 /**
  * The number of audio tokens used in the Response.
  */
  @ApiModelProperty(value = "The number of audio tokens used in the Response.")
  private Integer audioTokens;
 /**
  * The number of cached tokens used in the Response.
  * @return cachedTokens
  */
  @JsonProperty("cached_tokens")
  public Integer getCachedTokens() {
    return cachedTokens;
  }

  /**
   * Sets the <code>cachedTokens</code> property.
   */
 public void setCachedTokens(Integer cachedTokens) {
    this.cachedTokens = cachedTokens;
  }

  /**
   * Sets the <code>cachedTokens</code> property.
   */
  public RealtimeResponseUsageInputTokenDetails cachedTokens(Integer cachedTokens) {
    this.cachedTokens = cachedTokens;
    return this;
  }

 /**
  * The number of text tokens used in the Response.
  * @return textTokens
  */
  @JsonProperty("text_tokens")
  public Integer getTextTokens() {
    return textTokens;
  }

  /**
   * Sets the <code>textTokens</code> property.
   */
 public void setTextTokens(Integer textTokens) {
    this.textTokens = textTokens;
  }

  /**
   * Sets the <code>textTokens</code> property.
   */
  public RealtimeResponseUsageInputTokenDetails textTokens(Integer textTokens) {
    this.textTokens = textTokens;
    return this;
  }

 /**
  * The number of audio tokens used in the Response.
  * @return audioTokens
  */
  @JsonProperty("audio_tokens")
  public Integer getAudioTokens() {
    return audioTokens;
  }

  /**
   * Sets the <code>audioTokens</code> property.
   */
 public void setAudioTokens(Integer audioTokens) {
    this.audioTokens = audioTokens;
  }

  /**
   * Sets the <code>audioTokens</code> property.
   */
  public RealtimeResponseUsageInputTokenDetails audioTokens(Integer audioTokens) {
    this.audioTokens = audioTokens;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeResponseUsageInputTokenDetails realtimeResponseUsageInputTokenDetails = (RealtimeResponseUsageInputTokenDetails) o;
    return Objects.equals(this.cachedTokens, realtimeResponseUsageInputTokenDetails.cachedTokens) &&
        Objects.equals(this.textTokens, realtimeResponseUsageInputTokenDetails.textTokens) &&
        Objects.equals(this.audioTokens, realtimeResponseUsageInputTokenDetails.audioTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachedTokens, textTokens, audioTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponseUsageInputTokenDetails {\n");
    
    sb.append("    cachedTokens: ").append(toIndentedString(cachedTokens)).append("\n");
    sb.append("    textTokens: ").append(toIndentedString(textTokens)).append("\n");
    sb.append("    audioTokens: ").append(toIndentedString(audioTokens)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

