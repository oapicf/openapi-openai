package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ResponseFormatJsonSchemaJsonSchema   {
  
  private String description;

  private String name;

  private Map<String, Object> schema = new HashMap<>();

  private Boolean strict = false;

  /**
   * A description of what the response format is for, used by the model to determine how to respond in the format.
   **/
  public ResponseFormatJsonSchemaJsonSchema description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "A description of what the response format is for, used by the model to determine how to respond in the format.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
   **/
  public ResponseFormatJsonSchemaJsonSchema name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.")
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The schema for the response format, described as a JSON Schema object.
   **/
  public ResponseFormatJsonSchemaJsonSchema schema(Map<String, Object> schema) {
    this.schema = schema;
    return this;
  }

  
  @ApiModelProperty(value = "The schema for the response format, described as a JSON Schema object.")
  @JsonProperty("schema")
  public Map<String, Object> getSchema() {
    return schema;
  }
  public void setSchema(Map<String, Object> schema) {
    this.schema = schema;
  }


  public ResponseFormatJsonSchemaJsonSchema putSchemaItem(String key, Object schemaItem) {
    if (this.schema == null) {
      this.schema = new HashMap<>();
    }
    this.schema.put(key, schemaItem);
    return this;
  }

  /**
   * Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the &#x60;schema&#x60; field. Only a subset of JSON Schema is supported when &#x60;strict&#x60; is &#x60;true&#x60;. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
   **/
  public ResponseFormatJsonSchemaJsonSchema strict(Boolean strict) {
    this.strict = strict;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).")
  @JsonProperty("strict")
  public Boolean getStrict() {
    return strict;
  }
  public void setStrict(Boolean strict) {
    this.strict = strict;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

