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
 * Returned when the text value of a \"text\" content part is updated.
 */
@ApiModel(description="Returned when the text value of a \"text\" content part is updated.")

public class RealtimeServerEventResponseTextDelta  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")

  private String eventId;

public enum TypeEnum {

RESPONSE_TEXT_DELTA(String.valueOf("response.text.delta"));


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
  * The event type, must be `response.text.delta`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `response.text.delta`.")

  private TypeEnum type;

 /**
  * The ID of the response.
  */
  @ApiModelProperty(required = true, value = "The ID of the response.")

  private String responseId;

 /**
  * The ID of the item.
  */
  @ApiModelProperty(required = true, value = "The ID of the item.")

  private String itemId;

 /**
  * The index of the output item in the response.
  */
  @ApiModelProperty(required = true, value = "The index of the output item in the response.")

  private Integer outputIndex;

 /**
  * The index of the content part in the item's content array.
  */
  @ApiModelProperty(required = true, value = "The index of the content part in the item's content array.")

  private Integer contentIndex;

 /**
  * The text delta.
  */
  @ApiModelProperty(required = true, value = "The text delta.")

  private String delta;
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

  public RealtimeServerEventResponseTextDelta eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;response.text.delta&#x60;.
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

  public RealtimeServerEventResponseTextDelta type(TypeEnum type) {
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

  public RealtimeServerEventResponseTextDelta responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

 /**
   * The ID of the item.
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

  public RealtimeServerEventResponseTextDelta itemId(String itemId) {
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

  public RealtimeServerEventResponseTextDelta outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

 /**
   * The index of the content part in the item&#39;s content array.
   * @return contentIndex
  **/
  @JsonProperty("content_index")
  @NotNull
  public Integer getContentIndex() {
    return contentIndex;
  }

  public void setContentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
  }

  public RealtimeServerEventResponseTextDelta contentIndex(Integer contentIndex) {
    this.contentIndex = contentIndex;
    return this;
  }

 /**
   * The text delta.
   * @return delta
  **/
  @JsonProperty("delta")
  @NotNull
  public String getDelta() {
    return delta;
  }

  public void setDelta(String delta) {
    this.delta = delta;
  }

  public RealtimeServerEventResponseTextDelta delta(String delta) {
    this.delta = delta;
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
    RealtimeServerEventResponseTextDelta realtimeServerEventResponseTextDelta = (RealtimeServerEventResponseTextDelta) o;
    return Objects.equals(this.eventId, realtimeServerEventResponseTextDelta.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseTextDelta.type) &&
        Objects.equals(this.responseId, realtimeServerEventResponseTextDelta.responseId) &&
        Objects.equals(this.itemId, realtimeServerEventResponseTextDelta.itemId) &&
        Objects.equals(this.outputIndex, realtimeServerEventResponseTextDelta.outputIndex) &&
        Objects.equals(this.contentIndex, realtimeServerEventResponseTextDelta.contentIndex) &&
        Objects.equals(this.delta, realtimeServerEventResponseTextDelta.delta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, itemId, outputIndex, contentIndex, delta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseTextDelta {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
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

