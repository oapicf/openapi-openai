package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an `input_audio_buffer.committed`  event. 
 */
public class RealtimeClientEventInputAudioBufferCommit   {

    private String eventId;

    /**
    * The event type, must be `input_audio_buffer.commit`.
    */
    public enum TypeEnum {
        INPUT_AUDIO_BUFFER_COMMIT("input_audio_buffer.commit");

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

    /**
     * Default constructor.
     */
    public RealtimeClientEventInputAudioBufferCommit() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeClientEventInputAudioBufferCommit.
     *
     * @param eventId Optional client-generated ID used to identify this event.
     * @param type The event type, must be &#x60;input_audio_buffer.commit&#x60;.
     */
    public RealtimeClientEventInputAudioBufferCommit(
        String eventId, 
        TypeEnum type
    ) {
        this.eventId = eventId;
        this.type = type;
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
     * The event type, must be `input_audio_buffer.commit`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeClientEventInputAudioBufferCommit {\n");
        
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

