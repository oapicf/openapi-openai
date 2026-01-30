package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 */
@ApiModel(description = "Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseFunctionCallArgumentsDone   {
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be `response.function_call_arguments.done`. 
   */
  public enum TypeEnum {
    RESPONSE_FUNCTION_CALL_ARGUMENTS_DONE("response.function_call_arguments.done");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("response_id")
  private String responseId;

  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("output_index")
  private Integer outputIndex;

  @JsonProperty("call_id")
  private String callId;

  @JsonProperty("arguments")
  private String arguments;

  public RealtimeServerEventResponseFunctionCallArgumentsDone eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The unique ID of the server event.
   * @return eventId
   */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
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
  @ApiModelProperty(required = true, value = "The event type, must be `response.function_call_arguments.done`. ")
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
  @ApiModelProperty(required = true, value = "The ID of the response.")
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
  @ApiModelProperty(required = true, value = "The ID of the function call item.")
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
  @ApiModelProperty(required = true, value = "The index of the output item in the response.")
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
  @ApiModelProperty(required = true, value = "The ID of the function call.")
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
  @ApiModelProperty(required = true, value = "The final arguments as a JSON string.")
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

