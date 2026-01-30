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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
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

THREAD_RUN(String.valueOf("thread.run"));


    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
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

QUEUED(String.valueOf("queued")), IN_PROGRESS(String.valueOf("in_progress")), REQUIRES_ACTION(String.valueOf("requires_action")), CANCELLING(String.valueOf("cancelling")), CANCELLED(String.valueOf("cancelled")), FAILED(String.valueOf("failed")), COMPLETED(String.valueOf("completed")), INCOMPLETE(String.valueOf("incomplete")), EXPIRED(String.valueOf("expired"));


    private String value;

    StatusEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
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
  * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
  */
  @ApiModelProperty(required = true, value = "The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.")

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
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")

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
  * The nucleus sampling value used for this run. If not set, defaults to 1.
  */
  @ApiModelProperty(value = "The nucleus sampling value used for this run. If not set, defaults to 1.")

  @Valid

  private BigDecimal topP;

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

 /**
  * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  */
  @ApiModelProperty(required = true, value = "Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.")

  private Boolean parallelToolCalls = true;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private AssistantsApiResponseFormatOption responseFormat;
 /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
  **/
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunObject id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The object type, which is always &#x60;thread.run&#x60;.
   * @return _object
  **/
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public RunObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the run was created.
   * @return createdAt
  **/
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public RunObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
   * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
   * @return threadId
  **/
  @JsonProperty("thread_id")
  @NotNull
  public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public RunObject threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

 /**
   * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
   * @return assistantId
  **/
  @JsonProperty("assistant_id")
  @NotNull
  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  public RunObject assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

 /**
   * The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;.
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public String getStatus() {
    if (status == null) {
      return null;
    }
    return status.value();
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public RunObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
   * Get requiredAction
   * @return requiredAction
  **/
  @JsonProperty("required_action")
  @NotNull
  public RunObjectRequiredAction getRequiredAction() {
    return requiredAction;
  }

  public void setRequiredAction(RunObjectRequiredAction requiredAction) {
    this.requiredAction = requiredAction;
  }

  public RunObject requiredAction(RunObjectRequiredAction requiredAction) {
    this.requiredAction = requiredAction;
    return this;
  }

 /**
   * Get lastError
   * @return lastError
  **/
  @JsonProperty("last_error")
  @NotNull
  public RunObjectLastError getLastError() {
    return lastError;
  }

  public void setLastError(RunObjectLastError lastError) {
    this.lastError = lastError;
  }

  public RunObject lastError(RunObjectLastError lastError) {
    this.lastError = lastError;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the run will expire.
   * @return expiresAt
  **/
  @JsonProperty("expires_at")
  @NotNull
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public RunObject expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the run was started.
   * @return startedAt
  **/
  @JsonProperty("started_at")
  @NotNull
  public Integer getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(Integer startedAt) {
    this.startedAt = startedAt;
  }

  public RunObject startedAt(Integer startedAt) {
    this.startedAt = startedAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the run was cancelled.
   * @return cancelledAt
  **/
  @JsonProperty("cancelled_at")
  @NotNull
  public Integer getCancelledAt() {
    return cancelledAt;
  }

  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  public RunObject cancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the run failed.
   * @return failedAt
  **/
  @JsonProperty("failed_at")
  @NotNull
  public Integer getFailedAt() {
    return failedAt;
  }

  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }

  public RunObject failedAt(Integer failedAt) {
    this.failedAt = failedAt;
    return this;
  }

 /**
   * The Unix timestamp (in seconds) for when the run was completed.
   * @return completedAt
  **/
  @JsonProperty("completed_at")
  @NotNull
  public Integer getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

  public RunObject completedAt(Integer completedAt) {
    this.completedAt = completedAt;
    return this;
  }

 /**
   * Get incompleteDetails
   * @return incompleteDetails
  **/
  @JsonProperty("incomplete_details")
  @NotNull
  public RunObjectIncompleteDetails getIncompleteDetails() {
    return incompleteDetails;
  }

  public void setIncompleteDetails(RunObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
  }

  public RunObject incompleteDetails(RunObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
    return this;
  }

 /**
   * The model that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return model
  **/
  @JsonProperty("model")
  @NotNull
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public RunObject model(String model) {
    this.model = model;
    return this;
  }

 /**
   * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return instructions
  **/
  @JsonProperty("instructions")
  @NotNull
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public RunObject instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

 /**
   * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return tools
  **/
  @JsonProperty("tools")
  @NotNull
 @Size(max=20)  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  public RunObject tools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public RunObject addToolsItem(AssistantObjectToolsInner toolsItem) {
    this.tools.add(toolsItem);
    return this;
  }

 /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
  **/
  @JsonProperty("metadata")
  @NotNull
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public RunObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * Get usage
   * @return usage
  **/
  @JsonProperty("usage")
  @NotNull
  public RunCompletionUsage getUsage() {
    return usage;
  }

  public void setUsage(RunCompletionUsage usage) {
    this.usage = usage;
  }

  public RunObject usage(RunCompletionUsage usage) {
    this.usage = usage;
    return this;
  }

 /**
   * The sampling temperature used for this run. If not set, defaults to 1.
   * @return temperature
  **/
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public RunObject temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

 /**
   * The nucleus sampling value used for this run. If not set, defaults to 1.
   * @return topP
  **/
  @JsonProperty("top_p")
  public BigDecimal getTopP() {
    return topP;
  }

  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  public RunObject topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

 /**
   * The maximum number of prompt tokens specified to have been used over the course of the run. 
   * minimum: 256
   * @return maxPromptTokens
  **/
  @JsonProperty("max_prompt_tokens")
  @NotNull
 @Min(256)  public Integer getMaxPromptTokens() {
    return maxPromptTokens;
  }

  public void setMaxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }

  public RunObject maxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
    return this;
  }

 /**
   * The maximum number of completion tokens specified to have been used over the course of the run. 
   * minimum: 256
   * @return maxCompletionTokens
  **/
  @JsonProperty("max_completion_tokens")
  @NotNull
 @Min(256)  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }

  public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  public RunObject maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
    return this;
  }

 /**
   * Get truncationStrategy
   * @return truncationStrategy
  **/
  @JsonProperty("truncation_strategy")
  @NotNull
  public TruncationObject getTruncationStrategy() {
    return truncationStrategy;
  }

  public void setTruncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
  }

  public RunObject truncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
    return this;
  }

 /**
   * Get toolChoice
   * @return toolChoice
  **/
  @JsonProperty("tool_choice")
  @NotNull
  public AssistantsApiToolChoiceOption getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

  public RunObject toolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

 /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   * @return parallelToolCalls
  **/
  @JsonProperty("parallel_tool_calls")
  @NotNull
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }

  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }

  public RunObject parallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
    return this;
  }

 /**
   * Get responseFormat
   * @return responseFormat
  **/
  @JsonProperty("response_format")
  @NotNull
  public AssistantsApiResponseFormatOption getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

