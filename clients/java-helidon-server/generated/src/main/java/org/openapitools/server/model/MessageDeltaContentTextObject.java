package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.MessageDeltaContentTextObjectText;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The text content that is part of a message.
 */
public class MessageDeltaContentTextObject   {

    private Integer index;

    /**
    * Always `text`.
    */
    public enum TypeEnum {
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
    private MessageDeltaContentTextObjectText text;

    /**
     * Default constructor.
     */
    public MessageDeltaContentTextObject() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageDeltaContentTextObject.
     *
     * @param index The index of the content part in the message.
     * @param type Always &#x60;text&#x60;.
     * @param text text
     */
    public MessageDeltaContentTextObject(
        Integer index, 
        TypeEnum type, 
        MessageDeltaContentTextObjectText text
    ) {
        this.index = index;
        this.type = type;
        this.text = text;
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
     * Always `text`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageDeltaContentTextObject {\n");
        
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

