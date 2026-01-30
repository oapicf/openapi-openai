package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChatCompletionFunctions;
import org.openapitools.model.ChatCompletionTool;
import org.openapitools.model.FineTuneChatRequestInputMessagesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 */

@Schema(name = "FineTuneChatRequestInput", description = "The per-line training example of a fine-tuning input file for chat models using the supervised method.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FineTuneChatRequestInput {

  @Valid
  private List<FineTuneChatRequestInputMessagesInner> messages = new ArrayList<>();

  @Valid
  private List<@Valid ChatCompletionTool> tools = new ArrayList<>();

  private Boolean parallelToolCalls = true;

  @Deprecated
  @Valid
  private List<@Valid ChatCompletionFunctions> functions = new ArrayList<>();

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
  @Valid @Size(min = 1) 
  @Schema(name = "messages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messages")
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
   */
  @Valid 
  @Schema(name = "tools", description = "A list of tools the model may generate JSON inputs for.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tools")
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
   */
  
  @Schema(name = "parallel_tool_calls", description = "Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parallel_tool_calls")
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
   * @deprecated
   */
  @Valid @Size(min = 1, max = 128) 
  @Schema(name = "functions", description = "A list of functions the model may generate JSON inputs for.", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("functions")
  @Deprecated
  public List<@Valid ChatCompletionFunctions> getFunctions() {
    return functions;
  }

  /**
   * @deprecated
   */
  @Deprecated
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

