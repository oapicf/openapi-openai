package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
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

@Schema(name = "RealtimeSessionCreateRequest_turn_detection", description = "Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. ")
@JsonTypeName("RealtimeSessionCreateRequest_turn_detection")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeSessionCreateRequestTurnDetection {

  private String type;

  private BigDecimal threshold;

  private Integer prefixPaddingMs;

  private Integer silenceDurationMs;

  private Boolean createResponse = true;

  public RealtimeSessionCreateRequestTurnDetection type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of turn detection, only `server_vad` is currently supported. 
   * @return type
   */
  
  @Schema(name = "type", description = "Type of turn detection, only `server_vad` is currently supported. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RealtimeSessionCreateRequestTurnDetection threshold(BigDecimal threshold) {
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
  public BigDecimal getThreshold() {
    return threshold;
  }

  public void setThreshold(BigDecimal threshold) {
    this.threshold = threshold;
  }

  public RealtimeSessionCreateRequestTurnDetection prefixPaddingMs(Integer prefixPaddingMs) {
    this.prefixPaddingMs = prefixPaddingMs;
    return this;
  }

  /**
   * Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
   * @return prefixPaddingMs
   */
  
  @Schema(name = "prefix_padding_ms", description = "Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prefix_padding_ms")
  public Integer getPrefixPaddingMs() {
    return prefixPaddingMs;
  }

  public void setPrefixPaddingMs(Integer prefixPaddingMs) {
    this.prefixPaddingMs = prefixPaddingMs;
  }

  public RealtimeSessionCreateRequestTurnDetection silenceDurationMs(Integer silenceDurationMs) {
    this.silenceDurationMs = silenceDurationMs;
    return this;
  }

  /**
   * Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
   * @return silenceDurationMs
   */
  
  @Schema(name = "silence_duration_ms", description = "Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("silence_duration_ms")
  public Integer getSilenceDurationMs() {
    return silenceDurationMs;
  }

  public void setSilenceDurationMs(Integer silenceDurationMs) {
    this.silenceDurationMs = silenceDurationMs;
  }

  public RealtimeSessionCreateRequestTurnDetection createResponse(Boolean createResponse) {
    this.createResponse = createResponse;
    return this;
  }

  /**
   * Whether or not to automatically generate a response when VAD is enabled. `true` by default. 
   * @return createResponse
   */
  
  @Schema(name = "create_response", description = "Whether or not to automatically generate a response when VAD is enabled. `true` by default. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("create_response")
  public Boolean getCreateResponse() {
    return createResponse;
  }

  public void setCreateResponse(Boolean createResponse) {
    this.createResponse = createResponse;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeSessionCreateRequestTurnDetection realtimeSessionCreateRequestTurnDetection = (RealtimeSessionCreateRequestTurnDetection) o;
    return Objects.equals(this.type, realtimeSessionCreateRequestTurnDetection.type) &&
        Objects.equals(this.threshold, realtimeSessionCreateRequestTurnDetection.threshold) &&
        Objects.equals(this.prefixPaddingMs, realtimeSessionCreateRequestTurnDetection.prefixPaddingMs) &&
        Objects.equals(this.silenceDurationMs, realtimeSessionCreateRequestTurnDetection.silenceDurationMs) &&
        Objects.equals(this.createResponse, realtimeSessionCreateRequestTurnDetection.createResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, threshold, prefixPaddingMs, silenceDurationMs, createResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeSessionCreateRequestTurnDetection {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    prefixPaddingMs: ").append(toIndentedString(prefixPaddingMs)).append("\n");
    sb.append("    silenceDurationMs: ").append(toIndentedString(silenceDurationMs)).append("\n");
    sb.append("    createResponse: ").append(toIndentedString(createResponse)).append("\n");
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

