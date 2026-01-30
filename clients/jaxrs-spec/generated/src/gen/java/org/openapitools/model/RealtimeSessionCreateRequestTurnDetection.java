package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
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
 * Configuration for turn detection. Can be set to &#x60;null&#x60; to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
 **/
@ApiModel(description = "Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. ")
@JsonTypeName("RealtimeSessionCreateRequest_turn_detection")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeSessionCreateRequestTurnDetection   {
  private String type;
  private BigDecimal threshold;
  private Integer prefixPaddingMs;
  private Integer silenceDurationMs;
  private Boolean createResponse = true;

  public RealtimeSessionCreateRequestTurnDetection() {
  }

  /**
   * Type of turn detection, only &#x60;server_vad&#x60; is currently supported. 
   **/
  public RealtimeSessionCreateRequestTurnDetection type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "Type of turn detection, only `server_vad` is currently supported. ")
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
   **/
  public RealtimeSessionCreateRequestTurnDetection threshold(BigDecimal threshold) {
    this.threshold = threshold;
    return this;
  }

  
  @ApiModelProperty(value = "Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. ")
  @JsonProperty("threshold")
  @Valid public BigDecimal getThreshold() {
    return threshold;
  }

  @JsonProperty("threshold")
  public void setThreshold(BigDecimal threshold) {
    this.threshold = threshold;
  }

  /**
   * Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
   **/
  public RealtimeSessionCreateRequestTurnDetection prefixPaddingMs(Integer prefixPaddingMs) {
    this.prefixPaddingMs = prefixPaddingMs;
    return this;
  }

  
  @ApiModelProperty(value = "Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. ")
  @JsonProperty("prefix_padding_ms")
  public Integer getPrefixPaddingMs() {
    return prefixPaddingMs;
  }

  @JsonProperty("prefix_padding_ms")
  public void setPrefixPaddingMs(Integer prefixPaddingMs) {
    this.prefixPaddingMs = prefixPaddingMs;
  }

  /**
   * Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
   **/
  public RealtimeSessionCreateRequestTurnDetection silenceDurationMs(Integer silenceDurationMs) {
    this.silenceDurationMs = silenceDurationMs;
    return this;
  }

  
  @ApiModelProperty(value = "Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. ")
  @JsonProperty("silence_duration_ms")
  public Integer getSilenceDurationMs() {
    return silenceDurationMs;
  }

  @JsonProperty("silence_duration_ms")
  public void setSilenceDurationMs(Integer silenceDurationMs) {
    this.silenceDurationMs = silenceDurationMs;
  }

  /**
   * Whether or not to automatically generate a response when VAD is enabled. &#x60;true&#x60; by default. 
   **/
  public RealtimeSessionCreateRequestTurnDetection createResponse(Boolean createResponse) {
    this.createResponse = createResponse;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not to automatically generate a response when VAD is enabled. `true` by default. ")
  @JsonProperty("create_response")
  public Boolean getCreateResponse() {
    return createResponse;
  }

  @JsonProperty("create_response")
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

