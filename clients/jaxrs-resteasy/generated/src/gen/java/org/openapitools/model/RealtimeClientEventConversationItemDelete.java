package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeClientEventConversationItemDelete   {
  
  private String eventId;

  /**
   * The event type, must be &#x60;conversation.item.delete&#x60;.
   */
  public enum TypeEnum {
    CONVERSATION_ITEM_DELETE("conversation.item.delete");
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
  private String itemId;

  /**
   * Optional client-generated ID used to identify this event.
   **/
  
  @ApiModelProperty(value = "Optional client-generated ID used to identify this event.")
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The event type, must be &#x60;conversation.item.delete&#x60;.
   **/
  
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.item.delete`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The ID of the item to delete.
   **/
  
  @ApiModelProperty(required = true, value = "The ID of the item to delete.")
  @JsonProperty("item_id")
  @NotNull
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

