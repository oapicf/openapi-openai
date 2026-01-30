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
 * Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. 
 */
@ApiModel(description="Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. ")

public class RealtimeServerEventConversationItemCreated  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")

  private String eventId;

public enum TypeEnum {

CONVERSATION_ITEM_CREATED(String.valueOf("conversation.item.created"));


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
  * The event type, must be `conversation.item.created`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.item.created`.")

  private TypeEnum type;

 /**
  * The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
  */
  @ApiModelProperty(required = true, value = "The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. ")

  private String previousItemId;

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

  public RealtimeServerEventConversationItemCreated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;conversation.item.created&#x60;.
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

  public RealtimeServerEventConversationItemCreated type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
   * @return previousItemId
  **/
  @JsonProperty("previous_item_id")
  @NotNull
  public String getPreviousItemId() {
    return previousItemId;
  }

  public void setPreviousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
  }

  public RealtimeServerEventConversationItemCreated previousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
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

  public RealtimeServerEventConversationItemCreated item(RealtimeConversationItem item) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

