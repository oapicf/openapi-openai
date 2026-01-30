package apimodels;

import apimodels.ChatCompletionFunctions;
import apimodels.ChatCompletionTool;
import apimodels.FineTuneChatRequestInputMessagesInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class FineTuneChatRequestInput   {
  @JsonProperty("messages")
  @Size(min=1)
@Valid

  private List<FineTuneChatRequestInputMessagesInner> messages = null;

  @JsonProperty("tools")
  @Valid

  private List<@Valid ChatCompletionTool> tools = null;

  @JsonProperty("parallel_tool_calls")
  
  private Boolean parallelToolCalls = true;

  @JsonProperty("functions")
  @Size(min=1,max=128)
@Valid

  private List<@Valid ChatCompletionFunctions> functions = null;

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
  **/
  public List<FineTuneChatRequestInputMessagesInner> getMessages() {
    return messages;
  }

  public void setMessages(List<FineTuneChatRequestInputMessagesInner> messages) {
    this.messages = messages;
  }

  public FineTuneChatRequestInput tools(List<@Valid ChatCompletionTool> tools) {
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
  **/
  public List<@Valid ChatCompletionTool> getTools() {
    return tools;
  }

  public void setTools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
  }

  public FineTuneChatRequestInput parallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
    return this;
  }

   /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   * @return parallelToolCalls
  **/
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }

  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }

  public FineTuneChatRequestInput functions(List<@Valid ChatCompletionFunctions> functions) {
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
  **/
  public List<@Valid ChatCompletionFunctions> getFunctions() {
    return functions;
  }

  public void setFunctions(List<@Valid ChatCompletionFunctions> functions) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

