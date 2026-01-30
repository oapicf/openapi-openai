package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionTool;
import org.openapitools.model.FineTuneChatRequestInputMessagesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("FineTunePreferenceRequestInput_input")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTunePreferenceRequestInputInput   {
  private @Valid List<FineTuneChatRequestInputMessagesInner> messages = new ArrayList<>();
  private @Valid List<@Valid ChatCompletionTool> tools = new ArrayList<>();
  private Boolean parallelToolCalls = true;

  public FineTunePreferenceRequestInputInput() {
  }

  /**
   **/
  public FineTunePreferenceRequestInputInput messages(List<FineTuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("messages")
  @Valid  @Size(min=1)public List<@Valid FineTuneChatRequestInputMessagesInner> getMessages() {
    return messages;
  }

  @JsonProperty("messages")
  public void setMessages(List<FineTuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
  }

  public FineTunePreferenceRequestInputInput addMessagesItem(FineTuneChatRequestInputMessagesInner messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }

    this.messages.add(messagesItem);
    return this;
  }

  public FineTunePreferenceRequestInputInput removeMessagesItem(FineTuneChatRequestInputMessagesInner messagesItem) {
    if (messagesItem != null && this.messages != null) {
      this.messages.remove(messagesItem);
    }

    return this;
  }
  /**
   * A list of tools the model may generate JSON inputs for.
   **/
  public FineTunePreferenceRequestInputInput tools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
    return this;
  }

  
  @ApiModelProperty(value = "A list of tools the model may generate JSON inputs for.")
  @JsonProperty("tools")
  @Valid public List<@Valid ChatCompletionTool> getTools() {
    return tools;
  }

  @JsonProperty("tools")
  public void setTools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
  }

  public FineTunePreferenceRequestInputInput addToolsItem(ChatCompletionTool toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }

    this.tools.add(toolsItem);
    return this;
  }

  public FineTunePreferenceRequestInputInput removeToolsItem(ChatCompletionTool toolsItem) {
    if (toolsItem != null && this.tools != null) {
      this.tools.remove(toolsItem);
    }

    return this;
  }
  /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   **/
  public FineTunePreferenceRequestInputInput parallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.")
  @JsonProperty("parallel_tool_calls")
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }

  @JsonProperty("parallel_tool_calls")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

