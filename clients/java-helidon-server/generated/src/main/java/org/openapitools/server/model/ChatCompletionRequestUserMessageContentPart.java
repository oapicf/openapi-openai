package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ChatCompletionRequestMessageContentPartAudio;
import org.openapitools.server.model.ChatCompletionRequestMessageContentPartAudioInputAudio;
import org.openapitools.server.model.ChatCompletionRequestMessageContentPartImage;
import org.openapitools.server.model.ChatCompletionRequestMessageContentPartImageImageUrl;
import org.openapitools.server.model.ChatCompletionRequestMessageContentPartText;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ChatCompletionRequestUserMessageContentPart   {


    /**
    * The type of the content part.
    */
    public enum TypeEnum {
        TEXT("text"),
        IMAGE_URL("image_url"),
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
    private String text;
    private ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;
    private ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio;

    /**
     * Default constructor.
     */
    public ChatCompletionRequestUserMessageContentPart() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionRequestUserMessageContentPart.
     *
     * @param type The type of the content part.
     * @param text The text content.
     * @param imageUrl imageUrl
     * @param inputAudio inputAudio
     */
    public ChatCompletionRequestUserMessageContentPart(
        TypeEnum type, 
        String text, 
        ChatCompletionRequestMessageContentPartImageImageUrl imageUrl, 
        ChatCompletionRequestMessageContentPartAudioInputAudio inputAudio
    ) {
        this.type = type;
        this.text = text;
        this.imageUrl = imageUrl;
        this.inputAudio = inputAudio;
    }



    /**
     * The type of the content part.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The text content.
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * Get imageUrl
     * @return imageUrl
     */
    public ChatCompletionRequestMessageContentPartImageImageUrl getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(ChatCompletionRequestMessageContentPartImageImageUrl imageUrl) {
        this.imageUrl = imageUrl;
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
        sb.append("class ChatCompletionRequestUserMessageContentPart {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

