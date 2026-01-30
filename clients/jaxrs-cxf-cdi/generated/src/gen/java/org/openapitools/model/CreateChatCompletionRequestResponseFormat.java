package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ResponseFormatJsonObject;
import org.openapitools.model.ResponseFormatJsonSchema;
import org.openapitools.model.ResponseFormatJsonSchemaJsonSchema;
import org.openapitools.model.ResponseFormatText;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * An object specifying the format that the model must output.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_schema\&quot;, \&quot;json_schema\&quot;: {...} }&#x60; enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "An object specifying the format that the model must output.  Setting to `{ \"type\": \"json_schema\", \"json_schema\": {...} }` enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. ")
public class CreateChatCompletionRequestResponseFormat   {
  

public enum TypeEnum {

    @JsonProperty("text") TEXT(String.valueOf("text")), @JsonProperty("json_object") JSON_OBJECT(String.valueOf("json_object")), @JsonProperty("json_schema") JSON_SCHEMA(String.valueOf("json_schema"));


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
   * The type of response format being defined: &#x60;text&#x60;
   **/
  public CreateChatCompletionRequestResponseFormat type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of response format being defined: `text`")
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
  public CreateChatCompletionRequestResponseFormat jsonSchema(ResponseFormatJsonSchemaJsonSchema jsonSchema) {
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
    CreateChatCompletionRequestResponseFormat createChatCompletionRequestResponseFormat = (CreateChatCompletionRequestResponseFormat) o;
    return Objects.equals(this.type, createChatCompletionRequestResponseFormat.type) &&
        Objects.equals(this.jsonSchema, createChatCompletionRequestResponseFormat.jsonSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, jsonSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionRequestResponseFormat {\n");
    
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

