package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Sent by the server when in `server_vad` mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a `input_audio_buffer.speech_stopped` event  when speech stops. The `item_id` property is the ID of the user message item  that will be created when speech stops and will also be included in the  `input_audio_buffer.speech_stopped` event (unless the client manually commits  the audio buffer during VAD activation). 
 */
public class RealtimeServerEventInputAudioBufferSpeechStarted   {

    private String eventId;

    /**
    * The event type, must be `input_audio_buffer.speech_started`.
    */
    public enum TypeEnum {
        INPUT_AUDIO_BUFFER_SPEECH_STARTED("input_audio_buffer.speech_started");

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
    private Integer audioStartMs;
    private String itemId;

    /**
     * Default constructor.
     */
    public RealtimeServerEventInputAudioBufferSpeechStarted() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventInputAudioBufferSpeechStarted.
     *
     * @param eventId The unique ID of the server event.
     * @param type The event type, must be &#x60;input_audio_buffer.speech_started&#x60;.
     * @param audioStartMs Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  &#x60;prefix_padding_ms&#x60; configured in the Session. 
     * @param itemId The ID of the user message item that will be created when speech stops. 
     */
    public RealtimeServerEventInputAudioBufferSpeechStarted(
        String eventId, 
        TypeEnum type, 
        Integer audioStartMs, 
        String itemId
    ) {
        this.eventId = eventId;
        this.type = type;
        this.audioStartMs = audioStartMs;
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
     * The event type, must be `input_audio_buffer.speech_started`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. 
     * @return audioStartMs
     */
    public Integer getAudioStartMs() {
        return audioStartMs;
    }

    public void setAudioStartMs(Integer audioStartMs) {
        this.audioStartMs = audioStartMs;
    }

    /**
     * The ID of the user message item that will be created when speech stops. 
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
        sb.append("class RealtimeServerEventInputAudioBufferSpeechStarted {\n");
        
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    audioStartMs: ").append(toIndentedString(audioStartMs)).append("\n");
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

