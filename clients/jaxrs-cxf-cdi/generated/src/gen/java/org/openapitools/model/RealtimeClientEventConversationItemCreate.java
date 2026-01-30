package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeConversationItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Add a new Item to the Conversation&#39;s context, including messages, function  calls, and function call responses. This event can be used both to populate a  \&quot;history\&quot; of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a &#x60;conversation.item.created&#x60;  event, otherwise an &#x60;error&#x60; event will be sent. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Add a new Item to the Conversation's context, including messages, function  calls, and function call responses. This event can be used both to populate a  \"history\" of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a `conversation.item.created`  event, otherwise an `error` event will be sent. ")
public class RealtimeClientEventConversationItemCreate   {
  
  private String eventId;


public enum TypeEnum {

    @JsonProperty("conversation.item.create") CONVERSATION_ITEM_CREATE(String.valueOf("conversation.item.create"));


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
   * Optional client-generated ID used to identify this event.
   **/
  public RealtimeClientEventConversationItemCreate eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(value = "Optional client-generated ID used to identify this event.")
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }


  /**
   * The event type, must be &#x60;conversation.item.create&#x60;.
   **/
  public RealtimeClientEventConversationItemCreate type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.item.create`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. 
   **/
  public RealtimeClientEventConversationItemCreate previousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. ")
  @JsonProperty("previous_item_id")
  public String getPreviousItemId() {
    return previousItemId;
  }
  public void setPreviousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
  }


  /**
   **/
  public RealtimeClientEventConversationItemCreate item(RealtimeConversationItem item) {
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
    RealtimeClientEventConversationItemCreate realtimeClientEventConversationItemCreate = (RealtimeClientEventConversationItemCreate) o;
    return Objects.equals(this.eventId, realtimeClientEventConversationItemCreate.eventId) &&
        Objects.equals(this.type, realtimeClientEventConversationItemCreate.type) &&
        Objects.equals(this.previousItemId, realtimeClientEventConversationItemCreate.previousItemId) &&
        Objects.equals(this.item, realtimeClientEventConversationItemCreate.item);
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

