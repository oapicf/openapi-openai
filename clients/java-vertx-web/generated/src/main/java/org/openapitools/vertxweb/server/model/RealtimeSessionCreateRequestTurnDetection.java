package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;

/**
 * Configuration for turn detection. Can be set to &#x60;null&#x60; to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeSessionCreateRequestTurnDetection   {
  
  private String type;
  private BigDecimal threshold;
  private Integer prefixPaddingMs;
  private Integer silenceDurationMs;
  private Boolean createResponse = true;

  public RealtimeSessionCreateRequestTurnDetection () {

  }

  public RealtimeSessionCreateRequestTurnDetection (String type, BigDecimal threshold, Integer prefixPaddingMs, Integer silenceDurationMs, Boolean createResponse) {
    this.type = type;
    this.threshold = threshold;
    this.prefixPaddingMs = prefixPaddingMs;
    this.silenceDurationMs = silenceDurationMs;
    this.createResponse = createResponse;
  }

    
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

    
  @JsonProperty("threshold")
  public BigDecimal getThreshold() {
    return threshold;
  }
  public void setThreshold(BigDecimal threshold) {
    this.threshold = threshold;
  }

    
  @JsonProperty("prefix_padding_ms")
  public Integer getPrefixPaddingMs() {
    return prefixPaddingMs;
  }
  public void setPrefixPaddingMs(Integer prefixPaddingMs) {
    this.prefixPaddingMs = prefixPaddingMs;
  }

    
  @JsonProperty("silence_duration_ms")
  public Integer getSilenceDurationMs() {
    return silenceDurationMs;
  }
  public void setSilenceDurationMs(Integer silenceDurationMs) {
    this.silenceDurationMs = silenceDurationMs;
  }

    
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
    return Objects.equals(type, realtimeSessionCreateRequestTurnDetection.type) &&
        Objects.equals(threshold, realtimeSessionCreateRequestTurnDetection.threshold) &&
        Objects.equals(prefixPaddingMs, realtimeSessionCreateRequestTurnDetection.prefixPaddingMs) &&
        Objects.equals(silenceDurationMs, realtimeSessionCreateRequestTurnDetection.silenceDurationMs) &&
        Objects.equals(createResponse, realtimeSessionCreateRequestTurnDetection.createResponse);
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
