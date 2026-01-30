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
 * Details about the output tokens used in the Response.
 */

@Schema(name = "RealtimeResponse_usage_output_token_details", description = "Details about the output tokens used in the Response.")
@JsonTypeName("RealtimeResponse_usage_output_token_details")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeResponseUsageOutputTokenDetails {

  private Integer textTokens;

  private Integer audioTokens;

  public RealtimeResponseUsageOutputTokenDetails textTokens(Integer textTokens) {
    this.textTokens = textTokens;
    return this;
  }

  /**
   * The number of text tokens used in the Response.
   * @return textTokens
   */
  
  @Schema(name = "text_tokens", description = "The number of text tokens used in the Response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text_tokens")
  public Integer getTextTokens() {
    return textTokens;
  }

  public void setTextTokens(Integer textTokens) {
    this.textTokens = textTokens;
  }

  public RealtimeResponseUsageOutputTokenDetails audioTokens(Integer audioTokens) {
    this.audioTokens = audioTokens;
    return this;
  }

  /**
   * The number of audio tokens used in the Response.
   * @return audioTokens
   */
  
  @Schema(name = "audio_tokens", description = "The number of audio tokens used in the Response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

