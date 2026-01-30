package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.RealtimeServerEventConversationCreatedConversation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Returned when a conversation is created. Emitted right after session creation. 
 */

@Schema(name = "RealtimeServerEventConversationCreated", description = "Returned when a conversation is created. Emitted right after session creation. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RealtimeServerEventConversationCreated {

  private String eventId;

  /**
   * The event type, must be `conversation.created`.
   */
  public enum TypeEnum {
    CONVERSATION_CREATED("conversation.created");

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

  private RealtimeServerEventConversationCreatedConversation conversation;

  public RealtimeServerEventConversationCreated() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RealtimeServerEventConversationCreated(String eventId, TypeEnum type, RealtimeServerEventConversationCreatedConversation conversation) {
    this.eventId = eventId;
    this.type = type;
    this.conversation = conversation;
  }

  public RealtimeServerEventConversationCreated eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * The unique ID of the server event.
   * @return eventId
   */
  @NotNull 
  @Schema(name = "event_id", description = "The unique ID of the server event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_id")
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
   */
  @NotNull 
  @Schema(name = "type", description = "The event type, must be `conversation.created`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
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
   */
  @NotNull @Valid 
  @Schema(name = "conversation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("conversation")
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

