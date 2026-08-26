package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RealtimeConversationItemContentInner   {


    /**
    * The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
    */
    public enum TypeEnum {
        INPUT_AUDIO("input_audio"),
        INPUT_TEXT("input_text"),
        ITEM_REFERENCE("item_reference"),
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
    private String id;
    private String audio;
    private String transcript;

    /**
     * Default constructor.
     */
    public RealtimeConversationItemContentInner() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeConversationItemContentInner.
     *
     * @param type The content type (&#x60;input_text&#x60;, &#x60;input_audio&#x60;, &#x60;item_reference&#x60;, &#x60;text&#x60;). 
     * @param text The text content, used for &#x60;input_text&#x60; and &#x60;text&#x60; content types. 
     * @param id ID of a previous conversation item to reference (for &#x60;item_reference&#x60; content types in &#x60;response.create&#x60; events). These can reference both client and server created items. 
     * @param audio Base64-encoded audio bytes, used for &#x60;input_audio&#x60; content type. 
     * @param transcript The transcript of the audio, used for &#x60;input_audio&#x60; content type. 
     */
    public RealtimeConversationItemContentInner(
        TypeEnum type, 
        String text, 
        String id, 
        String audio, 
        String transcript
    ) {
        this.type = type;
        this.text = text;
        this.id = id;
        this.audio = audio;
        this.transcript = transcript;
    }



    /**
     * The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The text content, used for `input_text` and `text` content types. 
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Base64-encoded audio bytes, used for `input_audio` content type. 
     * @return audio
     */
    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    /**
     * The transcript of the audio, used for `input_audio` content type. 
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
        sb.append("class RealtimeConversationItemContentInner {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

