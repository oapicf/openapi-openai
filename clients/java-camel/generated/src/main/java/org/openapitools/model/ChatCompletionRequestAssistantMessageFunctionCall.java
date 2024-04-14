package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.
 * @deprecated
 */

@Deprecated
@Schema(name = "ChatCompletionRequestAssistantMessage_function_call", description = "Deprecated and replaced by `tool_calls`. The name and arguments of a function that should be called, as generated by the model.")
@JsonTypeName("ChatCompletionRequestAssistantMessage_function_call")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-04-14T13:40:33.442815767Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ChatCompletionRequestAssistantMessageFunctionCall {

  private String arguments;

  private String name;

  public ChatCompletionRequestAssistantMessageFunctionCall() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChatCompletionRequestAssistantMessageFunctionCall(String arguments, String name) {
    this.arguments = arguments;
    this.name = name;
  }

  public ChatCompletionRequestAssistantMessageFunctionCall arguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

  /**
   * The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
   * @return arguments
  */
  @NotNull 
  @Schema(name = "arguments", description = "The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("arguments")
  public String getArguments() {
    return arguments;
  }

  public void setArguments(String arguments) {
    this.arguments = arguments;
  }

  public ChatCompletionRequestAssistantMessageFunctionCall name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the function to call.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the function to call.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
    ChatCompletionRequestAssistantMessageFunctionCall chatCompletionRequestAssistantMessageFunctionCall = (ChatCompletionRequestAssistantMessageFunctionCall) o;
    return Objects.equals(this.arguments, chatCompletionRequestAssistantMessageFunctionCall.arguments) &&
        Objects.equals(this.name, chatCompletionRequestAssistantMessageFunctionCall.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestAssistantMessageFunctionCall {\n");
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

