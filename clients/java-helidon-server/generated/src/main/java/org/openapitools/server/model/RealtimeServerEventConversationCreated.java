package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RealtimeServerEventConversationCreatedConversation;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Returned when a conversation is created. Emitted right after session creation. 
 */
public class RealtimeServerEventConversationCreated   {

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

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
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


    private TypeEnum type;
    private RealtimeServerEventConversationCreatedConversation conversation;

    /**
     * Default constructor.
     */
    public RealtimeServerEventConversationCreated() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventConversationCreated.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;conversation.created&#x60;.
     * @param conversation conversation
     */
    public RealtimeServerEventConversationCreated(
        String eventId, 
        TypeEnum type, 
        RealtimeServerEventConversationCreatedConversation conversation
    ) {
        this.eventId = eventId;
        this.type = type;
        this.conversation = conversation;
    }



    /**
     * The unique ID of the server event.
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * The event type, must be `conversation.created`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get conversation
     * @return conversation
     */
    public RealtimeServerEventConversationCreatedConversation getConversation() {
        return conversation;
    }

    public void setConversation(RealtimeServerEventConversationCreatedConversation conversation) {
        this.conversation = conversation;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

