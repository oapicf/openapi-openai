package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.MessageDeltaContentImageFileObjectImageFile;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 */
public class MessageDeltaContentImageFileObject   {

    private Integer index;

    /**
    * Always `image_file`.
    */
    public enum TypeEnum {
        IMAGE_FILE("image_file");

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
    private MessageDeltaContentImageFileObjectImageFile imageFile;

    /**
     * Default constructor.
     */
    public MessageDeltaContentImageFileObject() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageDeltaContentImageFileObject.
     *
     * @param index The index of the content part in the message.
     * @param type Always &#x60;image_file&#x60;.
     * @param imageFile imageFile
     */
    public MessageDeltaContentImageFileObject(
        Integer index, 
        TypeEnum type, 
        MessageDeltaContentImageFileObjectImageFile imageFile
    ) {
        this.index = index;
        this.type = type;
        this.imageFile = imageFile;
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
    public MessageDeltaContentImageFileObjectImageFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MessageDeltaContentImageFileObjectImageFile imageFile) {
        this.imageFile = imageFile;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageDeltaContentImageFileObject {\n");
        
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
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

