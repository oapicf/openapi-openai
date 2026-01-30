package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the transcription error.
 */
@ApiModel(description="Details of the transcription error.")

public class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError  {
  
 /**
  * The type of error.
  */
  @ApiModelProperty(value = "The type of error.")

  private String type;

 /**
  * Error code, if any.
  */
  @ApiModelProperty(value = "Error code, if any.")

  private String code;

 /**
  * A human-readable error message.
  */
  @ApiModelProperty(value = "A human-readable error message.")

  private String message;

 /**
  * Parameter related to the error, if any.
  */
  @ApiModelProperty(value = "Parameter related to the error, if any.")

  private String param;
 /**
   * The type of error.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Error code, if any.
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError code(String code) {
    this.code = code;
    return this;
  }

 /**
   * A human-readable error message.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Parameter related to the error, if any.
   * @return param
  **/
  @JsonProperty("param")
  public String getParam() {
    return param;
  }

  public void setParam(String param) {
    this.param = param;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError param(String param) {
    this.param = param;
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
    RealtimeServerEventConversationItemInputAudioTranscriptionFailedError realtimeServerEventConversationItemInputAudioTranscriptionFailedError = (RealtimeServerEventConversationItemInputAudioTranscriptionFailedError) o;
    return Objects.equals(this.type, realtimeServerEventConversationItemInputAudioTranscriptionFailedError.type) &&
        Objects.equals(this.code, realtimeServerEventConversationItemInputAudioTranscriptionFailedError.code) &&
        Objects.equals(this.message, realtimeServerEventConversationItemInputAudioTranscriptionFailedError.message) &&
        Objects.equals(this.param, realtimeServerEventConversationItemInputAudioTranscriptionFailedError.param);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

