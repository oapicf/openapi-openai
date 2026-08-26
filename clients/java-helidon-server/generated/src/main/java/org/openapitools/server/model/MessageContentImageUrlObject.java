package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.MessageContentImageUrlObjectImageUrl;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * References an image URL in the content of a message.
 */
public class MessageContentImageUrlObject   {


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
    private MessageContentImageUrlObjectImageUrl imageUrl;

    /**
     * Default constructor.
     */
    public MessageContentImageUrlObject() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageContentImageUrlObject.
     *
     * @param type The type of the content part.
     * @param imageUrl imageUrl
     */
    public MessageContentImageUrlObject(
        TypeEnum type, 
        MessageContentImageUrlObjectImageUrl imageUrl
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
    public MessageContentImageUrlObjectImageUrl getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(MessageContentImageUrlObjectImageUrl imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageContentImageUrlObject {\n");
        
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

