package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionFunctions;
import org.openapitools.model.ChatCompletionTool;
import org.openapitools.model.FineTuneChatRequestInputMessagesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 */
@ApiModel(description="The per-line training example of a fine-tuning input file for chat models using the supervised method.")

public class FineTuneChatRequestInput  {
  
  @ApiModelProperty(value = "")

  @Valid

  private List<FineTuneChatRequestInputMessagesInner> messages = new ArrayList<>();

 /**
  * A list of tools the model may generate JSON inputs for.
  */
  @ApiModelProperty(value = "A list of tools the model may generate JSON inputs for.")

  @Valid

  private List<@Valid ChatCompletionTool> tools = new ArrayList<>();

 /**
  * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  */
  @ApiModelProperty(value = "Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.")

  private Boolean parallelToolCalls = true;

 /**
  * A list of functions the model may generate JSON inputs for.
  */
  @ApiModelProperty(value = "A list of functions the model may generate JSON inputs for.")

  @Valid

  private List<@Valid ChatCompletionFunctions> functions = new ArrayList<>();
 /**
   * Get messages
   * @return messages
  **/
  @JsonProperty("messages")
 @Size(min=1)  public List<FineTuneChatRequestInputMessagesInner> getMessages() {
    return messages;
  }

  public void setMessages(List<FineTuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
  }

  public FineTuneChatRequestInput messages(List<FineTuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  public FineTuneChatRequestInput addMessagesItem(FineTuneChatRequestInputMessagesInner messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

 /**
   * A list of tools the model may generate JSON inputs for.
   * @return tools
  **/
  @JsonProperty("tools")
  public List<@Valid ChatCompletionTool> getTools() {
    return tools;
  }

  public void setTools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
  }

  public FineTuneChatRequestInput tools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
    return this;
  }

  public FineTuneChatRequestInput addToolsItem(ChatCompletionTool toolsItem) {
    this.tools.add(toolsItem);
    return this;
  }

 /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   * @return parallelToolCalls
  **/
  @JsonProperty("parallel_tool_calls")
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }

  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }

  public FineTuneChatRequestInput parallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
    return this;
  }

 /**
   * A list of functions the model may generate JSON inputs for.
   * @return functions
  **/
  @JsonProperty("functions")
 @Size(min=1,max=128)  public List<@Valid ChatCompletionFunctions> getFunctions() {
    return functions;
  }

  public void setFunctions(List<@Valid ChatCompletionFunctions> functions) {
    this.functions = functions;
  }

  public FineTuneChatRequestInput functions(List<@Valid ChatCompletionFunctions> functions) {
    this.functions = functions;
    return this;
  }

  public FineTuneChatRequestInput addFunctionsItem(ChatCompletionFunctions functionsItem) {
    this.functions.add(functionsItem);
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
    FineTuneChatRequestInput fineTuneChatRequestInput = (FineTuneChatRequestInput) o;
    return Objects.equals(this.messages, fineTuneChatRequestInput.messages) &&
        Objects.equals(this.tools, fineTuneChatRequestInput.tools) &&
        Objects.equals(this.parallelToolCalls, fineTuneChatRequestInput.parallelToolCalls) &&
        Objects.equals(this.functions, fineTuneChatRequestInput.functions);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

