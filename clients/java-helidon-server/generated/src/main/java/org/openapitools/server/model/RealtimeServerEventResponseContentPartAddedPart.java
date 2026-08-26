package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The content part that was added.
 */
public class RealtimeServerEventResponseContentPartAddedPart   {


    /**
    * The content type (\"text\", \"audio\").
    */
    public enum TypeEnum {
        AUDIO("audio"),
        TEXT("text");

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
    private String text;
    private String audio;
    private String transcript;

    /**
     * Default constructor.
     */
    public RealtimeServerEventResponseContentPartAddedPart() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeServerEventResponseContentPartAddedPart.
     *
     * @param type The content type (\&quot;text\&quot;, \&quot;audio\&quot;).
     * @param text The text content (if type is \&quot;text\&quot;).
     * @param audio Base64-encoded audio data (if type is \&quot;audio\&quot;).
     * @param transcript The transcript of the audio (if type is \&quot;audio\&quot;).
     */
    public RealtimeServerEventResponseContentPartAddedPart(
        TypeEnum type, 
        String text, 
        String audio, 
        String transcript
    ) {
        this.type = type;
        this.text = text;
        this.audio = audio;
        this.transcript = transcript;
    }



    /**
     * The content type (\"text\", \"audio\").
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The text content (if type is \"text\").
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * Base64-encoded audio data (if type is \"audio\").
     * @return audio
     */
    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    /**
     * The transcript of the audio (if type is \"audio\").
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
        sb.append("class RealtimeServerEventResponseContentPartAddedPart {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
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

