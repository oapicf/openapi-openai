package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
 */
@ApiModel(description="Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. ")

public class RealtimeClientEventConversationItemDelete  {
  
 /**
  * Optional client-generated ID used to identify this event.
  */
  @ApiModelProperty(value = "Optional client-generated ID used to identify this event.")
  private String eventId;

public enum TypeEnum {

    @JsonProperty("conversation.item.delete") CONVERSATION_ITEM_DELETE(String.valueOf("conversation.item.delete"));

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
  * The event type, must be `conversation.item.delete`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.item.delete`.")
  private TypeEnum type;

 /**
  * The ID of the item to delete.
  */
  @ApiModelProperty(required = true, value = "The ID of the item to delete.")
  private String itemId;
 /**
  * Optional client-generated ID used to identify this event.
  * @return eventId
  */
  @JsonProperty("event_id")
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
  public RealtimeClientEventConversationItemDelete eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
  * The event type, must be &#x60;conversation.item.delete&#x60;.
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
  public RealtimeClientEventConversationItemDelete type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The ID of the item to delete.
  * @return itemId
  */
  @JsonProperty("item_id")
  @NotNull
  public String getItemId() {
    return itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
 public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Sets the <code>itemId</code> property.
   */
  public RealtimeClientEventConversationItemDelete itemId(String itemId) {
    this.itemId = itemId;
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
    RealtimeClientEventConversationItemDelete realtimeClientEventConversationItemDelete = (RealtimeClientEventConversationItemDelete) o;
    return Objects.equals(this.eventId, realtimeClientEventConversationItemDelete.eventId) &&
        Objects.equals(this.type, realtimeClientEventConversationItemDelete.type) &&
        Objects.equals(this.itemId, realtimeClientEventConversationItemDelete.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeClientEventConversationItemDelete {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

