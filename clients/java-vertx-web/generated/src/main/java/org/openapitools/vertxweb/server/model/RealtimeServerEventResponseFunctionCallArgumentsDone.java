package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeServerEventResponseFunctionCallArgumentsDone   {
  
  private String eventId;


  public enum TypeEnum {
    RESPONSE_FUNCTION_CALL_ARGUMENTS_DONE("response.function_call_arguments.done");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private String responseId;
  private String itemId;
  private Integer outputIndex;
  private String callId;
  private String arguments;

  public RealtimeServerEventResponseFunctionCallArgumentsDone () {

  }

  public RealtimeServerEventResponseFunctionCallArgumentsDone (String eventId, TypeEnum type, String responseId, String itemId, Integer outputIndex, String callId, String arguments) {
    this.eventId = eventId;
    this.type = type;
    this.responseId = responseId;
    this.itemId = itemId;
    this.outputIndex = outputIndex;
    this.callId = callId;
    this.arguments = arguments;
  }

    
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("response_id")
  public String getResponseId() {
    return responseId;
  }
  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

    
  @JsonProperty("output_index")
  public Integer getOutputIndex() {
    return outputIndex;
  }
  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

    
  @JsonProperty("call_id")
  public String getCallId() {
    return callId;
  }
  public void setCallId(String callId) {
    this.callId = callId;
  }

    
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
    return Objects.equals(eventId, realtimeServerEventResponseFunctionCallArgumentsDone.eventId) &&
        Objects.equals(type, realtimeServerEventResponseFunctionCallArgumentsDone.type) &&
        Objects.equals(responseId, realtimeServerEventResponseFunctionCallArgumentsDone.responseId) &&
        Objects.equals(itemId, realtimeServerEventResponseFunctionCallArgumentsDone.itemId) &&
        Objects.equals(outputIndex, realtimeServerEventResponseFunctionCallArgumentsDone.outputIndex) &&
        Objects.equals(callId, realtimeServerEventResponseFunctionCallArgumentsDone.callId) &&
        Objects.equals(arguments, realtimeServerEventResponseFunctionCallArgumentsDone.arguments);
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
