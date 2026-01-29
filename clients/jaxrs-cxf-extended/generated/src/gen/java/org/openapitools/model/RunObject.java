package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssistantObjectToolsInner;
import org.openapitools.model.AssistantsApiResponseFormatOption;
import org.openapitools.model.AssistantsApiToolChoiceOption;
import org.openapitools.model.RunCompletionUsage;
import org.openapitools.model.RunObjectIncompleteDetails;
import org.openapitools.model.RunObjectLastError;
import org.openapitools.model.RunObjectRequiredAction;
import org.openapitools.model.TruncationObject;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 */
@ApiModel(description="Represents an execution run on a [thread](/docs/api-reference/threads).")

public class RunObject  {
  
 /**
  * The identifier, which can be referenced in API endpoints.
  */
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  private String id;

public enum ObjectEnum {

    @JsonProperty("thread.run") THREAD_RUN(String.valueOf("thread.run"));

    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
        for (ObjectEnum b : ObjectEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The object type, which is always `thread.run`.
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `thread.run`.")
  private ObjectEnum _object;

 /**
  * The Unix timestamp (in seconds) for when the run was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run was created.")
  private Integer createdAt;

 /**
  * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
  */
  @ApiModelProperty(required = true, value = "The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.")
  private String threadId;

 /**
  * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
  */
  @ApiModelProperty(required = true, value = "The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.")
  private String assistantId;

public enum StatusEnum {

    @JsonProperty("queued") QUEUED(String.valueOf("queued")),
    @JsonProperty("in_progress") IN_PROGRESS(String.valueOf("in_progress")),
    @JsonProperty("requires_action") REQUIRES_ACTION(String.valueOf("requires_action")),
    @JsonProperty("cancelling") CANCELLING(String.valueOf("cancelling")),
    @JsonProperty("cancelled") CANCELLED(String.valueOf("cancelled")),
    @JsonProperty("failed") FAILED(String.valueOf("failed")),
    @JsonProperty("completed") COMPLETED(String.valueOf("completed")),
    @JsonProperty("expired") EXPIRED(String.valueOf("expired"));

    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
        for (StatusEnum b : StatusEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
  */
  @ApiModelProperty(required = true, value = "The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.")
  private StatusEnum status;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RunObjectRequiredAction requiredAction;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RunObjectLastError lastError;

 /**
  * The Unix timestamp (in seconds) for when the run will expire.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run will expire.")
  private Integer expiresAt;

 /**
  * The Unix timestamp (in seconds) for when the run was started.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run was started.")
  private Integer startedAt;

 /**
  * The Unix timestamp (in seconds) for when the run was cancelled.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run was cancelled.")
  private Integer cancelledAt;

 /**
  * The Unix timestamp (in seconds) for when the run failed.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run failed.")
  private Integer failedAt;

 /**
  * The Unix timestamp (in seconds) for when the run was completed.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run was completed.")
  private Integer completedAt;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RunObjectIncompleteDetails incompleteDetails;

 /**
  * The model that the [assistant](/docs/api-reference/assistants) used for this run.
  */
  @ApiModelProperty(required = true, value = "The model that the [assistant](/docs/api-reference/assistants) used for this run.")
  private String model;

 /**
  * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
  */
  @ApiModelProperty(required = true, value = "The instructions that the [assistant](/docs/api-reference/assistants) used for this run.")
  private String instructions;

 /**
  * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
  */
  @ApiModelProperty(required = true, value = "The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.")
  @Valid
  private List<AssistantObjectToolsInner> tools = new ArrayList<>();

 /**
  * The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
  */
  @ApiModelProperty(required = true, value = "The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.")
  private List<String> fileIds = new ArrayList<>();

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  */
  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
  private Object metadata;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RunCompletionUsage usage;

 /**
  * The sampling temperature used for this run. If not set, defaults to 1.
  */
  @ApiModelProperty(value = "The sampling temperature used for this run. If not set, defaults to 1.")
  @Valid
  private BigDecimal temperature;

 /**
  * The maximum number of prompt tokens specified to have been used over the course of the run. 
  */
  @ApiModelProperty(required = true, value = "The maximum number of prompt tokens specified to have been used over the course of the run. ")
  private Integer maxPromptTokens;

 /**
  * The maximum number of completion tokens specified to have been used over the course of the run. 
  */
  @ApiModelProperty(required = true, value = "The maximum number of completion tokens specified to have been used over the course of the run. ")
  private Integer maxCompletionTokens;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private TruncationObject truncationStrategy;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AssistantsApiToolChoiceOption toolChoice;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AssistantsApiResponseFormatOption responseFormat;
 /**
  * The identifier, which can be referenced in API endpoints.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public RunObject id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The object type, which is always &#x60;thread.run&#x60;.
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object == null ? null : _object.value();
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public RunObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the run was created.
  * @return createdAt
  */
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
 public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * Sets the <code>createdAt</code> property.
   */
  public RunObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
  * @return threadId
  */
  @JsonProperty("thread_id")
  @NotNull
  public String getThreadId() {
    return threadId;
  }

  /**
   * Sets the <code>threadId</code> property.
   */
 public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  /**
   * Sets the <code>threadId</code> property.
   */
  public RunObject threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

 /**
  * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
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
  public RunObject assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

 /**
  * The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    return status == null ? null : status.value();
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public RunObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
  * Get requiredAction
  * @return requiredAction
  */
  @JsonProperty("required_action")
  @NotNull
  public RunObjectRequiredAction getRequiredAction() {
    return requiredAction;
  }

  /**
   * Sets the <code>requiredAction</code> property.
   */
 public void setRequiredAction(RunObjectRequiredAction requiredAction) {
    this.requiredAction = requiredAction;
  }

  /**
   * Sets the <code>requiredAction</code> property.
   */
  public RunObject requiredAction(RunObjectRequiredAction requiredAction) {
    this.requiredAction = requiredAction;
    return this;
  }

 /**
  * Get lastError
  * @return lastError
  */
  @JsonProperty("last_error")
  @NotNull
  public RunObjectLastError getLastError() {
    return lastError;
  }

  /**
   * Sets the <code>lastError</code> property.
   */
 public void setLastError(RunObjectLastError lastError) {
    this.lastError = lastError;
  }

  /**
   * Sets the <code>lastError</code> property.
   */
  public RunObject lastError(RunObjectLastError lastError) {
    this.lastError = lastError;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the run will expire.
  * @return expiresAt
  */
  @JsonProperty("expires_at")
  @NotNull
  public Integer getExpiresAt() {
    return expiresAt;
  }

  /**
   * Sets the <code>expiresAt</code> property.
   */
 public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  /**
   * Sets the <code>expiresAt</code> property.
   */
  public RunObject expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the run was started.
  * @return startedAt
  */
  @JsonProperty("started_at")
  @NotNull
  public Integer getStartedAt() {
    return startedAt;
  }

  /**
   * Sets the <code>startedAt</code> property.
   */
 public void setStartedAt(Integer startedAt) {
    this.startedAt = startedAt;
  }

  /**
   * Sets the <code>startedAt</code> property.
   */
  public RunObject startedAt(Integer startedAt) {
    this.startedAt = startedAt;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the run was cancelled.
  * @return cancelledAt
  */
  @JsonProperty("cancelled_at")
  @NotNull
  public Integer getCancelledAt() {
    return cancelledAt;
  }

  /**
   * Sets the <code>cancelledAt</code> property.
   */
 public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  /**
   * Sets the <code>cancelledAt</code> property.
   */
  public RunObject cancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the run failed.
  * @return failedAt
  */
  @JsonProperty("failed_at")
  @NotNull
  public Integer getFailedAt() {
    return failedAt;
  }

  /**
   * Sets the <code>failedAt</code> property.
   */
 public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }

  /**
   * Sets the <code>failedAt</code> property.
   */
  public RunObject failedAt(Integer failedAt) {
    this.failedAt = failedAt;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the run was completed.
  * @return completedAt
  */
  @JsonProperty("completed_at")
  @NotNull
  public Integer getCompletedAt() {
    return completedAt;
  }

  /**
   * Sets the <code>completedAt</code> property.
   */
 public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

  /**
   * Sets the <code>completedAt</code> property.
   */
  public RunObject completedAt(Integer completedAt) {
    this.completedAt = completedAt;
    return this;
  }

 /**
  * Get incompleteDetails
  * @return incompleteDetails
  */
  @JsonProperty("incomplete_details")
  @NotNull
  public RunObjectIncompleteDetails getIncompleteDetails() {
    return incompleteDetails;
  }

  /**
   * Sets the <code>incompleteDetails</code> property.
   */
 public void setIncompleteDetails(RunObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
  }

  /**
   * Sets the <code>incompleteDetails</code> property.
   */
  public RunObject incompleteDetails(RunObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
    return this;
  }

 /**
  * The model that the [assistant](/docs/api-reference/assistants) used for this run.
  * @return model
  */
  @JsonProperty("model")
  @NotNull
  public String getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(String model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
  public RunObject model(String model) {
    this.model = model;
    return this;
  }

 /**
  * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
  * @return instructions
  */
  @JsonProperty("instructions")
  @NotNull
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
  public RunObject instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

 /**
  * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
  * @return tools
  */
  @JsonProperty("tools")
  @NotNull
 @Size(max=20)  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }

  /**
   * Sets the <code>tools</code> property.
   */
 public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  /**
   * Sets the <code>tools</code> property.
   */
  public RunObject tools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  /**
   * Adds a new item to the <code>tools</code> list.
   */
  public RunObject addToolsItem(AssistantObjectToolsInner toolsItem) {
    this.tools.add(toolsItem);
    return this;
  }

 /**
  * The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
  * @return fileIds
  */
  @JsonProperty("file_ids")
  @NotNull
  public List<String> getFileIds() {
    return fileIds;
  }

  /**
   * Sets the <code>fileIds</code> property.
   */
 public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  /**
   * Sets the <code>fileIds</code> property.
   */
  public RunObject fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  /**
   * Adds a new item to the <code>fileIds</code> list.
   */
  public RunObject addFileIdsItem(String fileIdsItem) {
    this.fileIds.add(fileIdsItem);
    return this;
  }

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  * @return metadata
  */
  @JsonProperty("metadata")
  @NotNull
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
  public RunObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
  * Get usage
  * @return usage
  */
  @JsonProperty("usage")
  @NotNull
  public RunCompletionUsage getUsage() {
    return usage;
  }

  /**
   * Sets the <code>usage</code> property.
   */
 public void setUsage(RunCompletionUsage usage) {
    this.usage = usage;
  }

  /**
   * Sets the <code>usage</code> property.
   */
  public RunObject usage(RunCompletionUsage usage) {
    this.usage = usage;
    return this;
  }

 /**
  * The sampling temperature used for this run. If not set, defaults to 1.
  * @return temperature
  */
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
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
  public RunObject temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

 /**
  * The maximum number of prompt tokens specified to have been used over the course of the run. 
  * minimum: 256
  * @return maxPromptTokens
  */
  @JsonProperty("max_prompt_tokens")
  @NotNull
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
  public RunObject maxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
    return this;
  }

 /**
  * The maximum number of completion tokens specified to have been used over the course of the run. 
  * minimum: 256
  * @return maxCompletionTokens
  */
  @JsonProperty("max_completion_tokens")
  @NotNull
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
  public RunObject maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
    return this;
  }

 /**
  * Get truncationStrategy
  * @return truncationStrategy
  */
  @JsonProperty("truncation_strategy")
  @NotNull
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
  public RunObject truncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
    return this;
  }

 /**
  * Get toolChoice
  * @return toolChoice
  */
  @JsonProperty("tool_choice")
  @NotNull
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
  public RunObject toolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

 /**
  * Get responseFormat
  * @return responseFormat
  */
  @JsonProperty("response_format")
  @NotNull
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
  public RunObject responseFormat(AssistantsApiResponseFormatOption responseFormat) {
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
        Objects.equals(this.fileIds, runObject.fileIds) &&
        Objects.equals(this.metadata, runObject.metadata) &&
        Objects.equals(this.usage, runObject.usage) &&
        Objects.equals(this.temperature, runObject.temperature) &&
        Objects.equals(this.maxPromptTokens, runObject.maxPromptTokens) &&
        Objects.equals(this.maxCompletionTokens, runObject.maxCompletionTokens) &&
        Objects.equals(this.truncationStrategy, runObject.truncationStrategy) &&
        Objects.equals(this.toolChoice, runObject.toolChoice) &&
        Objects.equals(this.responseFormat, runObject.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, threadId, assistantId, status, requiredAction, lastError, expiresAt, startedAt, cancelledAt, failedAt, completedAt, incompleteDetails, model, instructions, tools, fileIds, metadata, usage, temperature, maxPromptTokens, maxCompletionTokens, truncationStrategy, toolChoice, responseFormat);
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
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    maxPromptTokens: ").append(toIndentedString(maxPromptTokens)).append("\n");
    sb.append("    maxCompletionTokens: ").append(toIndentedString(maxCompletionTokens)).append("\n");
    sb.append("    truncationStrategy: ").append(toIndentedString(truncationStrategy)).append("\n");
    sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
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

