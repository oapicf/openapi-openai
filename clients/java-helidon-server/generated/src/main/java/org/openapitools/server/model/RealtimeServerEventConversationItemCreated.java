package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RealtimeConversationItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type `message`      (role `assistant`) or type `function_call`.   - The input audio buffer has been committed, either by the client or the      server (in `server_vad` mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a `conversation.item.create` event to add a new Item      to the Conversation. 
 */
public class RealtimeServerEventConversationItemCreated   {

    private String eventId;

    /**
    * The event type, must be `conversation.item.created`.
    */
    public enum TypeEnum {
        CONVERSATION_ITEM_CREATED("conversation.item.created");

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
    private String previousItemId;
    private RealtimeConversationItem item;

    /**
     * Default constructor.
     */
    public RealtimeServerEventConversationItemCreated() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventConversationItemCreated.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;conversation.item.created&#x60;.
     * @param previousItemId The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
     * @param item item
     */
    public RealtimeServerEventConversationItemCreated(
        String eventId, 
        TypeEnum type, 
        String previousItemId, 
        RealtimeConversationItem item
    ) {
        this.eventId = eventId;
        this.type = type;
        this.previousItemId = previousItemId;
        this.item = item;
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
     * The event type, must be `conversation.item.created`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
     * @return previousItemId
     */
    public String getPreviousItemId() {
        return previousItemId;
    }

    public void setPreviousItemId(String previousItemId) {
        this.previousItemId = previousItemId;
    }

    /**
     * Get item
     * @return item
     */
    public RealtimeConversationItem getItem() {
        return item;
    }

    public void setItem(RealtimeConversationItem item) {
        this.item = item;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

