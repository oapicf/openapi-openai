package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Breakdown of tokens used in the prompt.
 */

@Schema(name = "CompletionUsage_prompt_tokens_details", description = "Breakdown of tokens used in the prompt.")
@JsonTypeName("CompletionUsage_prompt_tokens_details")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CompletionUsagePromptTokensDetails {

  private Integer audioTokens;

  private Integer cachedTokens;

  public CompletionUsagePromptTokensDetails audioTokens(Integer audioTokens) {
    this.audioTokens = audioTokens;
    return this;
  }

  /**
   * Audio input tokens present in the prompt.
   * @return audioTokens
   */
  
  @Schema(name = "audio_tokens", description = "Audio input tokens present in the prompt.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audio_tokens")
  public Integer getAudioTokens() {
    return audioTokens;
  }

  public void setAudioTokens(Integer audioTokens) {
    this.audioTokens = audioTokens;
  }

  public CompletionUsagePromptTokensDetails cachedTokens(Integer cachedTokens) {
    this.cachedTokens = cachedTokens;
    return this;
  }

  /**
   * Cached tokens present in the prompt.
   * @return cachedTokens
   */
  
  @Schema(name = "cached_tokens", description = "Cached tokens present in the prompt.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

