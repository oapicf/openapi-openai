package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Details about the input tokens used in the Response.
 */

@Schema(name = "RealtimeResponse_usage_input_token_details", description = "Details about the input tokens used in the Response.")
@JsonTypeName("RealtimeResponse_usage_input_token_details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RealtimeResponseUsageInputTokenDetails {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer cachedTokens;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer textTokens;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer audioTokens;

  public RealtimeResponseUsageInputTokenDetails cachedTokens(@Nullable Integer cachedTokens) {
    this.cachedTokens = cachedTokens;
    return this;
  }

  /**
   * The number of cached tokens used in the Response.
   * @return cachedTokens
   */
  
  @Schema(name = "cached_tokens", description = "The number of cached tokens used in the Response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cached_tokens")
  public @Nullable Integer getCachedTokens() {
    return cachedTokens;
  }

  @JsonProperty("cached_tokens")
  public void setCachedTokens(@Nullable Integer cachedTokens) {
    this.cachedTokens = cachedTokens;
  }

  public RealtimeResponseUsageInputTokenDetails textTokens(@Nullable Integer textTokens) {
    this.textTokens = textTokens;
    return this;
  }

  /**
   * The number of text tokens used in the Response.
   * @return textTokens
   */
  
  @Schema(name = "text_tokens", description = "The number of text tokens used in the Response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text_tokens")
  public @Nullable Integer getTextTokens() {
    return textTokens;
  }

  @JsonProperty("text_tokens")
  public void setTextTokens(@Nullable Integer textTokens) {
    this.textTokens = textTokens;
  }

  public RealtimeResponseUsageInputTokenDetails audioTokens(@Nullable Integer audioTokens) {
    this.audioTokens = audioTokens;
    return this;
  }

  /**
   * The number of audio tokens used in the Response.
   * @return audioTokens
   */
  
  @Schema(name = "audio_tokens", description = "The number of audio tokens used in the Response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audio_tokens")
  public @Nullable Integer getAudioTokens() {
    return audioTokens;
  }

  @JsonProperty("audio_tokens")
  public void setAudioTokens(@Nullable Integer audioTokens) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

