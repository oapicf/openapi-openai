package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ChatCompletionRequestMessageContentPartImageImageUrl;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Learn about [image inputs](/docs/guides/vision). 
 */
public class ChatCompletionRequestMessageContentPartImage   {


    /**
    * The type of the content part.
    */
    public enum TypeEnum {
        IMAGE_URL("image_url");

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
    private ChatCompletionRequestMessageContentPartImageImageUrl imageUrl;

    /**
     * Default constructor.
     */
    public ChatCompletionRequestMessageContentPartImage() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionRequestMessageContentPartImage.
     *
     * @param type The type of the content part.
     * @param imageUrl imageUrl
     */
    public ChatCompletionRequestMessageContentPartImage(
        TypeEnum type, 
        ChatCompletionRequestMessageContentPartImageImageUrl imageUrl
    ) {
        this.type = type;
        this.imageUrl = imageUrl;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionRequestMessageContentPartImage {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

