package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Returned when the model-generated function call arguments are updated. 
 **/

@ApiModel(description = "Returned when the model-generated function call arguments are updated. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseFunctionCallArgumentsDelta   {
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be `response.function_call_arguments.delta`. 
   */
  public enum TypeEnum {
    RESPONSE_FUNCTION_CALL_ARGUMENTS_DELTA("response.function_call_arguments.delta");

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

  @JsonProperty("delta")
  private String delta;

  /**
   * The unique ID of the server event.
   **/
  public RealtimeServerEventResponseFunctionCallArgumentsDelta eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be `response.function_call_arguments.delta`. 
   **/
  public RealtimeServerEventResponseFunctionCallArgumentsDelta type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `response.function_call_arguments.delta`. ")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The ID of the response.
   **/
  public RealtimeServerEventResponseFunctionCallArgumentsDelta responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the response.")
  @JsonProperty("response_id")
  public String getResponseId() {
    return responseId;
  }
  public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  /**
   * The ID of the function call item.
   **/
  public RealtimeServerEventResponseFunctionCallArgumentsDelta itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the function call item.")
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The index of the output item in the response.
   **/
  public RealtimeServerEventResponseFunctionCallArgumentsDelta outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The index of the output item in the response.")
  @JsonProperty("output_index")
  public Integer getOutputIndex() {
    return outputIndex;
  }
  public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  /**
   * The ID of the function call.
   **/
  public RealtimeServerEventResponseFunctionCallArgumentsDelta callId(String callId) {
    this.callId = callId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the function call.")
  @JsonProperty("call_id")
  public String getCallId() {
    return callId;
  }
  public void setCallId(String callId) {
    this.callId = callId;
  }

  /**
   * The arguments delta as a JSON string.
   **/
  public RealtimeServerEventResponseFunctionCallArgumentsDelta delta(String delta) {
    this.delta = delta;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The arguments delta as a JSON string.")
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
    return Objects.equals(eventId, realtimeServerEventResponseFunctionCallArgumentsDelta.eventId) &&
        Objects.equals(type, realtimeServerEventResponseFunctionCallArgumentsDelta.type) &&
        Objects.equals(responseId, realtimeServerEventResponseFunctionCallArgumentsDelta.responseId) &&
        Objects.equals(itemId, realtimeServerEventResponseFunctionCallArgumentsDelta.itemId) &&
        Objects.equals(outputIndex, realtimeServerEventResponseFunctionCallArgumentsDelta.outputIndex) &&
        Objects.equals(callId, realtimeServerEventResponseFunctionCallArgumentsDelta.callId) &&
        Objects.equals(delta, realtimeServerEventResponseFunctionCallArgumentsDelta.delta);
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

