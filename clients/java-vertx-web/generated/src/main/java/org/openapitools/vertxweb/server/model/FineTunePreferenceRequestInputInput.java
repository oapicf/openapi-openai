package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ChatCompletionTool;
import org.openapitools.vertxweb.server.model.FineTuneChatRequestInputMessagesInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FineTunePreferenceRequestInputInput   {
  
  private List<FineTuneChatRequestInputMessagesInner> messages = new ArrayList<>();
  private List<ChatCompletionTool> tools = new ArrayList<>();
  private Boolean parallelToolCalls = true;

  public FineTunePreferenceRequestInputInput () {

  }

  public FineTunePreferenceRequestInputInput (List<FineTuneChatRequestInputMessagesInner> messages, List<ChatCompletionTool> tools, Boolean parallelToolCalls) {
    this.messages = messages;
    this.tools = tools;
    this.parallelToolCalls = parallelToolCalls;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FineTunePreferenceRequestInputInput fineTunePreferenceRequestInputInput = (FineTunePreferenceRequestInputInput) o;
    return Objects.equals(messages, fineTunePreferenceRequestInputInput.messages) &&
        Objects.equals(tools, fineTunePreferenceRequestInputInput.tools) &&
        Objects.equals(parallelToolCalls, fineTunePreferenceRequestInputInput.parallelToolCalls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, tools, parallelToolCalls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FineTunePreferenceRequestInputInput {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    parallelToolCalls: ").append(toIndentedString(parallelToolCalls)).append("\n");
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
