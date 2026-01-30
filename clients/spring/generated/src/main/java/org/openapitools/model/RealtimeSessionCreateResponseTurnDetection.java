package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Configuration for turn detection. Can be set to &#x60;null&#x60; to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
 */

@Schema(name = "RealtimeSessionCreateResponse_turn_detection", description = "Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. ")
@JsonTypeName("RealtimeSessionCreateResponse_turn_detection")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeSessionCreateResponseTurnDetection {

  private @Nullable String type;

  private @Nullable BigDecimal threshold;

  private @Nullable Integer prefixPaddingMs;

  private @Nullable Integer silenceDurationMs;

  public RealtimeSessionCreateResponseTurnDetection type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of turn detection, only `server_vad` is currently supported. 
   * @return type
   */
  
  @Schema(name = "type", description = "Type of turn detection, only `server_vad` is currently supported. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  public void setType(@Nullable String type) {
    this.type = type;
  }

  public RealtimeSessionCreateResponseTurnDetection threshold(@Nullable BigDecimal threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
   * @return threshold
   */
  @Valid 
  @Schema(name = "threshold", description = "Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("threshold")
  public @Nullable BigDecimal getThreshold() {
    return threshold;
  }

  public void setThreshold(@Nullable BigDecimal threshold) {
    this.threshold = threshold;
  }

  public RealtimeSessionCreateResponseTurnDetection prefixPaddingMs(@Nullable Integer prefixPaddingMs) {
    this.prefixPaddingMs = prefixPaddingMs;
    return this;
  }

  /**
   * Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
   * @return prefixPaddingMs
   */
  
  @Schema(name = "prefix_padding_ms", description = "Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prefix_padding_ms")
  public @Nullable Integer getPrefixPaddingMs() {
    return prefixPaddingMs;
  }

  public void setPrefixPaddingMs(@Nullable Integer prefixPaddingMs) {
    this.prefixPaddingMs = prefixPaddingMs;
  }

  public RealtimeSessionCreateResponseTurnDetection silenceDurationMs(@Nullable Integer silenceDurationMs) {
    this.silenceDurationMs = silenceDurationMs;
    return this;
  }

  /**
   * Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
   * @return silenceDurationMs
   */
  
  @Schema(name = "silence_duration_ms", description = "Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("silence_duration_ms")
  public @Nullable Integer getSilenceDurationMs() {
    return silenceDurationMs;
  }

  public void setSilenceDurationMs(@Nullable Integer silenceDurationMs) {
    this.silenceDurationMs = silenceDurationMs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeSessionCreateResponseTurnDetection realtimeSessionCreateResponseTurnDetection = (RealtimeSessionCreateResponseTurnDetection) o;
    return Objects.equals(this.type, realtimeSessionCreateResponseTurnDetection.type) &&
        Objects.equals(this.threshold, realtimeSessionCreateResponseTurnDetection.threshold) &&
        Objects.equals(this.prefixPaddingMs, realtimeSessionCreateResponseTurnDetection.prefixPaddingMs) &&
        Objects.equals(this.silenceDurationMs, realtimeSessionCreateResponseTurnDetection.silenceDurationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, threshold, prefixPaddingMs, silenceDurationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeSessionCreateResponseTurnDetection {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    prefixPaddingMs: ").append(toIndentedString(prefixPaddingMs)).append("\n");
    sb.append("    silenceDurationMs: ").append(toIndentedString(silenceDurationMs)).append("\n");
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

