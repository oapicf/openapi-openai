package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 */

@Schema(name = "RealtimeServerEventResponseFunctionCallArgumentsDone", description = "Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseFunctionCallArgumentsDone {

  private String eventId;

  /**
   * The event type, must be `response.function_call_arguments.done`. 
   */
  public enum TypeEnum {
    RESPONSE_FUNCTION_CALL_ARGUMENTS_DONE("response.function_call_arguments.done");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private String responseId;

  private String itemId;

  private Integer outputIndex;

  private String callId;

  private String arguments;

  public RealtimeServerEventResponseFunctionCallArgumentsDone() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventResponseFunctionCallArgumentsDone(String eventId, TypeEnum type, String responseId, String itemId, Integer outputIndex, String callId, String arguments) {
    this.eventId = eventId;
    this.type = type;
    this.responseId = responseId;
    this.itemId = itemId;
    this.outputIndex = outputIndex;
    this.callId = callId;
    this.arguments = arguments;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDone eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The unique ID of the server event.
   * @return eventId
   */
  @NotNull 
  @Schema(name = "event_id", description = "The unique ID of the server event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDone type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `response.function_call_arguments.done`. 
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `response.function_call_arguments.done`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDone responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

  /**
   * The ID of the response.
   * @return responseId
   */
  @NotNull 
  @Schema(name = "response_id", description = "The ID of the response.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("response_id")
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDone itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The ID of the function call item.
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", description = "The ID of the function call item.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDone outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

  /**
   * The index of the output item in the response.
   * @return outputIndex
   */
  @NotNull 
  @Schema(name = "output_index", description = "The index of the output item in the response.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("output_index")
  public Integer getOutputIndex() {
    return outputIndex;
  }

  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDone callId(String callId) {
    this.callId = callId;
    return this;
  }

  /**
   * The ID of the function call.
   * @return callId
   */
  @NotNull 
  @Schema(name = "call_id", description = "The ID of the function call.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("call_id")
  public String getCallId() {
    return callId;
  }

  public void setCallId(String callId) {
    this.callId = callId;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDone arguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

  /**
   * The final arguments as a JSON string.
   * @return arguments
   */
  @NotNull 
  @Schema(name = "arguments", description = "The final arguments as a JSON string.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("arguments")
  public String getArguments() {
    return arguments;
  }

  public void setArguments(String arguments) {
    this.arguments = arguments;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventResponseFunctionCallArgumentsDone realtimeServerEventResponseFunctionCallArgumentsDone = (RealtimeServerEventResponseFunctionCallArgumentsDone) o;
    return Objects.equals(this.eventId, realtimeServerEventResponseFunctionCallArgumentsDone.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseFunctionCallArgumentsDone.type) &&
        Objects.equals(this.responseId, realtimeServerEventResponseFunctionCallArgumentsDone.responseId) &&
        Objects.equals(this.itemId, realtimeServerEventResponseFunctionCallArgumentsDone.itemId) &&
        Objects.equals(this.outputIndex, realtimeServerEventResponseFunctionCallArgumentsDone.outputIndex) &&
        Objects.equals(this.callId, realtimeServerEventResponseFunctionCallArgumentsDone.callId) &&
        Objects.equals(this.arguments, realtimeServerEventResponseFunctionCallArgumentsDone.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, itemId, outputIndex, callId, arguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseFunctionCallArgumentsDone {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

