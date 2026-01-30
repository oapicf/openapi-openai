package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ChatCompletionFunctions;
import com.prokarma.pkmst.model.ChatCompletionTool;
import com.prokarma.pkmst.model.FineTuneChatRequestInputMessagesInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 */
@ApiModel(description = "The per-line training example of a fine-tuning input file for chat models using the supervised method.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneChatRequestInput   {
  @JsonProperty("messages")
  
  private List<FineTuneChatRequestInputMessagesInner> messages = null;

  @JsonProperty("tools")
  
  private List<ChatCompletionTool> tools = null;

  @JsonProperty("parallel_tool_calls")
  private Boolean parallelToolCalls = true;

  @JsonProperty("functions")
  
  private List<ChatCompletionFunctions> functions = null;

  public FineTuneChatRequestInput messages(List<FineTuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  public FineTuneChatRequestInput addMessagesItem(FineTuneChatRequestInputMessagesInner messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * Get messages
   * @return messages
   */
  @ApiModelProperty(value = "")
  public List<FineTuneChatRequestInputMessagesInner> getMessages() {
    return messages;
  }

  public void setMessages(List<FineTuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
  }

  public FineTuneChatRequestInput tools(List<ChatCompletionTool> tools) {
    this.tools = tools;
    return this;
  }

  public FineTuneChatRequestInput addToolsItem(ChatCompletionTool toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

  /**
   * A list of tools the model may generate JSON inputs for.
   * @return tools
   */
  @ApiModelProperty(value = "A list of tools the model may generate JSON inputs for.")
  public List<ChatCompletionTool> getTools() {
    return tools;
  }

  public void setTools(List<ChatCompletionTool> tools) {
    this.tools = tools;
  }

  public FineTuneChatRequestInput parallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
    return this;
  }

  /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   * @return parallelToolCalls
   */
  @ApiModelProperty(value = "Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.")
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }

  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }

  public FineTuneChatRequestInput functions(List<ChatCompletionFunctions> functions) {
    this.functions = functions;
    return this;
  }

  public FineTuneChatRequestInput addFunctionsItem(ChatCompletionFunctions functionsItem) {
    if (this.functions == null) {
      this.functions = new ArrayList<>();
    }
    this.functions.add(functionsItem);
    return this;
  }

  /**
   * A list of functions the model may generate JSON inputs for.
   * @return functions
   */
  @ApiModelProperty(value = "A list of functions the model may generate JSON inputs for.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

