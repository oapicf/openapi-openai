package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeConversationItem;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventConversationItemCreated   {
  
  private String eventId;

  /**
   * The event type, must be &#x60;conversation.item.created&#x60;.
   */
  public enum TypeEnum {
    CONVERSATION_ITEM_CREATED("conversation.item.created");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private String previousItemId;
  private RealtimeConversationItem item;

  /**
   * The unique ID of the server event.
   **/
  
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

