package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ResponseFormatJsonSchemaJsonSchema;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ResponseFormatJsonSchema  {
  
public enum TypeEnum {

JSON_SCHEMA(String.valueOf("json_schema"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
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

 /**
  * The type of response format being defined: `json_schema`
  */
  @ApiModelProperty(required = true, value = "The type of response format being defined: `json_schema`")

  private TypeEnum type;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private ResponseFormatJsonSchemaJsonSchema jsonSchema;
 /**
   * The type of response format being defined: &#x60;json_schema&#x60;
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ResponseFormatJsonSchema type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * Get jsonSchema
   * @return jsonSchema
  **/
  @JsonProperty("json_schema")
  @NotNull
  public ResponseFormatJsonSchemaJsonSchema getJsonSchema() {
    return jsonSchema;
  }

  public void setJsonSchema(ResponseFormatJsonSchemaJsonSchema jsonSchema) {
    this.jsonSchema = jsonSchema;
  }

  public ResponseFormatJsonSchema jsonSchema(ResponseFormatJsonSchemaJsonSchema jsonSchema) {
    this.jsonSchema = jsonSchema;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

