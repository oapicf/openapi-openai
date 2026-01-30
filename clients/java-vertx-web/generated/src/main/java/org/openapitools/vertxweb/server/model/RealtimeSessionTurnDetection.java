package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;

/**
 * Configuration for turn detection. Can be set to &#x60;null&#x60; to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeSessionTurnDetection   {
  


  public enum TypeEnum {
    SERVER_VAD("server_vad");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private BigDecimal threshold;
  private Integer prefixPaddingMs;
  private Integer silenceDurationMs;

  public RealtimeSessionTurnDetection () {

  }

  public RealtimeSessionTurnDetection (TypeEnum type, BigDecimal threshold, Integer prefixPaddingMs, Integer silenceDurationMs) {
    this.type = type;
    this.threshold = threshold;
    this.prefixPaddingMs = prefixPaddingMs;
    this.silenceDurationMs = silenceDurationMs;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeSessionTurnDetection realtimeSessionTurnDetection = (RealtimeSessionTurnDetection) o;
    return Objects.equals(type, realtimeSessionTurnDetection.type) &&
        Objects.equals(threshold, realtimeSessionTurnDetection.threshold) &&
        Objects.equals(prefixPaddingMs, realtimeSessionTurnDetection.prefixPaddingMs) &&
        Objects.equals(silenceDurationMs, realtimeSessionTurnDetection.silenceDurationMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, threshold, prefixPaddingMs, silenceDurationMs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeSessionTurnDetection {\n");
    
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
