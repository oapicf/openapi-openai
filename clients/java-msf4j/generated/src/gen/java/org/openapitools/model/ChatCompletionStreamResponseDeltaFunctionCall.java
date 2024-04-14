package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.
 */
@ApiModel(description = "Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-04-14T13:38:52.193957698Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ChatCompletionStreamResponseDeltaFunctionCall   {
  @JsonProperty("arguments")
  private String arguments;

  @JsonProperty("name")
  private String name;

  public ChatCompletionStreamResponseDeltaFunctionCall arguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

   /**
   * The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
   * @return arguments
  **/
  @ApiModelProperty(value = "The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.")
  public String getArguments() {
    return arguments;
  }

  public void setArguments(String arguments) {
    this.arguments = arguments;
  }

  public ChatCompletionStreamResponseDeltaFunctionCall name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the function to call.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the function to call.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionStreamResponseDeltaFunctionCall chatCompletionStreamResponseDeltaFunctionCall = (ChatCompletionStreamResponseDeltaFunctionCall) o;
    return Objects.equals(this.arguments, chatCompletionStreamResponseDeltaFunctionCall.arguments) &&
        Objects.equals(this.name, chatCompletionStreamResponseDeltaFunctionCall.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionStreamResponseDeltaFunctionCall {\n");
    
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

