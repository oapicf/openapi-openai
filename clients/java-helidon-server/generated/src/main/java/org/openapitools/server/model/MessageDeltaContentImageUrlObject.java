package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.MessageDeltaContentImageUrlObjectImageUrl;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * References an image URL in the content of a message.
 */
public class MessageDeltaContentImageUrlObject   {

    private Integer index;

    /**
    * Always `image_url`.
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
    private MessageDeltaContentImageUrlObjectImageUrl imageUrl;

    /**
     * Default constructor.
     */
    public MessageDeltaContentImageUrlObject() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageDeltaContentImageUrlObject.
     *
     * @param index The index of the content part in the message.
     * @param type Always &#x60;image_url&#x60;.
     * @param imageUrl imageUrl
     */
    public MessageDeltaContentImageUrlObject(
        Integer index, 
        TypeEnum type, 
        MessageDeltaContentImageUrlObjectImageUrl imageUrl
    ) {
        this.index = index;
        this.type = type;
        this.imageUrl = imageUrl;
    }



    /**
     * The index of the content part in the message.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * Always `image_url`.
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
    public MessageDeltaContentImageUrlObjectImageUrl getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(MessageDeltaContentImageUrlObjectImageUrl imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageDeltaContentImageUrlObject {\n");
        
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

