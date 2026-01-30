package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RealtimeServerEventConversationCreatedConversation;

/**
 * Returned when a conversation is created. Emitted right after session creation. 
 */
@ApiModel(description = "Returned when a conversation is created. Emitted right after session creation. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventConversationCreated   {
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The event type, must be `conversation.created`.
   */
  public enum TypeEnum {
    CONVERSATION_CREATED("conversation.created");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("conversation")
  private RealtimeServerEventConversationCreatedConversation conversation;

  public RealtimeServerEventConversationCreated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The unique ID of the server event.
   * @return eventId
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public RealtimeServerEventConversationCreated type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The event type, must be `conversation.created`.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.created`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RealtimeServerEventConversationCreated conversation(RealtimeServerEventConversationCreatedConversation conversation) {
    this.conversation = conversation;
    return this;
  }

   /**
   * Get conversation
   * @return conversation
  **/
  @ApiModelProperty(required = true, value = "")
  public RealtimeServerEventConversationCreatedConversation getConversation() {
    return conversation;
  }

  public void setConversation(RealtimeServerEventConversationCreatedConversation conversation) {
    this.conversation = conversation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeServerEventConversationCreated realtimeServerEventConversationCreated = (RealtimeServerEventConversationCreated) o;
    return Objects.equals(this.eventId, realtimeServerEventConversationCreated.eventId) &&
        Objects.equals(this.type, realtimeServerEventConversationCreated.type) &&
        Objects.equals(this.conversation, realtimeServerEventConversationCreated.conversation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, type, conversation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeServerEventConversationCreated {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
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

