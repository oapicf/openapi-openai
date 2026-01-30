package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about the input tokens used in the Response.
 */

@Schema(name = "RealtimeResponse_usage_input_token_details", description = "Details about the input tokens used in the Response.")
@JsonTypeName("RealtimeResponse_usage_input_token_details")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponseUsageInputTokenDetails {

  private @Nullable Integer cachedTokens;

  private @Nullable Integer textTokens;

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

