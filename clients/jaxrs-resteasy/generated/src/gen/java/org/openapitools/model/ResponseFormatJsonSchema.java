package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ResponseFormatJsonSchemaJsonSchema;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ResponseFormatJsonSchema   {
  

  /**
   * The type of response format being defined: &#x60;json_schema&#x60;
   */
  public enum TypeEnum {
    JSON_SCHEMA("json_schema");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type;
  private ResponseFormatJsonSchemaJsonSchema jsonSchema;

  /**
   * The type of response format being defined: &#x60;json_schema&#x60;
   **/
  
  @ApiModelProperty(required = true, value = "The type of response format being defined: `json_schema`")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("json_schema")
  @NotNull
  @Valid
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

