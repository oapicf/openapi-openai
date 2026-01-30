package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Details of the transcription error.
 */
@ApiModel(description = "Details of the transcription error.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("code")
  private String code;

  @JsonProperty("message")
  private String message;

  @JsonProperty("param")
  private String param;

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of error.
   * @return type
  **/
  @ApiModelProperty(value = "The type of error.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Error code, if any.
   * @return code
  **/
  @ApiModelProperty(value = "Error code, if any.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human-readable error message.
   * @return message
  **/
  @ApiModelProperty(value = "A human-readable error message.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError param(String param) {
    this.param = param;
    return this;
  }

   /**
   * Parameter related to the error, if any.
   * @return param
  **/
  @ApiModelProperty(value = "Parameter related to the error, if any.")
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

