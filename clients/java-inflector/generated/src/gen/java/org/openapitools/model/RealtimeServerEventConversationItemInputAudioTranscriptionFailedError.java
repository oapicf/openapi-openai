package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Details of the transcription error.
 **/

@ApiModel(description = "Details of the transcription error.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("code")
  private String code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("param")
  private String param;

  /**
   * The type of error.
   **/
  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "The type of error.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Error code, if any.
   **/
  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(value = "Error code, if any.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * A human-readable error message.
   **/
  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "A human-readable error message.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Parameter related to the error, if any.
   **/
  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError param(String param) {
    this.param = param;
    return this;
  }

  
  @ApiModelProperty(value = "Parameter related to the error, if any.")
  @JsonProperty("param")
  public String getParam() {
    return param;
  }
  public void setParam(String param) {
    this.param = param;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventConversationItemInputAudioTranscriptionFailedError realtimeServerEventConversationItemInputAudioTranscriptionFailedError = (RealtimeServerEventConversationItemInputAudioTranscriptionFailedError) o;
    return Objects.equals(type, realtimeServerEventConversationItemInputAudioTranscriptionFailedError.type) &&
        Objects.equals(code, realtimeServerEventConversationItemInputAudioTranscriptionFailedError.code) &&
        Objects.equals(message, realtimeServerEventConversationItemInputAudioTranscriptionFailedError.message) &&
        Objects.equals(param, realtimeServerEventConversationItemInputAudioTranscriptionFailedError.param);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code, message, param);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
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

