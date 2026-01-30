package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ResponseFormatJsonSchemaJsonSchema;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ResponseFormatJsonSchema
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ResponseFormatJsonSchema implements AssistantsApiResponseFormatOption, CreateChatCompletionRequestResponseFormat {

  /**
   * The type of response format being defined: `json_schema`
   */
  public enum TypeEnum {
    JSON_SCHEMA("json_schema");

    private final String value;

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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  private ResponseFormatJsonSchemaJsonSchema jsonSchema;

  public ResponseFormatJsonSchema() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResponseFormatJsonSchema(TypeEnum type, ResponseFormatJsonSchemaJsonSchema jsonSchema) {
    this.type = type;
    this.jsonSchema = jsonSchema;
  }

  public ResponseFormatJsonSchema type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of response format being defined: `json_schema`
   * @return type
   */
  @NotNull 
  @Schema(name = "type", description = "The type of response format being defined: `json_schema`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ResponseFormatJsonSchema jsonSchema(ResponseFormatJsonSchemaJsonSchema jsonSchema) {
    this.jsonSchema = jsonSchema;
    return this;
  }

  /**
   * Get jsonSchema
   * @return jsonSchema
   */
  @NotNull @Valid 
  @Schema(name = "json_schema", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("json_schema")
  public ResponseFormatJsonSchemaJsonSchema getJsonSchema() {
    return jsonSchema;
  }

  public void setJsonSchema(ResponseFormatJsonSchemaJsonSchema jsonSchema) {
    this.jsonSchema = jsonSchema;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseFormatJsonSchema responseFormatJsonSchema = (ResponseFormatJsonSchema) o;
    return Objects.equals(this.type, responseFormatJsonSchema.type) &&
        Objects.equals(this.jsonSchema, responseFormatJsonSchema.jsonSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, jsonSchema);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

