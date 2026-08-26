package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RunStepDetailsToolCallsCodeOutputImageObjectImage;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RunStepDetailsToolCallsCodeOutputImageObject   {


    /**
    * Always `image`.
    */
    public enum TypeEnum {
        IMAGE("image");

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
    private RunStepDetailsToolCallsCodeOutputImageObjectImage image;

    /**
     * Default constructor.
     */
    public RunStepDetailsToolCallsCodeOutputImageObject() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepDetailsToolCallsCodeOutputImageObject.
     *
     * @param type Always &#x60;image&#x60;.
     * @param image image
     */
    public RunStepDetailsToolCallsCodeOutputImageObject(
        TypeEnum type, 
        RunStepDetailsToolCallsCodeOutputImageObjectImage image
    ) {
        this.type = type;
        this.image = image;
    }



    /**
     * Always `image`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get image
     * @return image
     */
    public RunStepDetailsToolCallsCodeOutputImageObjectImage getImage() {
        return image;
    }

    public void setImage(RunStepDetailsToolCallsCodeOutputImageObjectImage image) {
        this.image = image;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDetailsToolCallsCodeOutputImageObject {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

