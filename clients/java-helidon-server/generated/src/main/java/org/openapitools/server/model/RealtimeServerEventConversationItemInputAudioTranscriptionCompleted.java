package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model's interpretation, and should be treated as a rough guide. 
 */
public class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted   {

    private String eventId;

    /**
    * The event type, must be `conversation.item.input_audio_transcription.completed`. 
    */
    public enum TypeEnum {
        CONVERSATION_ITEM_INPUT_AUDIO_TRANSCRIPTION_COMPLETED("conversation.item.input_audio_transcription.completed");

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
    private String transcript;

    /**
     * Default constructor.
     */
    public RealtimeServerEventConversationItemInputAudioTranscriptionCompleted() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventConversationItemInputAudioTranscriptionCompleted.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;conversation.item.input_audio_transcription.completed&#x60;. 
     * @param itemId The ID of the user message item containing the audio.
     * @param contentIndex The index of the content part containing the audio.
     * @param transcript The transcribed text.
     */
    public RealtimeServerEventConversationItemInputAudioTranscriptionCompleted(
        String eventId, 
        TypeEnum type, 
        String itemId, 
        Integer contentIndex, 
        String transcript
    ) {
        this.eventId = eventId;
        this.type = type;
        this.itemId = itemId;
        this.contentIndex = contentIndex;
        this.transcript = transcript;
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
     * The event type, must be `conversation.item.input_audio_transcription.completed`. 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The ID of the user message item containing the audio.
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
     * The transcribed text.
     * @return transcript
     */
    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeServerEventConversationItemInputAudioTranscriptionCompleted {\n");
        
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    contentIndex: ").append(toIndentedString(contentIndex)).append("\n");
        sb.append("    transcript: ").append(toIndentedString(transcript)).append("\n");
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

