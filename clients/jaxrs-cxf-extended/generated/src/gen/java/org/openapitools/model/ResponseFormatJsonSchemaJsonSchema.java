package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ResponseFormatJsonSchemaJsonSchema  {
  
 /**
  * A description of what the response format is for, used by the model to determine how to respond in the format.
  */
  @ApiModelProperty(value = "A description of what the response format is for, used by the model to determine how to respond in the format.")
  private String description;

 /**
  * The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
  */
  @ApiModelProperty(required = true, value = "The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.")
  private String name;

 /**
  * The schema for the response format, described as a JSON Schema object.
  */
  @ApiModelProperty(value = "The schema for the response format, described as a JSON Schema object.")
  private Map<String, Object> schema = new HashMap<>();

 /**
  * Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
  */
  @ApiModelProperty(value = "Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).")
  private Boolean strict = false;
 /**
  * A description of what the response format is for, used by the model to determine how to respond in the format.
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public ResponseFormatJsonSchemaJsonSchema description(String description) {
    this.description = description;
    return this;
  }

 /**
  * The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public ResponseFormatJsonSchemaJsonSchema name(String name) {
    this.name = name;
    return this;
  }

 /**
  * The schema for the response format, described as a JSON Schema object.
  * @return schema
  */
  @JsonProperty("schema")
  public Map<String, Object> getSchema() {
    return schema;
  }

  /**
   * Sets the <code>schema</code> property.
   */
 public void setSchema(Map<String, Object> schema) {
    this.schema = schema;
  }

  /**
   * Sets the <code>schema</code> property.
   */
  public ResponseFormatJsonSchemaJsonSchema schema(Map<String, Object> schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Puts a new item into the <code>schema</code> map.
   */
  public ResponseFormatJsonSchemaJsonSchema putSchemaItem(String key, Object schemaItem) {
    this.schema.put(key, schemaItem);
    return this;
  }

 /**
  * Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the &#x60;schema&#x60; field. Only a subset of JSON Schema is supported when &#x60;strict&#x60; is &#x60;true&#x60;. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
  * @return strict
  */
  @JsonProperty("strict")
  public Boolean getStrict() {
    return strict;
  }

  /**
   * Sets the <code>strict</code> property.
   */
 public void setStrict(Boolean strict) {
    this.strict = strict;
  }

  /**
   * Sets the <code>strict</code> property.
   */
  public ResponseFormatJsonSchemaJsonSchema strict(Boolean strict) {
    this.strict = strict;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseFormatJsonSchemaJsonSchema responseFormatJsonSchemaJsonSchema = (ResponseFormatJsonSchemaJsonSchema) o;
    return Objects.equals(this.description, responseFormatJsonSchemaJsonSchema.description) &&
        Objects.equals(this.name, responseFormatJsonSchemaJsonSchema.name) &&
        Objects.equals(this.schema, responseFormatJsonSchemaJsonSchema.schema) &&
        Objects.equals(this.strict, responseFormatJsonSchemaJsonSchema.strict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, schema, strict);
  }

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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

