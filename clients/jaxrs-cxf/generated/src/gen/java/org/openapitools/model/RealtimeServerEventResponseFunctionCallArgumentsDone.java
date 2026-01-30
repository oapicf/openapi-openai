package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 */
@ApiModel(description="Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. ")

public class RealtimeServerEventResponseFunctionCallArgumentsDone  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")

  private String eventId;

public enum TypeEnum {

RESPONSE_FUNCTION_CALL_ARGUMENTS_DONE(String.valueOf("response.function_call_arguments.done"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

 /**
  * The event type, must be `response.function_call_arguments.done`. 
  */
  @ApiModelProperty(required = true, value = "The event type, must be `response.function_call_arguments.done`. ")

  private TypeEnum type;

 /**
  * The ID of the response.
  */
  @ApiModelProperty(required = true, value = "The ID of the response.")

  private String responseId;

 /**
  * The ID of the function call item.
  */
  @ApiModelProperty(required = true, value = "The ID of the function call item.")

  private String itemId;

 /**
  * The index of the output item in the response.
  */
  @ApiModelProperty(required = true, value = "The index of the output item in the response.")

  private Integer outputIndex;

 /**
  * The ID of the function call.
  */
  @ApiModelProperty(required = true, value = "The ID of the function call.")

  private String callId;

 /**
  * The final arguments as a JSON string.
  */
  @ApiModelProperty(required = true, value = "The final arguments as a JSON string.")

  private String arguments;
 /**
   * The unique ID of the server event.
   * @return eventId
  **/
  @JsonProperty("event_id")
  @NotNull
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDone eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;response.function_call_arguments.done&#x60;. 
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDone type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The ID of the response.
   * @return responseId
  **/
  @JsonProperty("response_id")
  @NotNull
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDone responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

 /**
   * The ID of the function call item.
   * @return itemId
  **/
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDone itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

 /**
   * The index of the output item in the response.
   * @return outputIndex
  **/
  @JsonProperty("output_index")
  @NotNull
  public Integer getOutputIndex() {
    return outputIndex;
  }

  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDone outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

 /**
   * The ID of the function call.
   * @return callId
  **/
  @JsonProperty("call_id")
  @NotNull
  public String getCallId() {
    return callId;
  }

  public void setCallId(String callId) {
    this.callId = callId;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDone callId(String callId) {
    this.callId = callId;
    return this;
  }

 /**
   * The final arguments as a JSON string.
   * @return arguments
  **/
  @JsonProperty("arguments")
  @NotNull
  public String getArguments() {
    return arguments;
  }

  public void setArguments(String arguments) {
    this.arguments = arguments;
  }

  public RealtimeServerEventResponseFunctionCallArgumentsDone arguments(String arguments) {
    this.arguments = arguments;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

