package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Returned when an earlier assistant audio message item is truncated by the  client with a `conversation.item.truncate` event. This event is used to  synchronize the server's understanding of the audio with the client's playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn't been heard by the user. 
 */
public class RealtimeServerEventConversationItemTruncated   {

    private String eventId;

    /**
    * The event type, must be `conversation.item.truncated`.
    */
    public enum TypeEnum {
        CONVERSATION_ITEM_TRUNCATED("conversation.item.truncated");

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
    private String itemId;
    private Integer contentIndex;
    private Integer audioEndMs;

    /**
     * Default constructor.
     */
    public RealtimeServerEventConversationItemTruncated() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventConversationItemTruncated.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;conversation.item.truncated&#x60;.
     * @param itemId The ID of the assistant message item that was truncated.
     * @param contentIndex The index of the content part that was truncated.
     * @param audioEndMs The duration up to which the audio was truncated, in milliseconds. 
     */
    public RealtimeServerEventConversationItemTruncated(
        String eventId, 
        TypeEnum type, 
        String itemId, 
        Integer contentIndex, 
        Integer audioEndMs
    ) {
        this.eventId = eventId;
        this.type = type;
        this.itemId = itemId;
        this.contentIndex = contentIndex;
        this.audioEndMs = audioEndMs;
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
     * The event type, must be `conversation.item.truncated`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The ID of the assistant message item that was truncated.
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * The index of the content part that was truncated.
     * @return contentIndex
     */
    public Integer getContentIndex() {
        return contentIndex;
    }

    public void setContentIndex(Integer contentIndex) {
        this.contentIndex = contentIndex;
    }

    /**
     * The duration up to which the audio was truncated, in milliseconds. 
     * @return audioEndMs
     */
    public Integer getAudioEndMs() {
        return audioEndMs;
    }

    public void setAudioEndMs(Integer audioEndMs) {
        this.audioEndMs = audioEndMs;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeServerEventConversationItemTruncated {\n");
        
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
        sb.append("    audioEndMs: ").append(toIndentedString(audioEndMs)).append("\n");
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

