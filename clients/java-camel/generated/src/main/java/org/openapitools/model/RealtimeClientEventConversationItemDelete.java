package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Send this event when you want to remove any item from the conversation  history. The server will respond with a &#x60;conversation.item.deleted&#x60; event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
 */

@Schema(name = "RealtimeClientEventConversationItemDelete", description = "Send this event when you want to remove any item from the conversation  history. The server will respond with a `conversation.item.deleted` event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeClientEventConversationItemDelete {

  private String eventId;

  /**
   * The event type, must be `conversation.item.delete`.
   */
  public enum TypeEnum {
    CONVERSATION_ITEM_DELETE("conversation.item.delete");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private TypeEnum type;

  private String itemId;

  public RealtimeClientEventConversationItemDelete() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeClientEventConversationItemDelete(TypeEnum type, String itemId) {
    this.type = type;
    this.itemId = itemId;
  }

  public RealtimeClientEventConversationItemDelete eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Optional client-generated ID used to identify this event.
   * @return eventId
   */
  
  @Schema(name = "event_id", description = "Optional client-generated ID used to identify this event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeClientEventConversationItemDelete type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The event type, must be `conversation.item.delete`.
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `conversation.item.delete`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeClientEventConversationItemDelete itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The ID of the item to delete.
   * @return itemId
   */
  @NotNull 
  @Schema(name = "item_id", description = "The ID of the item to delete.", requiredMode = Schema.RequiredMode.REQUIRED)
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

