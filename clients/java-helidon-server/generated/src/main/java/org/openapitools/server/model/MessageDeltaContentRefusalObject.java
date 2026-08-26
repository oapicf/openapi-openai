package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The refusal content that is part of a message.
 */
public class MessageDeltaContentRefusalObject   {

    private Integer index;

    /**
    * Always `refusal`.
    */
    public enum TypeEnum {
        REFUSAL("refusal");

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
    private String refusal;

    /**
     * Default constructor.
     */
    public MessageDeltaContentRefusalObject() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageDeltaContentRefusalObject.
     *
     * @param index The index of the refusal part in the message.
     * @param type Always &#x60;refusal&#x60;.
     * @param refusal refusal
     */
    public MessageDeltaContentRefusalObject(
        Integer index, 
        TypeEnum type, 
        String refusal
    ) {
        this.index = index;
        this.type = type;
        this.refusal = refusal;
    }



    /**
     * The index of the refusal part in the message.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * Always `refusal`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageDeltaContentRefusalObject {\n");
        
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
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

