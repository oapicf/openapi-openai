package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RealtimeServerEventConversationCreatedConversation;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Returned when a conversation is created. Emitted right after session creation. 
 */
@ApiModel(description="Returned when a conversation is created. Emitted right after session creation. ")

public class RealtimeServerEventConversationCreated  {
  
 /**
  * The unique ID of the server event.
  */
  @ApiModelProperty(required = true, value = "The unique ID of the server event.")

  private String eventId;

public enum TypeEnum {

CONVERSATION_CREATED(String.valueOf("conversation.created"));


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
  * The event type, must be `conversation.created`.
  */
  @ApiModelProperty(required = true, value = "The event type, must be `conversation.created`.")

  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private RealtimeServerEventConversationCreatedConversation conversation;
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

  public RealtimeServerEventConversationCreated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * The event type, must be &#x60;conversation.created&#x60;.
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

  public RealtimeServerEventConversationCreated type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get conversation
   * @return conversation
  **/
  @JsonProperty("conversation")
  @NotNull
  public RealtimeServerEventConversationCreatedConversation getConversation() {
    return conversation;
  }

  public void setConversation(RealtimeServerEventConversationCreatedConversation conversation) {
    this.conversation = conversation;
  }

  public RealtimeServerEventConversationCreated conversation(RealtimeServerEventConversationCreatedConversation conversation) {
    this.conversation = conversation;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

