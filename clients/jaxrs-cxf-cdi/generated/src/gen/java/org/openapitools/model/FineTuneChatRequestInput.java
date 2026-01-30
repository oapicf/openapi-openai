package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The per-line training example of a fine-tuning input file for chat models using the supervised method.")
public class FineTuneChatRequestInput   {
  
  private List<FineTuneChatRequestInputMessagesInner> messages = new ArrayList<>();

  private List<@Valid ChatCompletionTool> tools = new ArrayList<>();

  private Boolean parallelToolCalls = true;

  private List<@Valid ChatCompletionFunctions> functions = new ArrayList<>();

  /**
   **/
  public FineTuneChatRequestInput messages(List<FineTuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("messages")
 @Size(min=1)  public List<FineTuneChatRequestInputMessagesInner> getMessages() {
    return messages;
  }
  public void setMessages(List<FineTuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
  }

  public FineTuneChatRequestInput addMessagesItem(FineTuneChatRequestInputMessagesInner messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }


  /**
   * A list of tools the model may generate JSON inputs for.
   **/
  public FineTuneChatRequestInput tools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
    return this;
  }

  
  @ApiModelProperty(value = "A list of tools the model may generate JSON inputs for.")
  @JsonProperty("tools")
  public List<@Valid ChatCompletionTool> getTools() {
    return tools;
  }
  public void setTools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
  }

  public FineTuneChatRequestInput addToolsItem(ChatCompletionTool toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }


  /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   **/
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
   **/
  public FineTuneChatRequestInput functions(List<@Valid ChatCompletionFunctions> functions) {
    this.functions = functions;
    return this;
  }

  
  @ApiModelProperty(value = "A list of functions the model may generate JSON inputs for.")
  @JsonProperty("functions")
 @Size(min=1,max=128)  public List<@Valid ChatCompletionFunctions> getFunctions() {
    return functions;
  }
  public void setFunctions(List<@Valid ChatCompletionFunctions> functions) {
    this.functions = functions;
  }

  public FineTuneChatRequestInput addFunctionsItem(ChatCompletionFunctions functionsItem) {
    if (this.functions == null) {
      this.functions = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

