package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AssistantToolsCode   {


    /**
    * The type of tool being defined: `code_interpreter`
    */
    public enum TypeEnum {
        CODE_INTERPRETER("code_interpreter");

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

    /**
     * Default constructor.
     */
    public AssistantToolsCode() {
    // JSON-B / Jackson
    }

    /**
     * Create AssistantToolsCode.
     *
     * @param type The type of tool being defined: &#x60;code_interpreter&#x60;
     */
    public AssistantToolsCode(
        TypeEnum type
    ) {
        this.type = type;
    }



    /**
     * The type of tool being defined: `code_interpreter`
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistantToolsCode {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

