package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class RealtimeResponseCreateParamsToolsInner   {


    /**
    * The type of the tool, i.e. `function`.
    */
    public enum TypeEnum {
        FUNCTION("function");

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
    private String name;
    private String description;
    private Object parameters;

    /**
     * Default constructor.
     */
    public RealtimeResponseCreateParamsToolsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeResponseCreateParamsToolsInner.
     *
     * @param type The type of the tool, i.e. &#x60;function&#x60;.
     * @param name The name of the function.
     * @param description The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
     * @param parameters Parameters of the function in JSON Schema.
     */
    public RealtimeResponseCreateParamsToolsInner(
        TypeEnum type, 
        String name, 
        String description, 
        Object parameters
    ) {
        this.type = type;
        this.name = name;
        this.description = description;
        this.parameters = parameters;
    }



    /**
     * The type of the tool, i.e. `function`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The name of the function.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Parameters of the function in JSON Schema.
     * @return parameters
     */
    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeResponseCreateParamsToolsInner {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

