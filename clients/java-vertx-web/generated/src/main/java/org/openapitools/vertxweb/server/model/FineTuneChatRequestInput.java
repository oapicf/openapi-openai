package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ChatCompletionFunctions;
import org.openapitools.vertxweb.server.model.ChatCompletionTool;
import org.openapitools.vertxweb.server.model.FineTuneChatRequestInputMessagesInner;

/**
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTuneChatRequestInput   {
  
  private List<FineTuneChatRequestInputMessagesInner> messages = new ArrayList<>();
  private List<ChatCompletionTool> tools = new ArrayList<>();
  private Boolean parallelToolCalls = true;
  private List<ChatCompletionFunctions> functions = new ArrayList<>();

  public FineTuneChatRequestInput () {

  }

  public FineTuneChatRequestInput (List<FineTuneChatRequestInputMessagesInner> messages, List<ChatCompletionTool> tools, Boolean parallelToolCalls, List<ChatCompletionFunctions> functions) {
    this.messages = messages;
    this.tools = tools;
    this.parallelToolCalls = parallelToolCalls;
    this.functions = functions;
  }

    
  @JsonProperty("messages")
  public List<FineTuneChatRequestInputMessagesInner> getMessages() {
    return messages;
  }
  public void setMessages(List<FineTuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
  }

    
  @JsonProperty("tools")
  public List<ChatCompletionTool> getTools() {
    return tools;
  }
  public void setTools(List<ChatCompletionTool> tools) {
    this.tools = tools;
  }

    
  @JsonProperty("parallel_tool_calls")
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }
  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }

    
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
