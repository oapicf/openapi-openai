package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeSessionCreateResponseTurnDetection   {
  
  private String type;
  private BigDecimal threshold;
  private Integer prefixPaddingMs;
  private Integer silenceDurationMs;

  /**
   * Type of turn detection, only &#x60;server_vad&#x60; is currently supported. 
   **/
  
  @ApiModelProperty(value = "Type of turn detection, only `server_vad` is currently supported. ")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
   **/
  
  @ApiModelProperty(value = "Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. ")
  @JsonProperty("threshold")
  public BigDecimal getThreshold() {
    return threshold;
  }
  public void setThreshold(BigDecimal threshold) {
    this.threshold = threshold;
  }

  /**
   * Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
   **/
  
  @ApiModelProperty(value = "Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. ")
  @JsonProperty("prefix_padding_ms")
  public Integer getPrefixPaddingMs() {
    return prefixPaddingMs;
  }
  public void setPrefixPaddingMs(Integer prefixPaddingMs) {
    this.prefixPaddingMs = prefixPaddingMs;
  }

  /**
   * Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
   **/
  
  @ApiModelProperty(value = "Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. ")
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

