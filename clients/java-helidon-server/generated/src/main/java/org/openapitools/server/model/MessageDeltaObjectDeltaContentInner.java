package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.MessageDeltaContentImageFileObject;
import org.openapitools.server.model.MessageDeltaContentImageFileObjectImageFile;
import org.openapitools.server.model.MessageDeltaContentImageUrlObject;
import org.openapitools.server.model.MessageDeltaContentImageUrlObjectImageUrl;
import org.openapitools.server.model.MessageDeltaContentRefusalObject;
import org.openapitools.server.model.MessageDeltaContentTextObject;
import org.openapitools.server.model.MessageDeltaContentTextObjectText;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MessageDeltaObjectDeltaContentInner   {

    private Integer index;

    /**
    * Always `image_file`.
    */
    public enum TypeEnum {
        IMAGE_FILE("image_file"),
        TEXT("text"),
        REFUSAL("refusal"),
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
    private MessageDeltaContentImageFileObjectImageFile imageFile;
    private MessageDeltaContentTextObjectText text;
    private String refusal;
    private MessageDeltaContentImageUrlObjectImageUrl imageUrl;

    /**
     * Default constructor.
     */
    public MessageDeltaObjectDeltaContentInner() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageDeltaObjectDeltaContentInner.
     *
     * @param index The index of the content part in the message.
     * @param type Always &#x60;image_file&#x60;.
     * @param imageFile imageFile
     * @param text text
     * @param refusal refusal
     * @param imageUrl imageUrl
     */
    public MessageDeltaObjectDeltaContentInner(
        Integer index, 
        TypeEnum type, 
        MessageDeltaContentImageFileObjectImageFile imageFile, 
        MessageDeltaContentTextObjectText text, 
        String refusal, 
        MessageDeltaContentImageUrlObjectImageUrl imageUrl
    ) {
        this.index = index;
        this.type = type;
        this.imageFile = imageFile;
        this.text = text;
        this.refusal = refusal;
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
     * Get text
     * @return text
     */
    public MessageDeltaContentTextObjectText getText() {
        return text;
    }

    public void setText(MessageDeltaContentTextObjectText text) {
        this.text = text;
    }

    /**
     * Get refusal
     * @return refusal
     */
    public String getRefusal() {
        return refusal;
    }

    public void setRefusal(String refusal) {
        this.refusal = refusal;
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
        sb.append("class MessageDeltaObjectDeltaContentInner {\n");
        
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
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

