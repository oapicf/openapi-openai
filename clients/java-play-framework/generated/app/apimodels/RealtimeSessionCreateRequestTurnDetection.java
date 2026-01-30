package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Configuration for turn detection. Can be set to &#x60;null&#x60; to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RealtimeSessionCreateRequestTurnDetection   {
  @JsonProperty("type")
  
  private String type;

  @JsonProperty("threshold")
  @Valid

  private BigDecimal threshold;

  @JsonProperty("prefix_padding_ms")
  
  private Integer prefixPaddingMs;

  @JsonProperty("silence_duration_ms")
  
  private Integer silenceDurationMs;

  @JsonProperty("create_response")
  
  private Boolean createResponse = true;

  public RealtimeSessionCreateRequestTurnDetection type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of turn detection, only `server_vad` is currently supported. 
   * @return type
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

