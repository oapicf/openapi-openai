package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ChatCompletionFunctions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-03T11:09:06.848004747Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ChatCompletionFunctions   {
  private String description;
  private String name;
  private @Valid Map<String, Object> parameters = new HashMap<>();

  /**
   * A description of what the function does, used by the model to choose when and how to call the function.
   **/
  public ChatCompletionFunctions description(String description) {
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
  public ChatCompletionFunctions name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.")
  @JsonProperty("name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting &#x60;parameters&#x60; defines a function with an empty parameter list.
   **/
  public ChatCompletionFunctions parameters(Map<String, Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  
  @ApiModelProperty(value = "The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.")
  @JsonProperty("parameters")
  public Map<String, Object> getParameters() {
    return parameters;
  }

  @JsonProperty("parameters")
  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }

  public ChatCompletionFunctions putParametersItem(String key, Object parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }

    this.parameters.put(key, parametersItem);
    return this;
  }

  public ChatCompletionFunctions removeParametersItem(String key) {
    if (this.parameters != null) {
      this.parameters.remove(key);
    }

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
    ChatCompletionFunctions chatCompletionFunctions = (ChatCompletionFunctions) o;
    return Objects.equals(this.description, chatCompletionFunctions.description) &&
        Objects.equals(this.name, chatCompletionFunctions.name) &&
        Objects.equals(this.parameters, chatCompletionFunctions.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionFunctions {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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

