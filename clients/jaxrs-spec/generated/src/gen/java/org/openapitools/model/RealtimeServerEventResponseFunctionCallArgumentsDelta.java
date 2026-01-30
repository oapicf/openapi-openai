package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Returned when the model-generated function call arguments are updated. 
 **/
@ApiModel(description = "Returned when the model-generated function call arguments are updated. ")
@JsonTypeName("RealtimeServerEventResponseFunctionCallArgumentsDelta")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventResponseFunctionCallArgumentsDelta   {
  private String eventId;
  public enum TypeEnum {

    RESPONSE_FUNCTION_CALL_ARGUMENTS_DELTA(String.valueOf("response.function_call_arguments.delta"));


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

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static TypeEnum fromString(String s) {
        for (TypeEnum b : TypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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
  }

  @JsonCreator
  public RealtimeServerEventResponseFunctionCallArgumentsDelta(
    @JsonProperty(required = true, value = "event_id") String eventId,
    @JsonProperty(required = true, value = "type") TypeEnum type,
    @JsonProperty(required = true, value = "response_id") String responseId,
    @JsonProperty(required = true, value = "item_id") String itemId,
    @JsonProperty(required = true, value = "output_index") Integer outputIndex,
    @JsonProperty(required = true, value = "call_id") String callId,
    @JsonProperty(required = true, value = "delta") String delta
  ) {
    this.eventId = eventId;
    this.type = type;
    this.responseId = responseId;
    this.itemId = itemId;
    this.outputIndex = outputIndex;
    this.callId = callId;
    this.delta = delta;
  }

  /**
   * The unique ID of the server event.
   **/
  public RealtimeServerEventResponseFunctionCallArgumentsDelta eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  @JsonProperty(required = true, value = "event_id")
  @NotNull public String getEventId() {
    return eventId;
  }

  @JsonProperty(required = true, value = "event_id")
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be &#x60;response.function_call_arguments.delta&#x60;. 
   **/
  public RealtimeServerEventResponseFunctionCallArgumentsDelta type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `response.function_call_arguments.delta`. ")
  @JsonProperty(required = true, value = "type")
  @NotNull public TypeEnum getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
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
  @JsonProperty(required = true, value = "response_id")
  @NotNull public String getResponseId() {
    return responseId;
  }

  @JsonProperty(required = true, value = "response_id")
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
  @JsonProperty(required = true, value = "item_id")
  @NotNull public String getItemId() {
    return itemId;
  }

  @JsonProperty(required = true, value = "item_id")
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
  @JsonProperty(required = true, value = "output_index")
  @NotNull public Integer getOutputIndex() {
    return outputIndex;
  }

  @JsonProperty(required = true, value = "output_index")
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
  @JsonProperty(required = true, value = "call_id")
  @NotNull public String getCallId() {
    return callId;
  }

  @JsonProperty(required = true, value = "call_id")
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
  @JsonProperty(required = true, value = "delta")
  @NotNull public String getDelta() {
    return delta;
  }

  @JsonProperty(required = true, value = "delta")
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

