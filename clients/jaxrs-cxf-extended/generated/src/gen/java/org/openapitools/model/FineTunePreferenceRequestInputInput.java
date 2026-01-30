package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionTool;
import org.openapitools.model.FineTuneChatRequestInputMessagesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FineTunePreferenceRequestInputInput  {
  
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
  * Get messages
  * @return messages
  */
  @JsonProperty("messages")
 @Size(min=1)  public List<FineTuneChatRequestInputMessagesInner> getMessages() {
    return messages;
  }

  /**
   * Sets the <code>messages</code> property.
   */
 public void setMessages(List<FineTuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
  }

  /**
   * Sets the <code>messages</code> property.
   */
  public FineTunePreferenceRequestInputInput messages(List<FineTuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  /**
   * Adds a new item to the <code>messages</code> list.
   */
  public FineTunePreferenceRequestInputInput addMessagesItem(FineTuneChatRequestInputMessagesInner messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

 /**
  * A list of tools the model may generate JSON inputs for.
  * @return tools
  */
  @JsonProperty("tools")
  public List<@Valid ChatCompletionTool> getTools() {
    return tools;
  }

  /**
   * Sets the <code>tools</code> property.
   */
 public void setTools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
  }

  /**
   * Sets the <code>tools</code> property.
   */
  public FineTunePreferenceRequestInputInput tools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
    return this;
  }

  /**
   * Adds a new item to the <code>tools</code> list.
   */
  public FineTunePreferenceRequestInputInput addToolsItem(ChatCompletionTool toolsItem) {
    this.tools.add(toolsItem);
    return this;
  }

 /**
  * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  * @return parallelToolCalls
  */
  @JsonProperty("parallel_tool_calls")
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }

  /**
   * Sets the <code>parallelToolCalls</code> property.
   */
 public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }

  /**
   * Sets the <code>parallelToolCalls</code> property.
   */
  public FineTunePreferenceRequestInputInput parallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
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
    FineTunePreferenceRequestInputInput fineTunePreferenceRequestInputInput = (FineTunePreferenceRequestInputInput) o;
    return Objects.equals(this.messages, fineTunePreferenceRequestInputInput.messages) &&
        Objects.equals(this.tools, fineTunePreferenceRequestInputInput.tools) &&
        Objects.equals(this.parallelToolCalls, fineTunePreferenceRequestInputInput.parallelToolCalls);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

