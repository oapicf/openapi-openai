package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssistantObjectToolsInner;
import org.openapitools.model.AssistantsApiResponseFormatOption;
import org.openapitools.model.AssistantsApiToolChoiceOption;
import org.openapitools.model.RunCompletionUsage;
import org.openapitools.model.RunObjectIncompleteDetails;
import org.openapitools.model.RunObjectLastError;
import org.openapitools.model.RunObjectRequiredAction;
import org.openapitools.model.TruncationObject;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 */
public class RunObject implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The identifier, which can be referenced in API endpoints.
   */
  @JsonProperty("id")
  private String id;

  /**
   * The object type, which is always &#x60;thread.run&#x60;.
   */
  @JsonProperty("object")
  private String _object;

  /**
   * The Unix timestamp (in seconds) for when the run was created.
   */
  @JsonProperty("created_at")
  private Integer createdAt;

  /**
   * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
   */
  @JsonProperty("thread_id")
  private String threadId;

  /**
   * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
   */
  @JsonProperty("assistant_id")
  private String assistantId;

  /**
   * The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;.
   */
  @JsonProperty("status")
  private String status;

  @JsonProperty("required_action")
  private RunObjectRequiredAction requiredAction;

  @JsonProperty("last_error")
  private RunObjectLastError lastError;

  /**
   * The Unix timestamp (in seconds) for when the run will expire.
   */
  @JsonProperty("expires_at")
  private Integer expiresAt;

  /**
   * The Unix timestamp (in seconds) for when the run was started.
   */
  @JsonProperty("started_at")
  private Integer startedAt;

  /**
   * The Unix timestamp (in seconds) for when the run was cancelled.
   */
  @JsonProperty("cancelled_at")
  private Integer cancelledAt;

  /**
   * The Unix timestamp (in seconds) for when the run failed.
   */
  @JsonProperty("failed_at")
  private Integer failedAt;

  /**
   * The Unix timestamp (in seconds) for when the run was completed.
   */
  @JsonProperty("completed_at")
  private Integer completedAt;

  @JsonProperty("incomplete_details")
  private RunObjectIncompleteDetails incompleteDetails;

  /**
   * The model that the [assistant](/docs/api-reference/assistants) used for this run.
   */
  @JsonProperty("model")
  private String model;

  /**
   * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
   */
  @JsonProperty("instructions")
  private String instructions;

  /**
   * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
   */
  @JsonProperty("tools")
  private List<AssistantObjectToolsInner> tools = new ArrayList<>();

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   */
  @JsonProperty("metadata")
  private Object metadata;

  @JsonProperty("usage")
  private RunCompletionUsage usage;

  /**
   * The sampling temperature used for this run. If not set, defaults to 1.
   */
  @JsonProperty("temperature")
  private BigDecimal temperature;

  /**
   * The nucleus sampling value used for this run. If not set, defaults to 1.
   */
  @JsonProperty("top_p")
  private BigDecimal topP;

  /**
   * The maximum number of prompt tokens specified to have been used over the course of the run. 
   */
  @JsonProperty("max_prompt_tokens")
  private Integer maxPromptTokens;

  /**
   * The maximum number of completion tokens specified to have been used over the course of the run. 
   */
  @JsonProperty("max_completion_tokens")
  private Integer maxCompletionTokens;

  @JsonProperty("truncation_strategy")
  private TruncationObject truncationStrategy;

  @JsonProperty("tool_choice")
  private AssistantsApiToolChoiceOption toolChoice;

  /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   */
  @JsonProperty("parallel_tool_calls")
  private Boolean parallelToolCalls = true;

  @JsonProperty("response_format")
  private AssistantsApiResponseFormatOption responseFormat;

  /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always &#x60;thread.run&#x60;.
   * @return _object
   */
  public String getObject() {
    return _object;
  }

  public void setObject(String _object) {
    this._object = _object;
  }

  /**
   * The Unix timestamp (in seconds) for when the run was created.
   * @return createdAt
   */
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
   * @return threadId
   */
  public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  /**
   * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
   * @return assistantId
   */
  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  /**
   * The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;.
   * @return status
   */
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * 
   * @return requiredAction
   */
  public RunObjectRequiredAction getRequiredAction() {
    return requiredAction;
  }

  public void setRequiredAction(RunObjectRequiredAction requiredAction) {
    this.requiredAction = requiredAction;
  }

  /**
   * 
   * @return lastError
   */
  public RunObjectLastError getLastError() {
    return lastError;
  }

  public void setLastError(RunObjectLastError lastError) {
    this.lastError = lastError;
  }

  /**
   * The Unix timestamp (in seconds) for when the run will expire.
   * @return expiresAt
   */
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the run was started.
   * @return startedAt
   */
  public Integer getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(Integer startedAt) {
    this.startedAt = startedAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the run was cancelled.
   * @return cancelledAt
   */
  public Integer getCancelledAt() {
    return cancelledAt;
  }

  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the run failed.
   * @return failedAt
   */
  public Integer getFailedAt() {
    return failedAt;
  }

  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the run was completed.
   * @return completedAt
   */
  public Integer getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

  /**
   * 
   * @return incompleteDetails
   */
  public RunObjectIncompleteDetails getIncompleteDetails() {
    return incompleteDetails;
  }

  public void setIncompleteDetails(RunObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
  }

  /**
   * The model that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return model
   */
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  /**
   * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return instructions
   */
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  /**
   * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return tools
   */
  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
   */
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   * 
   * @return usage
   */
  public RunCompletionUsage getUsage() {
    return usage;
  }

  public void setUsage(RunCompletionUsage usage) {
    this.usage = usage;
  }

  /**
   * The sampling temperature used for this run. If not set, defaults to 1.
   * @return temperature
   */
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  /**
   * The nucleus sampling value used for this run. If not set, defaults to 1.
   * @return topP
   */
  public BigDecimal getTopP() {
    return topP;
  }

  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  /**
   * The maximum number of prompt tokens specified to have been used over the course of the run. 
   * @return maxPromptTokens
   */
  public Integer getMaxPromptTokens() {
    return maxPromptTokens;
  }

  public void setMaxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }

  /**
   * The maximum number of completion tokens specified to have been used over the course of the run. 
   * @return maxCompletionTokens
   */
  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }

  public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  /**
   * 
   * @return truncationStrategy
   */
  public TruncationObject getTruncationStrategy() {
    return truncationStrategy;
  }

  public void setTruncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
  }

  /**
   * 
   * @return toolChoice
   */
  public AssistantsApiToolChoiceOption getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

  /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   * @return parallelToolCalls
   */
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }

  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }

  /**
   * 
   * @return responseFormat
   */
  public AssistantsApiResponseFormatOption getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunObject runObject = (RunObject) o;
    return Objects.equals(this.id, runObject.id) &&
        Objects.equals(this._object, runObject._object) &&
        Objects.equals(this.createdAt, runObject.createdAt) &&
        Objects.equals(this.threadId, runObject.threadId) &&
        Objects.equals(this.assistantId, runObject.assistantId) &&
        Objects.equals(this.status, runObject.status) &&
        Objects.equals(this.requiredAction, runObject.requiredAction) &&
        Objects.equals(this.lastError, runObject.lastError) &&
        Objects.equals(this.expiresAt, runObject.expiresAt) &&
        Objects.equals(this.startedAt, runObject.startedAt) &&
        Objects.equals(this.cancelledAt, runObject.cancelledAt) &&
        Objects.equals(this.failedAt, runObject.failedAt) &&
        Objects.equals(this.completedAt, runObject.completedAt) &&
        Objects.equals(this.incompleteDetails, runObject.incompleteDetails) &&
        Objects.equals(this.model, runObject.model) &&
        Objects.equals(this.instructions, runObject.instructions) &&
        Objects.equals(this.tools, runObject.tools) &&
        Objects.equals(this.metadata, runObject.metadata) &&
        Objects.equals(this.usage, runObject.usage) &&
        Objects.equals(this.temperature, runObject.temperature) &&
        Objects.equals(this.topP, runObject.topP) &&
        Objects.equals(this.maxPromptTokens, runObject.maxPromptTokens) &&
        Objects.equals(this.maxCompletionTokens, runObject.maxCompletionTokens) &&
        Objects.equals(this.truncationStrategy, runObject.truncationStrategy) &&
        Objects.equals(this.toolChoice, runObject.toolChoice) &&
        Objects.equals(this.parallelToolCalls, runObject.parallelToolCalls) &&
        Objects.equals(this.responseFormat, runObject.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, threadId, assistantId, status, requiredAction, lastError, expiresAt, startedAt, cancelledAt, failedAt, completedAt, incompleteDetails, model, instructions, tools, metadata, usage, temperature, topP, maxPromptTokens, maxCompletionTokens, truncationStrategy, toolChoice, parallelToolCalls, responseFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    requiredAction: ").append(toIndentedString(requiredAction)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    cancelledAt: ").append(toIndentedString(cancelledAt)).append("\n");
    sb.append("    failedAt: ").append(toIndentedString(failedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    incompleteDetails: ").append(toIndentedString(incompleteDetails)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
