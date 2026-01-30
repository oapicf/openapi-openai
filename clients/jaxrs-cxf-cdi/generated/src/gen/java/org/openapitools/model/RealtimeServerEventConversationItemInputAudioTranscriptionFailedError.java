package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Details of the transcription error.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Details of the transcription error.")
public class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError   {
  
  private String type;

  private String code;

  private String message;

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

