package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Returned when the model-generated function call arguments are updated. 
 */

@Schema(name = "RealtimeServerEventResponseFunctionCallArgumentsDelta", description = "Returned when the model-generated function call arguments are updated. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseFunctionCallArgumentsDelta {

  private String eventId;

  /**
   * The event type, must be `response.function_call_arguments.delta`. 
   */
  public enum TypeEnum {
    RESPONSE_FUNCTION_CALL_ARGUMENTS_DELTA("response.function_call_arguments.delta");

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

  private String delta;

  public RealtimeServerEventResponseFunctionCallArgumentsDelta() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventResponseFunctionCallArgumentsDelta(String eventId, TypeEnum type, String responseId, String itemId, Integer outputIndex, String callId, String delta) {
    this.eventId = eventId;
    this.type = type;
    this.responseId = responseId;
    this.itemId = itemId;
    this.outputIndex = outputIndex;
    this.callId = callId;
    this.delta = delta;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDelta eventId(String eventId) {
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

  public RealtimeServerEventResponseFunctionCallArgumentsDelta type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `response.function_call_arguments.delta`. 
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `response.function_call_arguments.delta`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDelta responseId(String responseId) {
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

  public RealtimeServerEventResponseFunctionCallArgumentsDelta itemId(String itemId) {
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

  public RealtimeServerEventResponseFunctionCallArgumentsDelta outputIndex(Integer outputIndex) {
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

  public RealtimeServerEventResponseFunctionCallArgumentsDelta callId(String callId) {
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

  public RealtimeServerEventResponseFunctionCallArgumentsDelta delta(String delta) {
    this.delta = delta;
    return this;
  }

  /**
   * The arguments delta as a JSON string.
   * @return delta
   */
  @NotNull 
  @Schema(name = "delta", description = "The arguments delta as a JSON string.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("delta")
  public String getDelta() {
    return delta;
  }

  public void setDelta(String delta) {
    this.delta = delta;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventResponseFunctionCallArgumentsDelta realtimeServerEventResponseFunctionCallArgumentsDelta = (RealtimeServerEventResponseFunctionCallArgumentsDelta) o;
    return Objects.equals(this.eventId, realtimeServerEventResponseFunctionCallArgumentsDelta.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseFunctionCallArgumentsDelta.type) &&
        Objects.equals(this.responseId, realtimeServerEventResponseFunctionCallArgumentsDelta.responseId) &&
        Objects.equals(this.itemId, realtimeServerEventResponseFunctionCallArgumentsDelta.itemId) &&
        Objects.equals(this.outputIndex, realtimeServerEventResponseFunctionCallArgumentsDelta.outputIndex) &&
        Objects.equals(this.callId, realtimeServerEventResponseFunctionCallArgumentsDelta.callId) &&
        Objects.equals(this.delta, realtimeServerEventResponseFunctionCallArgumentsDelta.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, itemId, outputIndex, callId, delta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseFunctionCallArgumentsDelta {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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

