package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
 */
@ApiModel(description="Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. ")

public class RealtimeSessionCreateRequestTurnDetection  {
  
 /**
  * Type of turn detection, only `server_vad` is currently supported. 
  */
  @ApiModelProperty(value = "Type of turn detection, only `server_vad` is currently supported. ")
  private String type;

 /**
  * Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
  */
  @ApiModelProperty(value = "Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. ")
  @Valid
  private BigDecimal threshold;

 /**
  * Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
  */
  @ApiModelProperty(value = "Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. ")
  private Integer prefixPaddingMs;

 /**
  * Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
  */
  @ApiModelProperty(value = "Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. ")
  private Integer silenceDurationMs;

 /**
  * Whether or not to automatically generate a response when VAD is enabled. `true` by default. 
  */
  @ApiModelProperty(value = "Whether or not to automatically generate a response when VAD is enabled. `true` by default. ")
  private Boolean createResponse = true;
 /**
  * Type of turn detection, only &#x60;server_vad&#x60; is currently supported. 
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public RealtimeSessionCreateRequestTurnDetection type(String type) {
    this.type = type;
    return this;
  }

 /**
  * Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
  * @return threshold
  */
  @JsonProperty("threshold")
  public BigDecimal getThreshold() {
    return threshold;
  }

  /**
   * Sets the <code>threshold</code> property.
   */
 public void setThreshold(BigDecimal threshold) {
    this.threshold = threshold;
  }

  /**
   * Sets the <code>threshold</code> property.
   */
  public RealtimeSessionCreateRequestTurnDetection threshold(BigDecimal threshold) {
    this.threshold = threshold;
    return this;
  }

 /**
  * Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
  * @return prefixPaddingMs
  */
  @JsonProperty("prefix_padding_ms")
  public Integer getPrefixPaddingMs() {
    return prefixPaddingMs;
  }

  /**
   * Sets the <code>prefixPaddingMs</code> property.
   */
 public void setPrefixPaddingMs(Integer prefixPaddingMs) {
    this.prefixPaddingMs = prefixPaddingMs;
  }

  /**
   * Sets the <code>prefixPaddingMs</code> property.
   */
  public RealtimeSessionCreateRequestTurnDetection prefixPaddingMs(Integer prefixPaddingMs) {
    this.prefixPaddingMs = prefixPaddingMs;
    return this;
  }

 /**
  * Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
  * @return silenceDurationMs
  */
  @JsonProperty("silence_duration_ms")
  public Integer getSilenceDurationMs() {
    return silenceDurationMs;
  }

  /**
   * Sets the <code>silenceDurationMs</code> property.
   */
 public void setSilenceDurationMs(Integer silenceDurationMs) {
    this.silenceDurationMs = silenceDurationMs;
  }

  /**
   * Sets the <code>silenceDurationMs</code> property.
   */
  public RealtimeSessionCreateRequestTurnDetection silenceDurationMs(Integer silenceDurationMs) {
    this.silenceDurationMs = silenceDurationMs;
    return this;
  }

 /**
  * Whether or not to automatically generate a response when VAD is enabled. &#x60;true&#x60; by default. 
  * @return createResponse
  */
  @JsonProperty("create_response")
  public Boolean getCreateResponse() {
    return createResponse;
  }

  /**
   * Sets the <code>createResponse</code> property.
   */
 public void setCreateResponse(Boolean createResponse) {
    this.createResponse = createResponse;
  }

  /**
   * Sets the <code>createResponse</code> property.
   */
  public RealtimeSessionCreateRequestTurnDetection createResponse(Boolean createResponse) {
    this.createResponse = createResponse;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

