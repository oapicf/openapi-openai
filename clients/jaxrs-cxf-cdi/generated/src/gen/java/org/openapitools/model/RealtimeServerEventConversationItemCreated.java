package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeConversationItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type &#x60;message&#x60;      (role &#x60;assistant&#x60;) or type &#x60;function_call&#x60;.   - The input audio buffer has been committed, either by the client or the      server (in &#x60;server_vad&#x60; mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a &#x60;conversation.item.create&#x60; event to add a new Item      to the Conversation. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. ")
public class RealtimeServerEventConversationItemCreated   {
  
  private String eventId;


public enum TypeEnum {

    @JsonProperty("conversation.item.created") CONVERSATION_ITEM_CREATED(String.valueOf("conversation.item.created"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  private String previousItemId;

  private RealtimeConversationItem item;

  /**
   * The unique ID of the server event.
   **/
  public RealtimeServerEventConversationItemCreated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  @JsonProperty("event_id")
  @NotNull
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  /**
   * The event type, must be &#x60;conversation.item.created&#x60;.
   **/
  public RealtimeServerEventConversationItemCreated type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.item.created`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
   **/
  public RealtimeServerEventConversationItemCreated previousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. ")
  @JsonProperty("previous_item_id")
  @NotNull
  public String getPreviousItemId() {
    return previousItemId;
  }
  public void setPreviousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
  }


  /**
   **/
  public RealtimeServerEventConversationItemCreated item(RealtimeConversationItem item) {
    this.item = item;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("item")
  @NotNull
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

