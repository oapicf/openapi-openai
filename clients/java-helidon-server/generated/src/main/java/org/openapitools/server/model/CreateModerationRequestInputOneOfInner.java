package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CreateModerationRequestInputOneOfInnerOneOf;
import org.openapitools.server.model.CreateModerationRequestInputOneOfInnerOneOf1;
import org.openapitools.server.model.CreateModerationRequestInputOneOfInnerOneOfImageUrl;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateModerationRequestInputOneOfInner   {


    /**
    * Always `image_url`.
    */
    public enum TypeEnum {
        IMAGE_URL("image_url"),
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
    private CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl;
    private String text;

    /**
     * Default constructor.
     */
    public CreateModerationRequestInputOneOfInner() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateModerationRequestInputOneOfInner.
     *
     * @param type Always &#x60;image_url&#x60;.
     * @param imageUrl imageUrl
     * @param text A string of text to classify.
     */
    public CreateModerationRequestInputOneOfInner(
        TypeEnum type, 
        CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl, 
        String text
    ) {
        this.type = type;
        this.imageUrl = imageUrl;
        this.text = text;
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
    public CreateModerationRequestInputOneOfInnerOneOfImageUrl getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(CreateModerationRequestInputOneOfInnerOneOfImageUrl imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * A string of text to classify.
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateModerationRequestInputOneOfInner {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

