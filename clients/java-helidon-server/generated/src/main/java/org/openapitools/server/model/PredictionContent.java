package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.PredictionContentContent;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Static predicted output content, such as the content of a text file that is being regenerated. 
 */
public class PredictionContent   {


    /**
    * The type of the predicted content you want to provide. This type is currently always `content`. 
    */
    public enum TypeEnum {
        CONTENT("content");

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
    private PredictionContentContent content;

    /**
     * Default constructor.
     */
    public PredictionContent() {
    // JSON-B / Jackson
    }

    /**
     * Create PredictionContent.
     *
     * @param type The type of the predicted content you want to provide. This type is currently always &#x60;content&#x60;. 
     * @param content content
     */
    public PredictionContent(
        TypeEnum type, 
        PredictionContentContent content
    ) {
        this.type = type;
        this.content = content;
    }



    /**
     * The type of the predicted content you want to provide. This type is currently always `content`. 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get content
     * @return content
     */
    public PredictionContentContent getContent() {
        return content;
    }

    public void setContent(PredictionContentContent content) {
        this.content = content;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PredictionContent {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

