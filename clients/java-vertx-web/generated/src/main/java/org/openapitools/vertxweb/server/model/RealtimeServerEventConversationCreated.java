package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.RealtimeServerEventConversationCreatedConversation;

/**
 * Returned when a conversation is created. Emitted right after session creation. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeServerEventConversationCreated   {
  
  private String eventId;


  public enum TypeEnum {
    CONVERSATION_CREATED("conversation.created");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private RealtimeServerEventConversationCreatedConversation conversation;

  public RealtimeServerEventConversationCreated () {

  }

  public RealtimeServerEventConversationCreated (String eventId, TypeEnum type, RealtimeServerEventConversationCreatedConversation conversation) {
    this.eventId = eventId;
    this.type = type;
    this.conversation = conversation;
  }

    
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
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
    return Objects.equals(eventId, realtimeServerEventConversationCreated.eventId) &&
        Objects.equals(type, realtimeServerEventConversationCreated.type) &&
        Objects.equals(conversation, realtimeServerEventConversationCreated.conversation);
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
