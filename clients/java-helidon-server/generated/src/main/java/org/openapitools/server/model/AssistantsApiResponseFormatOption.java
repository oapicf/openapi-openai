package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ResponseFormatJsonObject;
import org.openapitools.server.model.ResponseFormatJsonSchema;
import org.openapitools.server.model.ResponseFormatJsonSchemaJsonSchema;
import org.openapitools.server.model.ResponseFormatText;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Specifies the format that the model must output. Compatible with [GPT-4o](/docs/models#gpt-4o), [GPT-4 Turbo](/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5 Turbo models since `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_schema\", \"json_schema\": {...} }` enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
 */
public class AssistantsApiResponseFormatOption   {


    /**
    * The type of response format being defined: `text`
    */
    public enum TypeEnum {
        TEXT("text"),
        JSON_OBJECT("json_object"),
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
    public AssistantsApiResponseFormatOption() {
    // JSON-B / Jackson
    }

    /**
     * Create AssistantsApiResponseFormatOption.
     *
     * @param type The type of response format being defined: &#x60;text&#x60;
     * @param jsonSchema jsonSchema
     */
    public AssistantsApiResponseFormatOption(
        TypeEnum type, 
        ResponseFormatJsonSchemaJsonSchema jsonSchema
    ) {
        this.type = type;
        this.jsonSchema = jsonSchema;
    }



    /**
     * The type of response format being defined: `text`
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
        sb.append("class AssistantsApiResponseFormatOption {\n");
        
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

