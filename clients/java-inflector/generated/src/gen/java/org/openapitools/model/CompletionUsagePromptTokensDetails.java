package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Breakdown of tokens used in the prompt.
 **/

@ApiModel(description = "Breakdown of tokens used in the prompt.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CompletionUsagePromptTokensDetails   {
  @JsonProperty("audio_tokens")
  private Integer audioTokens;

  @JsonProperty("cached_tokens")
  private Integer cachedTokens;

  /**
   * Audio input tokens present in the prompt.
   **/
  public CompletionUsagePromptTokensDetails audioTokens(Integer audioTokens) {
    this.audioTokens = audioTokens;
    return this;
  }

  
  @ApiModelProperty(value = "Audio input tokens present in the prompt.")
  @JsonProperty("audio_tokens")
  public Integer getAudioTokens() {
    return audioTokens;
  }
  public void setAudioTokens(Integer audioTokens) {
    this.audioTokens = audioTokens;
  }

  /**
   * Cached tokens present in the prompt.
   **/
  public CompletionUsagePromptTokensDetails cachedTokens(Integer cachedTokens) {
    this.cachedTokens = cachedTokens;
    return this;
  }

  
  @ApiModelProperty(value = "Cached tokens present in the prompt.")
  @JsonProperty("cached_tokens")
  public Integer getCachedTokens() {
    return cachedTokens;
  }
  public void setCachedTokens(Integer cachedTokens) {
    this.cachedTokens = cachedTokens;
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
    return Objects.equals(audioTokens, completionUsagePromptTokensDetails.audioTokens) &&
        Objects.equals(cachedTokens, completionUsagePromptTokensDetails.cachedTokens);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

