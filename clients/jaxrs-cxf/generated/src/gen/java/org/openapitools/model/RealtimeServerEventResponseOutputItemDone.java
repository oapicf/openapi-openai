package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RealtimeConversationItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 
 */
@ApiModel(description="Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. ")

public class RealtimeServerEventResponseOutputItemDone  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")

  private String eventId;

public enum TypeEnum {

RESPONSE_OUTPUT_ITEM_DONE(String.valueOf("response.output_item.done"));


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
  * The event type, must be `response.output_item.done`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `response.output_item.done`.")

  private TypeEnum type;

 /**
  * The ID of the Response to which the item belongs.
  */
  @ApiModelProperty(required = true, value = "The ID of the Response to which the item belongs.")

  private String responseId;

 /**
  * The index of the output item in the Response.
  */
  @ApiModelProperty(required = true, value = "The index of the output item in the Response.")

  private Integer outputIndex;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private RealtimeConversationItem item;
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

  public RealtimeServerEventResponseOutputItemDone eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;response.output_item.done&#x60;.
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

  public RealtimeServerEventResponseOutputItemDone type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The ID of the Response to which the item belongs.
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

  public RealtimeServerEventResponseOutputItemDone responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

 /**
   * The index of the output item in the Response.
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

  public RealtimeServerEventResponseOutputItemDone outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

 /**
   * Get item
   * @return item
  **/
  @JsonProperty("item")
  @NotNull
  public RealtimeConversationItem getItem() {
    return item;
  }

  public void setItem(RealtimeConversationItem item) {
    this.item = item;
  }

  public RealtimeServerEventResponseOutputItemDone item(RealtimeConversationItem item) {
    this.item = item;
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
    RealtimeServerEventResponseOutputItemDone realtimeServerEventResponseOutputItemDone = (RealtimeServerEventResponseOutputItemDone) o;
    return Objects.equals(this.eventId, realtimeServerEventResponseOutputItemDone.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseOutputItemDone.type) &&
        Objects.equals(this.responseId, realtimeServerEventResponseOutputItemDone.responseId) &&
        Objects.equals(this.outputIndex, realtimeServerEventResponseOutputItemDone.outputIndex) &&
        Objects.equals(this.item, realtimeServerEventResponseOutputItemDone.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, outputIndex, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseOutputItemDone {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    outputIndex: ").append(toIndentedString(outputIndex)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

