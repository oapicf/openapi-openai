package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ResponseFormatJsonSchemaJsonSchema
 */

@JsonTypeName("ResponseFormatJsonSchema_json_schema")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ResponseFormatJsonSchemaJsonSchema {

  private String description;

  private String name;

  @Valid
  private Map<String, Object> schema = new HashMap<>();

  private JsonNullable<Boolean> strict = JsonNullable.<Boolean>undefined();

  public ResponseFormatJsonSchemaJsonSchema() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResponseFormatJsonSchemaJsonSchema(String name) {
    this.name = name;
  }

  public ResponseFormatJsonSchemaJsonSchema description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of what the response format is for, used by the model to determine how to respond in the format.
   * @return description
   */
  
  @Schema(name = "description", description = "A description of what the response format is for, used by the model to determine how to respond in the format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
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
  @NotNull 
  @Schema(name = "name", description = "The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
      this.schema = new HashMap<>();
    }
    this.schema.put(key, schemaItem);
    return this;
  }

  /**
   * The schema for the response format, described as a JSON Schema object.
   * @return schema
   */
  
  @Schema(name = "schema", description = "The schema for the response format, described as a JSON Schema object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schema")
  public Map<String, Object> getSchema() {
    return schema;
  }

  public void setSchema(Map<String, Object> schema) {
    this.schema = schema;
  }

  public ResponseFormatJsonSchemaJsonSchema strict(Boolean strict) {
    this.strict = JsonNullable.of(strict);
    return this;
  }

  /**
   * Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
   * @return strict
   */
  
  @Schema(name = "strict", description = "Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("strict")
  public JsonNullable<Boolean> getStrict() {
    return strict;
  }

  public void setStrict(JsonNullable<Boolean> strict) {
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
        equalsNullable(this.strict, responseFormatJsonSchemaJsonSchema.strict);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, schema, hashCodeNullable(strict));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

