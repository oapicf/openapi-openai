package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 */
public class RealtimeServerEventResponseFunctionCallArgumentsDone implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The unique ID of the server event.
   */
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be &#x60;response.function_call_arguments.done&#x60;. 
   */
  @JsonProperty("type")
  private String type;

  /**
   * The ID of the response.
   */
  @JsonProperty("response_id")
  private String responseId;

  /**
   * The ID of the function call item.
   */
  @JsonProperty("item_id")
  private String itemId;

  /**
   * The index of the output item in the response.
   */
  @JsonProperty("output_index")
  private Integer outputIndex;

  /**
   * The ID of the function call.
   */
  @JsonProperty("call_id")
  private String callId;

  /**
   * The final arguments as a JSON string.
   */
  @JsonProperty("arguments")
  private String arguments;

  /**
   * The unique ID of the server event.
   * @return eventId
   */
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be &#x60;response.function_call_arguments.done&#x60;. 
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The ID of the response.
   * @return responseId
   */
  public String getResponseId() {
    return responseId;
  }

  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  /**
   * The ID of the function call item.
   * @return itemId
   */
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The index of the output item in the response.
   * @return outputIndex
   */
  public Integer getOutputIndex() {
    return outputIndex;
  }

  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  /**
   * The ID of the function call.
   * @return callId
   */
  public String getCallId() {
    return callId;
  }

  public void setCallId(String callId) {
    this.callId = callId;
  }

  /**
   * The final arguments as a JSON string.
   * @return arguments
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
