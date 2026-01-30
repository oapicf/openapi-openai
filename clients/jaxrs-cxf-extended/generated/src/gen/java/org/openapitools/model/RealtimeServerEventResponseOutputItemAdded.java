package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RealtimeConversationItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Returned when a new Item is created during Response generation.
 */
@ApiModel(description="Returned when a new Item is created during Response generation.")

public class RealtimeServerEventResponseOutputItemAdded  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  private String eventId;

public enum TypeEnum {

    @JsonProperty("response.output_item.added") RESPONSE_OUTPUT_ITEM_ADDED(String.valueOf("response.output_item.added"));

    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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
  * The event type, must be `response.output_item.added`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `response.output_item.added`.")
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
  */
  @JsonProperty("event_id")
  @NotNull
  public String getEventId() {
    return eventId;
  }

  /**
   * Sets the <code>eventId</code> property.
   */
 public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * Sets the <code>eventId</code> property.
   */
  public RealtimeServerEventResponseOutputItemAdded eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
  * The event type, must be &#x60;response.output_item.added&#x60;.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public RealtimeServerEventResponseOutputItemAdded type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The ID of the Response to which the item belongs.
  * @return responseId
  */
  @JsonProperty("response_id")
  @NotNull
  public String getResponseId() {
    return responseId;
  }

  /**
   * Sets the <code>responseId</code> property.
   */
 public void setResponseId(String responseId) {
    this.responseId = responseId;
  }

  /**
   * Sets the <code>responseId</code> property.
   */
  public RealtimeServerEventResponseOutputItemAdded responseId(String responseId) {
    this.responseId = responseId;
    return this;
  }

 /**
  * The index of the output item in the Response.
  * @return outputIndex
  */
  @JsonProperty("output_index")
  @NotNull
  public Integer getOutputIndex() {
    return outputIndex;
  }

  /**
   * Sets the <code>outputIndex</code> property.
   */
 public void setOutputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
  }

  /**
   * Sets the <code>outputIndex</code> property.
   */
  public RealtimeServerEventResponseOutputItemAdded outputIndex(Integer outputIndex) {
    this.outputIndex = outputIndex;
    return this;
  }

 /**
  * Get item
  * @return item
  */
  @JsonProperty("item")
  @NotNull
  public RealtimeConversationItem getItem() {
    return item;
  }

  /**
   * Sets the <code>item</code> property.
   */
 public void setItem(RealtimeConversationItem item) {
    this.item = item;
  }

  /**
   * Sets the <code>item</code> property.
   */
  public RealtimeServerEventResponseOutputItemAdded item(RealtimeConversationItem item) {
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
    RealtimeServerEventResponseOutputItemAdded realtimeServerEventResponseOutputItemAdded = (RealtimeServerEventResponseOutputItemAdded) o;
    return Objects.equals(this.eventId, realtimeServerEventResponseOutputItemAdded.eventId) &&
        Objects.equals(this.type, realtimeServerEventResponseOutputItemAdded.type) &&
        Objects.equals(this.responseId, realtimeServerEventResponseOutputItemAdded.responseId) &&
        Objects.equals(this.outputIndex, realtimeServerEventResponseOutputItemAdded.outputIndex) &&
        Objects.equals(this.item, realtimeServerEventResponseOutputItemAdded.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, responseId, outputIndex, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventResponseOutputItemAdded {\n");
    
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

