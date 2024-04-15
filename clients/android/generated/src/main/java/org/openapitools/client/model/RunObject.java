/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.math.BigDecimal;
import java.util.*;
import org.openapitools.client.model.AssistantObjectToolsInner;
import org.openapitools.client.model.AssistantsApiResponseFormatOption;
import org.openapitools.client.model.AssistantsApiToolChoiceOption;
import org.openapitools.client.model.RunCompletionUsage;
import org.openapitools.client.model.RunObjectIncompleteDetails;
import org.openapitools.client.model.RunObjectLastError;
import org.openapitools.client.model.RunObjectRequiredAction;
import org.openapitools.client.model.TruncationObject;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 **/
@ApiModel(description = "Represents an execution run on a [thread](/docs/api-reference/threads).")
public class RunObject {
  
  @SerializedName("id")
  private String id = null;
  public enum _objectEnum {
     thread.run, 
  };
  @SerializedName("object")
  private _objectEnum _object = null;
  @SerializedName("created_at")
  private Integer createdAt = null;
  @SerializedName("thread_id")
  private String threadId = null;
  @SerializedName("assistant_id")
  private String assistantId = null;
  public enum StatusEnum {
     queued,  in_progress,  requires_action,  cancelling,  cancelled,  failed,  completed,  expired, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("required_action")
  private RunObjectRequiredAction requiredAction = null;
  @SerializedName("last_error")
  private RunObjectLastError lastError = null;
  @SerializedName("expires_at")
  private Integer expiresAt = null;
  @SerializedName("started_at")
  private Integer startedAt = null;
  @SerializedName("cancelled_at")
  private Integer cancelledAt = null;
  @SerializedName("failed_at")
  private Integer failedAt = null;
  @SerializedName("completed_at")
  private Integer completedAt = null;
  @SerializedName("incomplete_details")
  private RunObjectIncompleteDetails incompleteDetails = null;
  @SerializedName("model")
  private String model = null;
  @SerializedName("instructions")
  private String instructions = null;
  @SerializedName("tools")
  private List<AssistantObjectToolsInner> tools = [];
  @SerializedName("file_ids")
  private List<String> fileIds = [];
  @SerializedName("metadata")
  private Object metadata = null;
  @SerializedName("usage")
  private RunCompletionUsage usage = null;
  @SerializedName("temperature")
  private BigDecimal temperature = null;
  @SerializedName("max_prompt_tokens")
  private Integer maxPromptTokens = null;
  @SerializedName("max_completion_tokens")
  private Integer maxCompletionTokens = null;
  @SerializedName("truncation_strategy")
  private TruncationObject truncationStrategy = null;
  @SerializedName("tool_choice")
  private AssistantsApiToolChoiceOption toolChoice = null;
  @SerializedName("response_format")
  private AssistantsApiResponseFormatOption responseFormat = null;

  /**
   * The identifier, which can be referenced in API endpoints.
   **/
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always `thread.run`.
   **/
  @ApiModelProperty(required = true, value = "The object type, which is always `thread.run`.")
  public _objectEnum getObject() {
    return _object;
  }
  public void setObject(_objectEnum _object) {
    this._object = _object;
  }

  /**
   * The Unix timestamp (in seconds) for when the run was created.
   **/
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run was created.")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
   **/
  @ApiModelProperty(required = true, value = "The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.")
  public String getThreadId() {
    return threadId;
  }
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  /**
   * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
   **/
  @ApiModelProperty(required = true, value = "The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.")
  public String getAssistantId() {
    return assistantId;
  }
  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  /**
   * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
   **/
  @ApiModelProperty(required = true, value = "The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public RunObjectRequiredAction getRequiredAction() {
    return requiredAction;
  }
  public void setRequiredAction(RunObjectRequiredAction requiredAction) {
    this.requiredAction = requiredAction;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public RunObjectLastError getLastError() {
    return lastError;
  }
  public void setLastError(RunObjectLastError lastError) {
    this.lastError = lastError;
  }

  /**
   * The Unix timestamp (in seconds) for when the run will expire.
   **/
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run will expire.")
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the run was started.
   **/
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run was started.")
  public Integer getStartedAt() {
    return startedAt;
  }
  public void setStartedAt(Integer startedAt) {
    this.startedAt = startedAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the run was cancelled.
   **/
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run was cancelled.")
  public Integer getCancelledAt() {
    return cancelledAt;
  }
  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the run failed.
   **/
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run failed.")
  public Integer getFailedAt() {
    return failedAt;
  }
  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the run was completed.
   **/
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run was completed.")
  public Integer getCompletedAt() {
    return completedAt;
  }
  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public RunObjectIncompleteDetails getIncompleteDetails() {
    return incompleteDetails;
  }
  public void setIncompleteDetails(RunObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
  }

  /**
   * The model that the [assistant](/docs/api-reference/assistants) used for this run.
   **/
  @ApiModelProperty(required = true, value = "The model that the [assistant](/docs/api-reference/assistants) used for this run.")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
   **/
  @ApiModelProperty(required = true, value = "The instructions that the [assistant](/docs/api-reference/assistants) used for this run.")
  public String getInstructions() {
    return instructions;
  }
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  /**
   * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
   **/
  @ApiModelProperty(required = true, value = "The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.")
  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }
  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  /**
   * The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
   **/
  @ApiModelProperty(required = true, value = "The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.")
  public List<String> getFileIds() {
    return fileIds;
  }
  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   **/
  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public RunCompletionUsage getUsage() {
    return usage;
  }
  public void setUsage(RunCompletionUsage usage) {
    this.usage = usage;
  }

  /**
   * The sampling temperature used for this run. If not set, defaults to 1.
   **/
  @ApiModelProperty(value = "The sampling temperature used for this run. If not set, defaults to 1.")
  public BigDecimal getTemperature() {
    return temperature;
  }
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  /**
   * The maximum number of prompt tokens specified to have been used over the course of the run. 
   * minimum: 256
   **/
  @ApiModelProperty(required = true, value = "The maximum number of prompt tokens specified to have been used over the course of the run. ")
  public Integer getMaxPromptTokens() {
    return maxPromptTokens;
  }
  public void setMaxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }

  /**
   * The maximum number of completion tokens specified to have been used over the course of the run. 
   * minimum: 256
   **/
  @ApiModelProperty(required = true, value = "The maximum number of completion tokens specified to have been used over the course of the run. ")
  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }
  public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public TruncationObject getTruncationStrategy() {
    return truncationStrategy;
  }
  public void setTruncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public AssistantsApiToolChoiceOption getToolChoice() {
    return toolChoice;
  }
  public void setToolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    return (this.id == null ? runObject.id == null : this.id.equals(runObject.id)) &&
        (this._object == null ? runObject._object == null : this._object.equals(runObject._object)) &&
        (this.createdAt == null ? runObject.createdAt == null : this.createdAt.equals(runObject.createdAt)) &&
        (this.threadId == null ? runObject.threadId == null : this.threadId.equals(runObject.threadId)) &&
        (this.assistantId == null ? runObject.assistantId == null : this.assistantId.equals(runObject.assistantId)) &&
        (this.status == null ? runObject.status == null : this.status.equals(runObject.status)) &&
        (this.requiredAction == null ? runObject.requiredAction == null : this.requiredAction.equals(runObject.requiredAction)) &&
        (this.lastError == null ? runObject.lastError == null : this.lastError.equals(runObject.lastError)) &&
        (this.expiresAt == null ? runObject.expiresAt == null : this.expiresAt.equals(runObject.expiresAt)) &&
        (this.startedAt == null ? runObject.startedAt == null : this.startedAt.equals(runObject.startedAt)) &&
        (this.cancelledAt == null ? runObject.cancelledAt == null : this.cancelledAt.equals(runObject.cancelledAt)) &&
        (this.failedAt == null ? runObject.failedAt == null : this.failedAt.equals(runObject.failedAt)) &&
        (this.completedAt == null ? runObject.completedAt == null : this.completedAt.equals(runObject.completedAt)) &&
        (this.incompleteDetails == null ? runObject.incompleteDetails == null : this.incompleteDetails.equals(runObject.incompleteDetails)) &&
        (this.model == null ? runObject.model == null : this.model.equals(runObject.model)) &&
        (this.instructions == null ? runObject.instructions == null : this.instructions.equals(runObject.instructions)) &&
        (this.tools == null ? runObject.tools == null : this.tools.equals(runObject.tools)) &&
        (this.fileIds == null ? runObject.fileIds == null : this.fileIds.equals(runObject.fileIds)) &&
        (this.metadata == null ? runObject.metadata == null : this.metadata.equals(runObject.metadata)) &&
        (this.usage == null ? runObject.usage == null : this.usage.equals(runObject.usage)) &&
        (this.temperature == null ? runObject.temperature == null : this.temperature.equals(runObject.temperature)) &&
        (this.maxPromptTokens == null ? runObject.maxPromptTokens == null : this.maxPromptTokens.equals(runObject.maxPromptTokens)) &&
        (this.maxCompletionTokens == null ? runObject.maxCompletionTokens == null : this.maxCompletionTokens.equals(runObject.maxCompletionTokens)) &&
        (this.truncationStrategy == null ? runObject.truncationStrategy == null : this.truncationStrategy.equals(runObject.truncationStrategy)) &&
        (this.toolChoice == null ? runObject.toolChoice == null : this.toolChoice.equals(runObject.toolChoice)) &&
        (this.responseFormat == null ? runObject.responseFormat == null : this.responseFormat.equals(runObject.responseFormat));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this._object == null ? 0: this._object.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.threadId == null ? 0: this.threadId.hashCode());
    result = 31 * result + (this.assistantId == null ? 0: this.assistantId.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.requiredAction == null ? 0: this.requiredAction.hashCode());
    result = 31 * result + (this.lastError == null ? 0: this.lastError.hashCode());
    result = 31 * result + (this.expiresAt == null ? 0: this.expiresAt.hashCode());
    result = 31 * result + (this.startedAt == null ? 0: this.startedAt.hashCode());
    result = 31 * result + (this.cancelledAt == null ? 0: this.cancelledAt.hashCode());
    result = 31 * result + (this.failedAt == null ? 0: this.failedAt.hashCode());
    result = 31 * result + (this.completedAt == null ? 0: this.completedAt.hashCode());
    result = 31 * result + (this.incompleteDetails == null ? 0: this.incompleteDetails.hashCode());
    result = 31 * result + (this.model == null ? 0: this.model.hashCode());
    result = 31 * result + (this.instructions == null ? 0: this.instructions.hashCode());
    result = 31 * result + (this.tools == null ? 0: this.tools.hashCode());
    result = 31 * result + (this.fileIds == null ? 0: this.fileIds.hashCode());
    result = 31 * result + (this.metadata == null ? 0: this.metadata.hashCode());
    result = 31 * result + (this.usage == null ? 0: this.usage.hashCode());
    result = 31 * result + (this.temperature == null ? 0: this.temperature.hashCode());
    result = 31 * result + (this.maxPromptTokens == null ? 0: this.maxPromptTokens.hashCode());
    result = 31 * result + (this.maxCompletionTokens == null ? 0: this.maxCompletionTokens.hashCode());
    result = 31 * result + (this.truncationStrategy == null ? 0: this.truncationStrategy.hashCode());
    result = 31 * result + (this.toolChoice == null ? 0: this.toolChoice.hashCode());
    result = 31 * result + (this.responseFormat == null ? 0: this.responseFormat.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunObject {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  _object: ").append(_object).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  threadId: ").append(threadId).append("\n");
    sb.append("  assistantId: ").append(assistantId).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  requiredAction: ").append(requiredAction).append("\n");
    sb.append("  lastError: ").append(lastError).append("\n");
    sb.append("  expiresAt: ").append(expiresAt).append("\n");
    sb.append("  startedAt: ").append(startedAt).append("\n");
    sb.append("  cancelledAt: ").append(cancelledAt).append("\n");
    sb.append("  failedAt: ").append(failedAt).append("\n");
    sb.append("  completedAt: ").append(completedAt).append("\n");
    sb.append("  incompleteDetails: ").append(incompleteDetails).append("\n");
    sb.append("  model: ").append(model).append("\n");
    sb.append("  instructions: ").append(instructions).append("\n");
    sb.append("  tools: ").append(tools).append("\n");
    sb.append("  fileIds: ").append(fileIds).append("\n");
    sb.append("  metadata: ").append(metadata).append("\n");
    sb.append("  usage: ").append(usage).append("\n");
    sb.append("  temperature: ").append(temperature).append("\n");
    sb.append("  maxPromptTokens: ").append(maxPromptTokens).append("\n");
    sb.append("  maxCompletionTokens: ").append(maxCompletionTokens).append("\n");
    sb.append("  truncationStrategy: ").append(truncationStrategy).append("\n");
    sb.append("  toolChoice: ").append(toolChoice).append("\n");
    sb.append("  responseFormat: ").append(responseFormat).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}