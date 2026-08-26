package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.MessageContentImageFileObject;
import org.openapitools.server.model.MessageContentImageFileObjectImageFile;
import org.openapitools.server.model.MessageContentImageUrlObject;
import org.openapitools.server.model.MessageContentImageUrlObjectImageUrl;
import org.openapitools.server.model.MessageRequestContentTextObject;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ArrayOfContentPartsInner   {


    /**
    * Always `image_file`.
    */
    public enum TypeEnum {
        IMAGE_FILE("image_file"),
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
    private MessageContentImageFileObjectImageFile imageFile;
    private MessageContentImageUrlObjectImageUrl imageUrl;
    private String text;

    /**
     * Default constructor.
     */
    public ArrayOfContentPartsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create ArrayOfContentPartsInner.
     *
     * @param type Always &#x60;image_file&#x60;.
     * @param imageFile imageFile
     * @param imageUrl imageUrl
     * @param text Text content to be sent to the model
     */
    public ArrayOfContentPartsInner(
        TypeEnum type, 
        MessageContentImageFileObjectImageFile imageFile, 
        MessageContentImageUrlObjectImageUrl imageUrl, 
        String text
    ) {
        this.type = type;
        this.imageFile = imageFile;
        this.imageUrl = imageUrl;
        this.text = text;
    }



    /**
     * Always `image_file`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get imageFile
     * @return imageFile
     */
    public MessageContentImageFileObjectImageFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MessageContentImageFileObjectImageFile imageFile) {
        this.imageFile = imageFile;
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
     * Text content to be sent to the model
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
        sb.append("class ArrayOfContentPartsInner {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
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

