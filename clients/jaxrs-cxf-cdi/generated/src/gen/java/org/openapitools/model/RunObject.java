package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Represents an execution run on a [thread](/docs/api-reference/threads).")
public class RunObject   {
  
  private String id;


public enum ObjectEnum {

    @JsonProperty("thread.run") THREAD_RUN(String.valueOf("thread.run"));


    private String value;

    ObjectEnum(String v) {
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

  private ObjectEnum _object;

  private Integer createdAt;

  private String threadId;

  private String assistantId;


public enum StatusEnum {

    @JsonProperty("queued") QUEUED(String.valueOf("queued")), @JsonProperty("in_progress") IN_PROGRESS(String.valueOf("in_progress")), @JsonProperty("requires_action") REQUIRES_ACTION(String.valueOf("requires_action")), @JsonProperty("cancelling") CANCELLING(String.valueOf("cancelling")), @JsonProperty("cancelled") CANCELLED(String.valueOf("cancelled")), @JsonProperty("failed") FAILED(String.valueOf("failed")), @JsonProperty("completed") COMPLETED(String.valueOf("completed")), @JsonProperty("incomplete") INCOMPLETE(String.valueOf("incomplete")), @JsonProperty("expired") EXPIRED(String.valueOf("expired"));


    private String value;

    StatusEnum(String v) {
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

  private StatusEnum status;

  private RunObjectRequiredAction requiredAction;

  private RunObjectLastError lastError;

  private Integer expiresAt;

  private Integer startedAt;

  private Integer cancelledAt;

  private Integer failedAt;

  private Integer completedAt;

  private RunObjectIncompleteDetails incompleteDetails;

  private String model;

  private String instructions;

  private List<AssistantObjectToolsInner> tools = new ArrayList<>();

  private Object metadata;

  private RunCompletionUsage usage;

  private BigDecimal temperature;

  private BigDecimal topP;

  private Integer maxPromptTokens;

  private Integer maxCompletionTokens;

  private TruncationObject truncationStrategy;

  private AssistantsApiToolChoiceOption toolChoice;

  private Boolean parallelToolCalls = true;

  private AssistantsApiResponseFormatOption responseFormat;

  /**
   * The identifier, which can be referenced in API endpoints.
   **/
  public RunObject id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier, which can be referenced in API endpoints.")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The object type, which is always &#x60;thread.run&#x60;.
   **/
  public RunObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always `thread.run`.")
  @JsonProperty("object")
  @NotNull
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  /**
   * The Unix timestamp (in seconds) for when the run was created.
   **/
  public RunObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run was created.")
  @JsonProperty("created_at")
  @NotNull
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
   **/
  public RunObject threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.")
  @JsonProperty("thread_id")
  @NotNull
  public String getThreadId() {
    return threadId;
  }
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }


  /**
   * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
   **/
  public RunObject assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.")
  @JsonProperty("assistant_id")
  @NotNull
  public String getAssistantId() {
    return assistantId;
  }
  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }


  /**
   * The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;.
   **/
  public RunObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.")
  @JsonProperty("status")
  @NotNull
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   **/
  public RunObject requiredAction(RunObjectRequiredAction requiredAction) {
    this.requiredAction = requiredAction;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("required_action")
  @NotNull
  public RunObjectRequiredAction getRequiredAction() {
    return requiredAction;
  }
  public void setRequiredAction(RunObjectRequiredAction requiredAction) {
    this.requiredAction = requiredAction;
  }


  /**
   **/
  public RunObject lastError(RunObjectLastError lastError) {
    this.lastError = lastError;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("last_error")
  @NotNull
  public RunObjectLastError getLastError() {
    return lastError;
  }
  public void setLastError(RunObjectLastError lastError) {
    this.lastError = lastError;
  }


  /**
   * The Unix timestamp (in seconds) for when the run will expire.
   **/
  public RunObject expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run will expire.")
  @JsonProperty("expires_at")
  @NotNull
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }


  /**
   * The Unix timestamp (in seconds) for when the run was started.
   **/
  public RunObject startedAt(Integer startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run was started.")
  @JsonProperty("started_at")
  @NotNull
  public Integer getStartedAt() {
    return startedAt;
  }
  public void setStartedAt(Integer startedAt) {
    this.startedAt = startedAt;
  }


  /**
   * The Unix timestamp (in seconds) for when the run was cancelled.
   **/
  public RunObject cancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run was cancelled.")
  @JsonProperty("cancelled_at")
  @NotNull
  public Integer getCancelledAt() {
    return cancelledAt;
  }
  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }


  /**
   * The Unix timestamp (in seconds) for when the run failed.
   **/
  public RunObject failedAt(Integer failedAt) {
    this.failedAt = failedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run failed.")
  @JsonProperty("failed_at")
  @NotNull
  public Integer getFailedAt() {
    return failedAt;
  }
  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }


  /**
   * The Unix timestamp (in seconds) for when the run was completed.
   **/
  public RunObject completedAt(Integer completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run was completed.")
  @JsonProperty("completed_at")
  @NotNull
  public Integer getCompletedAt() {
    return completedAt;
  }
  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }


  /**
   **/
  public RunObject incompleteDetails(RunObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("incomplete_details")
  @NotNull
  public RunObjectIncompleteDetails getIncompleteDetails() {
    return incompleteDetails;
  }
  public void setIncompleteDetails(RunObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
  }


  /**
   * The model that the [assistant](/docs/api-reference/assistants) used for this run.
   **/
  public RunObject model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The model that the [assistant](/docs/api-reference/assistants) used for this run.")
  @JsonProperty("model")
  @NotNull
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }


  /**
   * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
   **/
  public RunObject instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The instructions that the [assistant](/docs/api-reference/assistants) used for this run.")
  @JsonProperty("instructions")
  @NotNull
  public String getInstructions() {
    return instructions;
  }
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }


  /**
   * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
   **/
  public RunObject tools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.")
  @JsonProperty("tools")
  @NotNull
 @Size(max=20)  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }
  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  public RunObject addToolsItem(AssistantObjectToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }


  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   **/
  public RunObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  @JsonProperty("metadata")
  @NotNull
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  /**
   **/
  public RunObject usage(RunCompletionUsage usage) {
    this.usage = usage;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("usage")
  @NotNull
  public RunCompletionUsage getUsage() {
    return usage;
  }
  public void setUsage(RunCompletionUsage usage) {
    this.usage = usage;
  }


  /**
   * The sampling temperature used for this run. If not set, defaults to 1.
   **/
  public RunObject temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  
  @ApiModelProperty(value = "The sampling temperature used for this run. If not set, defaults to 1.")
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }


  /**
   * The nucleus sampling value used for this run. If not set, defaults to 1.
   **/
  public RunObject topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

  
  @ApiModelProperty(value = "The nucleus sampling value used for this run. If not set, defaults to 1.")
  @JsonProperty("top_p")
  public BigDecimal getTopP() {
    return topP;
  }
  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }


  /**
   * The maximum number of prompt tokens specified to have been used over the course of the run. 
   * minimum: 256
   **/
  public RunObject maxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The maximum number of prompt tokens specified to have been used over the course of the run. ")
  @JsonProperty("max_prompt_tokens")
  @NotNull
 @Min(256)  public Integer getMaxPromptTokens() {
    return maxPromptTokens;
  }
  public void setMaxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }


  /**
   * The maximum number of completion tokens specified to have been used over the course of the run. 
   * minimum: 256
   **/
  public RunObject maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The maximum number of completion tokens specified to have been used over the course of the run. ")
  @JsonProperty("max_completion_tokens")
  @NotNull
 @Min(256)  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }
  public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }


  /**
   **/
  public RunObject truncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("truncation_strategy")
  @NotNull
  public TruncationObject getTruncationStrategy() {
    return truncationStrategy;
  }
  public void setTruncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
  }


  /**
   **/
  public RunObject toolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("tool_choice")
  @NotNull
  public AssistantsApiToolChoiceOption getToolChoice() {
    return toolChoice;
  }
  public void setToolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }


  /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   **/
  public RunObject parallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.")
  @JsonProperty("parallel_tool_calls")
  @NotNull
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }
  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }


  /**
   **/
  public RunObject responseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("response_format")
  @NotNull
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

