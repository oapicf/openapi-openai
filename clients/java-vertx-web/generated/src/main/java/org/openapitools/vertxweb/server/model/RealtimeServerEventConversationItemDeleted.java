package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Returned when an item in the conversation is deleted by the client with a  &#x60;conversation.item.delete&#x60; event. This event is used to synchronize the  server&#39;s understanding of the conversation history with the client&#39;s view. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeServerEventConversationItemDeleted   {
  
  private String eventId;


  public enum TypeEnum {
    CONVERSATION_ITEM_DELETED("conversation.item.deleted");

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
  private String itemId;

  public RealtimeServerEventConversationItemDeleted () {

  }

  public RealtimeServerEventConversationItemDeleted (String eventId, TypeEnum type, String itemId) {
    this.eventId = eventId;
    this.type = type;
    this.itemId = itemId;
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

    
  @JsonProperty("item_id")
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
    return Objects.equals(eventId, realtimeServerEventConversationItemDeleted.eventId) &&
        Objects.equals(type, realtimeServerEventConversationItemDeleted.type) &&
        Objects.equals(itemId, realtimeServerEventConversationItemDeleted.itemId);
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
