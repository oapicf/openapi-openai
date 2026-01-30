package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ResponseFormatJsonSchemaJsonSchema;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ResponseFormatJsonSchema   {
  

public enum TypeEnum {

    @JsonProperty("json_schema") JSON_SCHEMA(String.valueOf("json_schema"));


    private String value;

    TypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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

  /**
   * The type of response format being defined: &#x60;json_schema&#x60;
   **/
  public ResponseFormatJsonSchema type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
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
  public ResponseFormatJsonSchema jsonSchema(ResponseFormatJsonSchemaJsonSchema jsonSchema) {
    this.jsonSchema = jsonSchema;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("json_schema")
  @NotNull
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

