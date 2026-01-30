package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("FunctionObject")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FunctionObject   {
  private String description;
  private String name;
  private @Valid Map<String, Object> parameters = new HashMap<>();
  private Boolean strict = false;

  public FunctionObject() {
  }

  @JsonCreator
  public FunctionObject(
    @JsonProperty(required = true, value = "name") String name
  ) {
    this.name = name;
  }

  /**
   * A description of what the function does, used by the model to choose when and how to call the function.
   **/
  public FunctionObject description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "A description of what the function does, used by the model to choose when and how to call the function.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
   **/
  public FunctionObject name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list.
   **/
  public FunctionObject parameters(Map<String, Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  
  @ApiModelProperty(value = "The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.")
  @JsonProperty("parameters")
  public Map<String, Object> getParameters() {
    return parameters;
  }

  @JsonProperty("parameters")
  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }

  public FunctionObject putParametersItem(String key, Object parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }

    this.parameters.put(key, parametersItem);
    return this;
  }

  public FunctionObject removeParametersItem(String key) {
    if (this.parameters != null) {
      this.parameters.remove(key);
    }

    return this;
  }
  /**
   * Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the &#x60;parameters&#x60; field. Only a subset of JSON Schema is supported when &#x60;strict&#x60; is &#x60;true&#x60;. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling).
   **/
  public FunctionObject strict(Boolean strict) {
    this.strict = strict;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the `parameters` field. Only a subset of JSON Schema is supported when `strict` is `true`. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling).")
  @JsonProperty("strict")
  public Boolean getStrict() {
    return strict;
  }

  @JsonProperty("strict")
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
    FunctionObject functionObject = (FunctionObject) o;
    return Objects.equals(this.description, functionObject.description) &&
        Objects.equals(this.name, functionObject.name) &&
        Objects.equals(this.parameters, functionObject.parameters) &&
        Objects.equals(this.strict, functionObject.strict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, parameters, strict);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionObject {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

