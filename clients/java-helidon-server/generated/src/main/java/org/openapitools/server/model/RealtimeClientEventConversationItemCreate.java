package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RealtimeConversationItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Add a new Item to the Conversation's context, including messages, function  calls, and function call responses. This event can be used both to populate a  \"history\" of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a `conversation.item.created`  event, otherwise an `error` event will be sent. 
 */
public class RealtimeClientEventConversationItemCreate   {

    private String eventId;

    /**
    * The event type, must be `conversation.item.create`.
    */
    public enum TypeEnum {
        CONVERSATION_ITEM_CREATE("conversation.item.create");

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
    public RealtimeClientEventConversationItemCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeClientEventConversationItemCreate.
     *
     * @param eventId Optional client-generated ID used to identify this event.
     * @param type The event type, must be &#x60;conversation.item.create&#x60;.
     * @param previousItemId The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. 
     * @param item item
     */
    public RealtimeClientEventConversationItemCreate(
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
     * Optional client-generated ID used to identify this event.
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * The event type, must be `conversation.item.create`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. 
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

