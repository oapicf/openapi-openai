package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ResponseFormatJsonSchemaJsonSchema
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ResponseFormatJsonSchemaJsonSchema   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  @JsonProperty("schema")
  
  private Map<String, Object> schema = null;

  @JsonProperty("strict")
  private Boolean strict = false;

  public ResponseFormatJsonSchemaJsonSchema description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of what the response format is for, used by the model to determine how to respond in the format.
   * @return description
   */
  @ApiModelProperty(value = "A description of what the response format is for, used by the model to determine how to respond in the format.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ResponseFormatJsonSchemaJsonSchema name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
   * @return name
   */
  @ApiModelProperty(required = true, value = "The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResponseFormatJsonSchemaJsonSchema schema(Map<String, Object> schema) {
    this.schema = schema;
    return this;
  }

  public ResponseFormatJsonSchemaJsonSchema putSchemaItem(String key, Object schemaItem) {
    if (this.schema == null) {
      this.schema = new HashMap<>());
    }
    this.schema.put(key, schemaItem);
    return this;
  }

  /**
   * The schema for the response format, described as a JSON Schema object.
   * @return schema
   */
  @ApiModelProperty(value = "The schema for the response format, described as a JSON Schema object.")
  public Map<String, Object> getSchema() {
    return schema;
  }

  public void setSchema(Map<String, Object> schema) {
    this.schema = schema;
  }

  public ResponseFormatJsonSchemaJsonSchema strict(Boolean strict) {
    this.strict = strict;
    return this;
  }

  /**
   * Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
   * @return strict
   */
  @ApiModelProperty(value = "Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).")
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

