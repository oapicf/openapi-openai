package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Returned when an item in the conversation is deleted by the client with a  &#x60;conversation.item.delete&#x60; event. This event is used to synchronize the  server&#39;s understanding of the conversation history with the client&#39;s view. 
 */
@ApiModel(description = "Returned when an item in the conversation is deleted by the client with a  `conversation.item.delete` event. This event is used to synchronize the  server's understanding of the conversation history with the client's view. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventConversationItemDeleted   {
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be `conversation.item.deleted`.
   */
  public enum TypeEnum {
    CONVERSATION_ITEM_DELETED("conversation.item.deleted");

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

  @JsonProperty("item_id")
  private String itemId;

  public RealtimeServerEventConversationItemDeleted eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The unique ID of the server event.
   * @return eventId
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventConversationItemDeleted type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The event type, must be `conversation.item.deleted`.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.item.deleted`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventConversationItemDeleted itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The ID of the item that was deleted.
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The ID of the item that was deleted.")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventConversationItemDeleted realtimeServerEventConversationItemDeleted = (RealtimeServerEventConversationItemDeleted) o;
    return Objects.equals(this.eventId, realtimeServerEventConversationItemDeleted.eventId) &&
        Objects.equals(this.type, realtimeServerEventConversationItemDeleted.type) &&
        Objects.equals(this.itemId, realtimeServerEventConversationItemDeleted.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventConversationItemDeleted {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

