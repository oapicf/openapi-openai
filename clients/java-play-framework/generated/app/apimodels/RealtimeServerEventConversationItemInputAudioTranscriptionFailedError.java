package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Details of the transcription error.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

