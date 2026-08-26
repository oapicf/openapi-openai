package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ResponseFormatJsonSchemaJsonSchema   {

    private String description;
    private String name;
    private Map<String, Object> schema = new HashMap<>();
    private Boolean strict = false;

    /**
     * Default constructor.
     */
    public ResponseFormatJsonSchemaJsonSchema() {
    // JSON-B / Jackson
    }

    /**
     * Create ResponseFormatJsonSchemaJsonSchema.
     *
     * @param description A description of what the response format is for, used by the model to determine how to respond in the format.
     * @param name The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
     * @param schema The schema for the response format, described as a JSON Schema object.
     * @param strict Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the &#x60;schema&#x60; field. Only a subset of JSON Schema is supported when &#x60;strict&#x60; is &#x60;true&#x60;. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
     */
    public ResponseFormatJsonSchemaJsonSchema(
        String description, 
        String name, 
        Map<String, Object> schema, 
        Boolean strict
    ) {
        this.description = description;
        this.name = name;
        this.schema = schema;
        this.strict = strict;
    }



    /**
     * A description of what the response format is for, used by the model to determine how to respond in the format.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The schema for the response format, described as a JSON Schema object.
     * @return schema
     */
    public Map<String, Object> getSchema() {
        return schema;
    }

    public void setSchema(Map<String, Object> schema) {
        this.schema = schema;
    }

    /**
     * Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
     * @return strict
     */
    public Boolean getStrict() {
        return strict;
    }

    public void setStrict(Boolean strict) {
        this.strict = strict;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseFormatJsonSchemaJsonSchema {\n");
        
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
        sb.append("    strict: ").append(toIndentedString(strict)).append("\n");
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

