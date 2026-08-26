package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RealtimeServerEventConversationItemInputAudioTranscriptionFailedError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 
 */
public class RealtimeServerEventConversationItemInputAudioTranscriptionFailed   {

    private String eventId;

    /**
    * The event type, must be `conversation.item.input_audio_transcription.failed`. 
    */
    public enum TypeEnum {
        CONVERSATION_ITEM_INPUT_AUDIO_TRANSCRIPTION_FAILED("conversation.item.input_audio_transcription.failed");

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
    private RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error;

    /**
     * Default constructor.
     */
    public RealtimeServerEventConversationItemInputAudioTranscriptionFailed() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventConversationItemInputAudioTranscriptionFailed.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;. 
     * @param itemId The ID of the user message item.
     * @param contentIndex The index of the content part containing the audio.
     * @param error error
     */
    public RealtimeServerEventConversationItemInputAudioTranscriptionFailed(
        String eventId, 
        TypeEnum type, 
        String itemId, 
        Integer contentIndex, 
        RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error
    ) {
        this.eventId = eventId;
        this.type = type;
        this.itemId = itemId;
        this.contentIndex = contentIndex;
        this.error = error;
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
     * The event type, must be `conversation.item.input_audio_transcription.failed`. 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The ID of the user message item.
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * The index of the content part containing the audio.
     * @return contentIndex
     */
    public Integer getContentIndex() {
        return contentIndex;
    }

    public void setContentIndex(Integer contentIndex) {
        this.contentIndex = contentIndex;
    }

    /**
     * Get error
     * @return error
     */
    public RealtimeServerEventConversationItemInputAudioTranscriptionFailedError getError() {
        return error;
    }

    public void setError(RealtimeServerEventConversationItemInputAudioTranscriptionFailedError error) {
        this.error = error;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeServerEventConversationItemInputAudioTranscriptionFailed {\n");
        
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

