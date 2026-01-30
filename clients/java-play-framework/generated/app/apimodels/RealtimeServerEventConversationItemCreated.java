package apimodels;

import apimodels.RealtimeConversationItem;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type &#x60;message&#x60;      (role &#x60;assistant&#x60;) or type &#x60;function_call&#x60;.   - The input audio buffer has been committed, either by the client or the      server (in &#x60;server_vad&#x60; mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a &#x60;conversation.item.create&#x60; event to add a new Item      to the Conversation. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RealtimeServerEventConversationItemCreated   {
  @JsonProperty("event_id")
  @NotNull

  private String eventId;

  /**
   * The event type, must be `conversation.item.created`.
   */
  public enum TypeEnum {
    CONVERSATION_ITEM_CREATED("conversation.item.created");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
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

  @JsonProperty("type")
  @NotNull

  private TypeEnum type;

  @JsonProperty("previous_item_id")
  @NotNull

  private String previousItemId;

  @JsonProperty("item")
  @NotNull
@Valid

  private RealtimeConversationItem item;

  public RealtimeServerEventConversationItemCreated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The unique ID of the server event.
   * @return eventId
  **/
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventConversationItemCreated type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The event type, must be `conversation.item.created`.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventConversationItemCreated previousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
    return this;
  }

   /**
   * The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
   * @return previousItemId
  **/
  public String getPreviousItemId() {
    return previousItemId;
  }

  public void setPreviousItemId(String previousItemId) {
    this.previousItemId = previousItemId;
  }

  public RealtimeServerEventConversationItemCreated item(RealtimeConversationItem item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
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
    return Objects.equals(eventId, realtimeServerEventConversationItemCreated.eventId) &&
        Objects.equals(type, realtimeServerEventConversationItemCreated.type) &&
        Objects.equals(previousItemId, realtimeServerEventConversationItemCreated.previousItemId) &&
        Objects.equals(item, realtimeServerEventConversationItemCreated.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, previousItemId, item);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

