package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ResponseFormatJsonSchemaJsonSchema;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ResponseFormatJsonSchema   {


    /**
    * The type of response format being defined: `json_schema`
    */
    public enum TypeEnum {
        JSON_SCHEMA("json_schema");

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
    private ResponseFormatJsonSchemaJsonSchema jsonSchema;

    /**
     * Default constructor.
     */
    public ResponseFormatJsonSchema() {
    // JSON-B / Jackson
    }

    /**
     * Create ResponseFormatJsonSchema.
     *
     * @param type The type of response format being defined: &#x60;json_schema&#x60;
     * @param jsonSchema jsonSchema
     */
    public ResponseFormatJsonSchema(
        TypeEnum type, 
        ResponseFormatJsonSchemaJsonSchema jsonSchema
    ) {
        this.type = type;
        this.jsonSchema = jsonSchema;
    }



    /**
     * The type of response format being defined: `json_schema`
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Get jsonSchema
     * @return jsonSchema
     */
    public ResponseFormatJsonSchemaJsonSchema getJsonSchema() {
        return jsonSchema;
    }

    public void setJsonSchema(ResponseFormatJsonSchemaJsonSchema jsonSchema) {
        this.jsonSchema = jsonSchema;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseFormatJsonSchema {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
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

