package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The `item_id` property is the ID of the user message item that will be created, thus a `conversation.item.created` event  will also be sent to the client. 
 */
public class RealtimeServerEventInputAudioBufferCommitted   {

    private String eventId;

    /**
    * The event type, must be `input_audio_buffer.committed`.
    */
    public enum TypeEnum {
        INPUT_AUDIO_BUFFER_COMMITTED("input_audio_buffer.committed");

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
    private String itemId;

    /**
     * Default constructor.
     */
    public RealtimeServerEventInputAudioBufferCommitted() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventInputAudioBufferCommitted.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;input_audio_buffer.committed&#x60;.
     * @param previousItemId The ID of the preceding item after which the new item will be inserted. 
     * @param itemId The ID of the user message item that will be created.
     */
    public RealtimeServerEventInputAudioBufferCommitted(
        String eventId, 
        TypeEnum type, 
        String previousItemId, 
        String itemId
    ) {
        this.eventId = eventId;
        this.type = type;
        this.previousItemId = previousItemId;
        this.itemId = itemId;
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
     * The event type, must be `input_audio_buffer.committed`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The ID of the preceding item after which the new item will be inserted. 
     * @return previousItemId
     */
    public String getPreviousItemId() {
        return previousItemId;
    }

    public void setPreviousItemId(String previousItemId) {
        this.previousItemId = previousItemId;
    }

    /**
     * The ID of the user message item that will be created.
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeServerEventInputAudioBufferCommitted {\n");
        
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    previousItemId: ").append(toIndentedString(previousItemId)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

