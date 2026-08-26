package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Returned in `server_vad` mode when the server detects the end of speech in  the audio buffer. The server will also send an `conversation.item.created`  event with the user message item that is created from the audio buffer. 
 */
public class RealtimeServerEventInputAudioBufferSpeechStopped   {

    private String eventId;

    /**
    * The event type, must be `input_audio_buffer.speech_stopped`.
    */
    public enum TypeEnum {
        INPUT_AUDIO_BUFFER_SPEECH_STOPPED("input_audio_buffer.speech_stopped");

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
    private Integer audioEndMs;
    private String itemId;

    /**
     * Default constructor.
     */
    public RealtimeServerEventInputAudioBufferSpeechStopped() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventInputAudioBufferSpeechStopped.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;input_audio_buffer.speech_stopped&#x60;.
     * @param audioEndMs Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  &#x60;min_silence_duration_ms&#x60; configured in the Session. 
     * @param itemId The ID of the user message item that will be created.
     */
    public RealtimeServerEventInputAudioBufferSpeechStopped(
        String eventId, 
        TypeEnum type, 
        Integer audioEndMs, 
        String itemId
    ) {
        this.eventId = eventId;
        this.type = type;
        this.audioEndMs = audioEndMs;
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
     * The event type, must be `input_audio_buffer.speech_stopped`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
     * @return audioEndMs
     */
    public Integer getAudioEndMs() {
        return audioEndMs;
    }

    public void setAudioEndMs(Integer audioEndMs) {
        this.audioEndMs = audioEndMs;
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
        sb.append("class RealtimeServerEventInputAudioBufferSpeechStopped {\n");
        
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    audioEndMs: ").append(toIndentedString(audioEndMs)).append("\n");
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

