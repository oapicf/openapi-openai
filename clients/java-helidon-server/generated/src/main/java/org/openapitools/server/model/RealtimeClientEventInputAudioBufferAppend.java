package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
 */
public class RealtimeClientEventInputAudioBufferAppend   {

    private String eventId;

    /**
    * The event type, must be `input_audio_buffer.append`.
    */
    public enum TypeEnum {
        INPUT_AUDIO_BUFFER_APPEND("input_audio_buffer.append");

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
    private String audio;

    /**
     * Default constructor.
     */
    public RealtimeClientEventInputAudioBufferAppend() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeClientEventInputAudioBufferAppend.
     *
     * @param eventId Optional client-generated ID used to identify this event.
     * @param type The event type, must be &#x60;input_audio_buffer.append&#x60;.
     * @param audio Base64-encoded audio bytes. This must be in the format specified by the  &#x60;input_audio_format&#x60; field in the session configuration. 
     */
    public RealtimeClientEventInputAudioBufferAppend(
        String eventId, 
        TypeEnum type, 
        String audio
    ) {
        this.eventId = eventId;
        this.type = type;
        this.audio = audio;
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
     * The event type, must be `input_audio_buffer.append`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. 
     * @return audio
     */
    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeClientEventInputAudioBufferAppend {\n");
        
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
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

