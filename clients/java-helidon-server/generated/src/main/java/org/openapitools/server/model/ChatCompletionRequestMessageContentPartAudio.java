package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ChatCompletionRequestMessageContentPartAudioInputAudio;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Learn about [audio inputs](/docs/guides/audio). 
 */
public class ChatCompletionRequestMessageContentPartAudio   {


    /**
    * The type of the content part. Always `input_audio`.
    */
    public enum TypeEnum {
        INPUT_AUDIO("input_audio");

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
    private ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio;

    /**
     * Default constructor.
     */
    public ChatCompletionRequestMessageContentPartAudio() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionRequestMessageContentPartAudio.
     *
     * @param type The type of the content part. Always &#x60;input_audio&#x60;.
     * @param inputAudio inputAudio
     */
    public ChatCompletionRequestMessageContentPartAudio(
        TypeEnum type, 
        ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio
    ) {
        this.type = type;
        this.inputAudio = inputAudio;
    }



    /**
     * The type of the content part. Always `input_audio`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get inputAudio
     * @return inputAudio
     */
    public ChatCompletionRequestMessageContentPartAudioInputAudio getInputAudio() {
        return inputAudio;
    }

    public void setInputAudio(ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio) {
        this.inputAudio = inputAudio;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionRequestMessageContentPartAudio {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    inputAudio: ").append(toIndentedString(inputAudio)).append("\n");
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

