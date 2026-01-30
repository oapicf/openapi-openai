package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Breakdown of tokens used in the prompt.
 */
@ApiModel(description="Breakdown of tokens used in the prompt.")

public class CompletionUsagePromptTokensDetails  {
  
 /**
  * Audio input tokens present in the prompt.
  */
  @ApiModelProperty(value = "Audio input tokens present in the prompt.")

  private Integer audioTokens;

 /**
  * Cached tokens present in the prompt.
  */
  @ApiModelProperty(value = "Cached tokens present in the prompt.")

  private Integer cachedTokens;
 /**
   * Audio input tokens present in the prompt.
   * @return audioTokens
  **/
  @JsonProperty("audio_tokens")
  public Integer getAudioTokens() {
    return audioTokens;
  }

  public void setAudioTokens(Integer audioTokens) {
    this.audioTokens = audioTokens;
  }

  public CompletionUsagePromptTokensDetails audioTokens(Integer audioTokens) {
    this.audioTokens = audioTokens;
    return this;
  }

 /**
   * Cached tokens present in the prompt.
   * @return cachedTokens
  **/
  @JsonProperty("cached_tokens")
  public Integer getCachedTokens() {
    return cachedTokens;
  }

  public void setCachedTokens(Integer cachedTokens) {
    this.cachedTokens = cachedTokens;
  }

  public CompletionUsagePromptTokensDetails cachedTokens(Integer cachedTokens) {
    this.cachedTokens = cachedTokens;
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
    CompletionUsagePromptTokensDetails completionUsagePromptTokensDetails = (CompletionUsagePromptTokensDetails) o;
    return Objects.equals(this.audioTokens, completionUsagePromptTokensDetails.audioTokens) &&
        Objects.equals(this.cachedTokens, completionUsagePromptTokensDetails.cachedTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audioTokens, cachedTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompletionUsagePromptTokensDetails {\n");
    
    sb.append("    audioTokens: ").append(toIndentedString(audioTokens)).append("\n");
    sb.append("    cachedTokens: ").append(toIndentedString(cachedTokens)).append("\n");
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

