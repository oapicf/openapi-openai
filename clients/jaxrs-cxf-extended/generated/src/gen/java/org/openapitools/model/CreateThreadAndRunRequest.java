package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssistantsApiResponseFormatOption;
import org.openapitools.model.AssistantsApiToolChoiceOption;
import org.openapitools.model.CreateRunRequestModel;
import org.openapitools.model.CreateThreadAndRunRequestToolResources;
import org.openapitools.model.CreateThreadAndRunRequestToolsInner;
import org.openapitools.model.CreateThreadRequest;
import org.openapitools.model.TruncationObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateThreadAndRunRequest  {
  
 /**
  * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
  */
  @ApiModelProperty(required = true, value = "The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.")
  private String assistantId;

  @ApiModelProperty(value = "")
  @Valid
  private CreateThreadRequest thread;

  @ApiModelProperty(value = "")
  @Valid
  private CreateRunRequestModel model;

 /**
  * Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
  */
  @ApiModelProperty(value = "Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.")
  private String instructions;

 /**
  * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
  */
  @ApiModelProperty(value = "Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.")
  @Valid
  private List<CreateThreadAndRunRequestToolsInner> tools;

  @ApiModelProperty(value = "")
  @Valid
  private CreateThreadAndRunRequestToolResources toolResources;

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  private Object metadata;

 /**
  * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  */
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. ")
  @Valid
  private BigDecimal temperature = new BigDecimal("1");

 /**
  * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
  */
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. ")
  @Valid
  private BigDecimal topP = new BigDecimal("1");

 /**
  * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
  */
  @ApiModelProperty(value = "If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. ")
  private Boolean stream;

 /**
  * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
  */
  @ApiModelProperty(value = "The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. ")
  private Integer maxPromptTokens;

 /**
  * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
  */
  @ApiModelProperty(value = "The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. ")
  private Integer maxCompletionTokens;

  @ApiModelProperty(value = "")
  @Valid
  private TruncationObject truncationStrategy;

  @ApiModelProperty(value = "")
  @Valid
  private AssistantsApiToolChoiceOption toolChoice;

 /**
  * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  */
  @ApiModelProperty(value = "Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.")
  private Boolean parallelToolCalls = true;

  @ApiModelProperty(value = "")
  @Valid
  private AssistantsApiResponseFormatOption responseFormat;
 /**
  * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
  * @return assistantId
  */
  @JsonProperty("assistant_id")
  @NotNull
  public String getAssistantId() {
    return assistantId;
  }

  /**
   * Sets the <code>assistantId</code> property.
   */
 public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  /**
   * Sets the <code>assistantId</code> property.
   */
  public CreateThreadAndRunRequest assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

 /**
  * Get thread
  * @return thread
  */
  @JsonProperty("thread")
  public CreateThreadRequest getThread() {
    return thread;
  }

  /**
   * Sets the <code>thread</code> property.
   */
 public void setThread(CreateThreadRequest thread) {
    this.thread = thread;
  }

  /**
   * Sets the <code>thread</code> property.
   */
  public CreateThreadAndRunRequest thread(CreateThreadRequest thread) {
    this.thread = thread;
    return this;
  }

 /**
  * Get model
  * @return model
  */
  @JsonProperty("model")
  public CreateRunRequestModel getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(CreateRunRequestModel model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
  public CreateThreadAndRunRequest model(CreateRunRequestModel model) {
    this.model = model;
    return this;
  }

 /**
  * Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
  * @return instructions
  */
  @JsonProperty("instructions")
  public String getInstructions() {
    return instructions;
  }

  /**
   * Sets the <code>instructions</code> property.
   */
 public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  /**
   * Sets the <code>instructions</code> property.
   */
  public CreateThreadAndRunRequest instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

 /**
  * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
  * @return tools
  */
  @JsonProperty("tools")
 @Size(max=20)  public List<CreateThreadAndRunRequestToolsInner> getTools() {
    return tools;
  }

  /**
   * Sets the <code>tools</code> property.
   */
 public void setTools(List<CreateThreadAndRunRequestToolsInner> tools) {
    this.tools = tools;
  }

  /**
   * Sets the <code>tools</code> property.
   */
  public CreateThreadAndRunRequest tools(List<CreateThreadAndRunRequestToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  /**
   * Adds a new item to the <code>tools</code> list.
   */
  public CreateThreadAndRunRequest addToolsItem(CreateThreadAndRunRequestToolsInner toolsItem) {
    this.tools.add(toolsItem);
    return this;
  }

 /**
  * Get toolResources
  * @return toolResources
  */
  @JsonProperty("tool_resources")
  public CreateThreadAndRunRequestToolResources getToolResources() {
    return toolResources;
  }

  /**
   * Sets the <code>toolResources</code> property.
   */
 public void setToolResources(CreateThreadAndRunRequestToolResources toolResources) {
    this.toolResources = toolResources;
  }

  /**
   * Sets the <code>toolResources</code> property.
   */
  public CreateThreadAndRunRequest toolResources(CreateThreadAndRunRequestToolResources toolResources) {
    this.toolResources = toolResources;
    return this;
  }

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  * @return metadata
  */
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
 public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
  public CreateThreadAndRunRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
  * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  * minimum: 0
  * maximum: 2
  * @return temperature
  */
  @JsonProperty("temperature")
 @DecimalMin("0") @DecimalMax("2")  public BigDecimal getTemperature() {
    return temperature;
  }

  /**
   * Sets the <code>temperature</code> property.
   */
 public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  /**
   * Sets the <code>temperature</code> property.
   */
  public CreateThreadAndRunRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

 /**
  * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
  * minimum: 0
  * maximum: 1
  * @return topP
  */
  @JsonProperty("top_p")
 @DecimalMin("0") @DecimalMax("1")  public BigDecimal getTopP() {
    return topP;
  }

  /**
   * Sets the <code>topP</code> property.
   */
 public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  /**
   * Sets the <code>topP</code> property.
   */
  public CreateThreadAndRunRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

 /**
  * If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. 
  * @return stream
  */
  @JsonProperty("stream")
  public Boolean getStream() {
    return stream;
  }

  /**
   * Sets the <code>stream</code> property.
   */
 public void setStream(Boolean stream) {
    this.stream = stream;
  }

  /**
   * Sets the <code>stream</code> property.
   */
  public CreateThreadAndRunRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

 /**
  * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info. 
  * minimum: 256
  * @return maxPromptTokens
  */
  @JsonProperty("max_prompt_tokens")
 @Min(256)  public Integer getMaxPromptTokens() {
    return maxPromptTokens;
  }

  /**
   * Sets the <code>maxPromptTokens</code> property.
   */
 public void setMaxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }

  /**
   * Sets the <code>maxPromptTokens</code> property.
   */
  public CreateThreadAndRunRequest maxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
    return this;
  }

 /**
  * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info. 
  * minimum: 256
  * @return maxCompletionTokens
  */
  @JsonProperty("max_completion_tokens")
 @Min(256)  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }

  /**
   * Sets the <code>maxCompletionTokens</code> property.
   */
 public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  /**
   * Sets the <code>maxCompletionTokens</code> property.
   */
  public CreateThreadAndRunRequest maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
    return this;
  }

 /**
  * Get truncationStrategy
  * @return truncationStrategy
  */
  @JsonProperty("truncation_strategy")
  public TruncationObject getTruncationStrategy() {
    return truncationStrategy;
  }

  /**
   * Sets the <code>truncationStrategy</code> property.
   */
 public void setTruncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
  }

  /**
   * Sets the <code>truncationStrategy</code> property.
   */
  public CreateThreadAndRunRequest truncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
    return this;
  }

 /**
  * Get toolChoice
  * @return toolChoice
  */
  @JsonProperty("tool_choice")
  public AssistantsApiToolChoiceOption getToolChoice() {
    return toolChoice;
  }

  /**
   * Sets the <code>toolChoice</code> property.
   */
 public void setToolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

  /**
   * Sets the <code>toolChoice</code> property.
   */
  public CreateThreadAndRunRequest toolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
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
  public CreateThreadAndRunRequest parallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
    return this;
  }

 /**
  * Get responseFormat
  * @return responseFormat
  */
  @JsonProperty("response_format")
  public AssistantsApiResponseFormatOption getResponseFormat() {
    return responseFormat;
  }

  /**
   * Sets the <code>responseFormat</code> property.
   */
 public void setResponseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
  }

  /**
   * Sets the <code>responseFormat</code> property.
   */
  public CreateThreadAndRunRequest responseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
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
    CreateThreadAndRunRequest createThreadAndRunRequest = (CreateThreadAndRunRequest) o;
    return Objects.equals(this.assistantId, createThreadAndRunRequest.assistantId) &&
        Objects.equals(this.thread, createThreadAndRunRequest.thread) &&
        Objects.equals(this.model, createThreadAndRunRequest.model) &&
        Objects.equals(this.instructions, createThreadAndRunRequest.instructions) &&
        Objects.equals(this.tools, createThreadAndRunRequest.tools) &&
        Objects.equals(this.toolResources, createThreadAndRunRequest.toolResources) &&
        Objects.equals(this.metadata, createThreadAndRunRequest.metadata) &&
        Objects.equals(this.temperature, createThreadAndRunRequest.temperature) &&
        Objects.equals(this.topP, createThreadAndRunRequest.topP) &&
        Objects.equals(this.stream, createThreadAndRunRequest.stream) &&
        Objects.equals(this.maxPromptTokens, createThreadAndRunRequest.maxPromptTokens) &&
        Objects.equals(this.maxCompletionTokens, createThreadAndRunRequest.maxCompletionTokens) &&
        Objects.equals(this.truncationStrategy, createThreadAndRunRequest.truncationStrategy) &&
        Objects.equals(this.toolChoice, createThreadAndRunRequest.toolChoice) &&
        Objects.equals(this.parallelToolCalls, createThreadAndRunRequest.parallelToolCalls) &&
        Objects.equals(this.responseFormat, createThreadAndRunRequest.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assistantId, thread, model, instructions, tools, toolResources, metadata, temperature, topP, stream, maxPromptTokens, maxCompletionTokens, truncationStrategy, toolChoice, parallelToolCalls, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateThreadAndRunRequest {\n");
    
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    thread: ").append(toIndentedString(thread)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    toolResources: ").append(toIndentedString(toolResources)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    maxPromptTokens: ").append(toIndentedString(maxPromptTokens)).append("\n");
    sb.append("    maxCompletionTokens: ").append(toIndentedString(maxCompletionTokens)).append("\n");
    sb.append("    truncationStrategy: ").append(toIndentedString(truncationStrategy)).append("\n");
    sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
    sb.append("    parallelToolCalls: ").append(toIndentedString(parallelToolCalls)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
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

