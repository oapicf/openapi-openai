/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionFunctions;
import org.openapitools.model.ChatCompletionTool;
import org.openapitools.model.FineTuneChatRequestInputMessagesInner;



/**
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 */

@ApiModel(description = "The per-line training example of a fine-tuning input file for chat models using the supervised method.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneChatRequestInput   {
  
  private List<FineTuneChatRequestInputMessagesInner> messages = new ArrayList<>();
  private List<ChatCompletionTool> tools = new ArrayList<>();
  private Boolean parallelToolCalls = true;
  private List<ChatCompletionFunctions> functions = new ArrayList<>();

  /**
   */
  public FineTuneChatRequestInput messages(List<FineTuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("messages")
  public List<FineTuneChatRequestInputMessagesInner> getMessages() {
    return messages;
  }
  public void setMessages(List<FineTuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
  }

  /**
   * A list of tools the model may generate JSON inputs for.
   */
  public FineTuneChatRequestInput tools(List<ChatCompletionTool> tools) {
    this.tools = tools;
    return this;
  }

  
  @ApiModelProperty(value = "A list of tools the model may generate JSON inputs for.")
  @JsonProperty("tools")
  public List<ChatCompletionTool> getTools() {
    return tools;
  }
  public void setTools(List<ChatCompletionTool> tools) {
    this.tools = tools;
  }

  /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   */
  public FineTuneChatRequestInput parallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.")
  @JsonProperty("parallel_tool_calls")
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }
  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }

  /**
   * A list of functions the model may generate JSON inputs for.
   */
  public FineTuneChatRequestInput functions(List<ChatCompletionFunctions> functions) {
    this.functions = functions;
    return this;
  }

  
  @ApiModelProperty(value = "A list of functions the model may generate JSON inputs for.")
  @JsonProperty("functions")
  public List<ChatCompletionFunctions> getFunctions() {
    return functions;
  }
  public void setFunctions(List<ChatCompletionFunctions> functions) {
    this.functions = functions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTuneChatRequestInput fineTuneChatRequestInput = (FineTuneChatRequestInput) o;
    return Objects.equals(messages, fineTuneChatRequestInput.messages) &&
        Objects.equals(tools, fineTuneChatRequestInput.tools) &&
        Objects.equals(parallelToolCalls, fineTuneChatRequestInput.parallelToolCalls) &&
        Objects.equals(functions, fineTuneChatRequestInput.functions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, tools, parallelToolCalls, functions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTuneChatRequestInput {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    parallelToolCalls: ").append(toIndentedString(parallelToolCalls)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
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

