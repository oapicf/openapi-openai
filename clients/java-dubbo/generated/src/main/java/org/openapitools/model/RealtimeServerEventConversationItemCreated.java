package org.openapitools.model;

import org.openapitools.model.RealtimeConversationItem;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type &#x60;message&#x60;      (role &#x60;assistant&#x60;) or type &#x60;function_call&#x60;.   - The input audio buffer has been committed, either by the client or the      server (in &#x60;server_vad&#x60; mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a &#x60;conversation.item.create&#x60; event to add a new Item      to the Conversation. 
 */
public class RealtimeServerEventConversationItemCreated implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The unique ID of the server event.
   */
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be &#x60;conversation.item.created&#x60;.
   */
  @JsonProperty("type")
  private String type;

  /**
   * The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
   */
  @JsonProperty("previous_item_id")
  private String previousItemId;

  @JsonProperty("item")
  private RealtimeConversationItem item;

  /**
   * The unique ID of the server event.
   * @return eventId
   */
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be &#x60;conversation.item.created&#x60;.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
   * @return previousItemId
   */
  public String getPreviousItemId() {
    return previousItemId;
  }

  public void setPreviousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
  }

  /**
   * 
   * @return item
   */
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
    RealtimeServerEventConversationItemCreated realtimeServerEventConversationItemCreated = (RealtimeServerEventConversationItemCreated) o;
    return Objects.equals(this.eventId, realtimeServerEventConversationItemCreated.eventId) &&
        Objects.equals(this.type, realtimeServerEventConversationItemCreated.type) &&
        Objects.equals(this.previousItemId, realtimeServerEventConversationItemCreated.previousItemId) &&
        Objects.equals(this.item, realtimeServerEventConversationItemCreated.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, previousItemId, item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventConversationItemCreated {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
