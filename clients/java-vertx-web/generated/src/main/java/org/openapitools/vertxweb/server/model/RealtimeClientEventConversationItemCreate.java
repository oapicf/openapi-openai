package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.RealtimeConversationItem;

/**
 * Add a new Item to the Conversation&#39;s context, including messages, function  calls, and function call responses. This event can be used both to populate a  \&quot;history\&quot; of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a &#x60;conversation.item.created&#x60;  event, otherwise an &#x60;error&#x60; event will be sent. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeClientEventConversationItemCreate   {
  
  private String eventId;


  public enum TypeEnum {
    CONVERSATION_ITEM_CREATE("conversation.item.create");

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
  private String previousItemId;
  private RealtimeConversationItem item;

  public RealtimeClientEventConversationItemCreate () {

  }

  public RealtimeClientEventConversationItemCreate (String eventId, TypeEnum type, String previousItemId, RealtimeConversationItem item) {
    this.eventId = eventId;
    this.type = type;
    this.previousItemId = previousItemId;
    this.item = item;
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

    
  @JsonProperty("previous_item_id")
  public String getPreviousItemId() {
    return previousItemId;
  }
  public void setPreviousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
  }

    
  @JsonProperty("item")
  public RealtimeConversationItem getItem() {
    return item;
  }
  public void setItem(RealtimeConversationItem item) {
    this.item = item;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeClientEventConversationItemCreate realtimeClientEventConversationItemCreate = (RealtimeClientEventConversationItemCreate) o;
    return Objects.equals(eventId, realtimeClientEventConversationItemCreate.eventId) &&
        Objects.equals(type, realtimeClientEventConversationItemCreate.type) &&
        Objects.equals(previousItemId, realtimeClientEventConversationItemCreate.previousItemId) &&
        Objects.equals(item, realtimeClientEventConversationItemCreate.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, previousItemId, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeClientEventConversationItemCreate {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    previousItemId: ").append(toIndentedString(previousItemId)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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
