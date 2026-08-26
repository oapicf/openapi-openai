package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server's understanding of the audio with  the client's playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn't been heard by the user.  If successful, the server will respond with a `conversation.item.truncated`  event.  
 */
public class RealtimeClientEventConversationItemTruncate   {

    private String eventId;

    /**
    * The event type, must be `conversation.item.truncate`.
    */
    public enum TypeEnum {
        CONVERSATION_ITEM_TRUNCATE("conversation.item.truncate");

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
    public RealtimeClientEventConversationItemTruncate() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeClientEventConversationItemTruncate.
     *
     * @param eventId Optional client-generated ID used to identify this event.
     * @param type The event type, must be &#x60;conversation.item.truncate&#x60;.
     * @param itemId The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
     * @param contentIndex The index of the content part to truncate. Set this to 0.
     * @param audioEndMs Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
     */
    public RealtimeClientEventConversationItemTruncate(
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
     * The event type, must be `conversation.item.truncate`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * The index of the content part to truncate. Set this to 0.
     * @return contentIndex
     */
    public Integer getContentIndex() {
        return contentIndex;
    }

    public void setContentIndex(Integer contentIndex) {
        this.contentIndex = contentIndex;
    }

    /**
     * Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
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
        sb.append("class RealtimeClientEventConversationItemTruncate {\n");
        
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

