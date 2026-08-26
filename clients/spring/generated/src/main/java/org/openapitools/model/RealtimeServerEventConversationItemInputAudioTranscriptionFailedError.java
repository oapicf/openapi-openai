package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Details of the transcription error.
 */

@Schema(name = "RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error", description = "Details of the transcription error.")
@JsonTypeName("RealtimeServerEventConversationItemInputAudioTranscriptionFailed_error")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String type;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String code;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String message;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String param;

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError type(@Nullable String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of error.
   * @return type
   */
  
  @Schema(name = "type", description = "The type of error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable String type) {
    this.type = type;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * Error code, if any.
   * @return code
   */
  
  @Schema(name = "code", description = "Error code, if any.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable String getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(@Nullable String code) {
    this.code = code;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * A human-readable error message.
   * @return message
   */
  
  @Schema(name = "message", description = "A human-readable error message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(@Nullable String message) {
    this.message = message;
  }

  public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError param(@Nullable String param) {
    this.param = param;
    return this;
  }

  /**
   * Parameter related to the error, if any.
   * @return param
   */
  
  @Schema(name = "param", description = "Parameter related to the error, if any.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("param")
  public @Nullable String getParam() {
    return param;
  }

  @JsonProperty("param")
  public void setParam(@Nullable String param) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

