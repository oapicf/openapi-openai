package apimodels;

import apimodels.AssistantObjectToolsInner;
import apimodels.AssistantsApiResponseFormatOption;
import apimodels.AssistantsApiToolChoiceOption;
import apimodels.RunCompletionUsage;
import apimodels.RunObjectIncompleteDetails;
import apimodels.RunObjectLastError;
import apimodels.RunObjectRequiredAction;
import apimodels.TruncationObject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T10:45:05.350526304Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunObject   {
  @JsonProperty("id")
  @NotNull

  private String id;

  /**
   * The object type, which is always `thread.run`.
   */
  public enum ObjectEnum {
    THREAD_RUN("thread.run");

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
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

  @JsonProperty("object")
  @NotNull

  private ObjectEnum _object;

  @JsonProperty("created_at")
  @NotNull

  private Integer createdAt;

  @JsonProperty("thread_id")
  @NotNull

  private String threadId;

  @JsonProperty("assistant_id")
  @NotNull

  private String assistantId;

  /**
   * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
   */
  public enum StatusEnum {
    QUEUED("queued"),
    
    IN_PROGRESS("in_progress"),
    
    REQUIRES_ACTION("requires_action"),
    
    CANCELLING("cancelling"),
    
    CANCELLED("cancelled"),
    
    FAILED("failed"),
    
    COMPLETED("completed"),
    
    EXPIRED("expired");

    private final String value;

    StatusEnum(String value) {
      this.value = value;
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

  @JsonProperty("status")
  @NotNull

  private StatusEnum status;

  @JsonProperty("required_action")
  @NotNull
@Valid

  private RunObjectRequiredAction requiredAction;

  @JsonProperty("last_error")
  @NotNull
@Valid

  private RunObjectLastError lastError;

  @JsonProperty("expires_at")
  @NotNull

  private Integer expiresAt;

  @JsonProperty("started_at")
  @NotNull

  private Integer startedAt;

  @JsonProperty("cancelled_at")
  @NotNull

  private Integer cancelledAt;

  @JsonProperty("failed_at")
  @NotNull

  private Integer failedAt;

  @JsonProperty("completed_at")
  @NotNull

  private Integer completedAt;

  @JsonProperty("incomplete_details")
  @NotNull
@Valid

  private RunObjectIncompleteDetails incompleteDetails;

  @JsonProperty("model")
  @NotNull

  private String model;

  @JsonProperty("instructions")
  @NotNull

  private String instructions;

  @JsonProperty("tools")
  @NotNull
@Size(max=20)
@Valid

  private List<AssistantObjectToolsInner> tools = new ArrayList<>();

  @JsonProperty("file_ids")
  @NotNull

  private List<String> fileIds = new ArrayList<>();

  @JsonProperty("metadata")
  @NotNull

  private Object metadata;

  @JsonProperty("usage")
  @NotNull
@Valid

  private RunCompletionUsage usage;

  @JsonProperty("temperature")
  @Valid

  private BigDecimal temperature;

  @JsonProperty("max_prompt_tokens")
  @NotNull
@Min(256)

  private Integer maxPromptTokens;

  @JsonProperty("max_completion_tokens")
  @NotNull
@Min(256)

  private Integer maxCompletionTokens;

  @JsonProperty("truncation_strategy")
  @NotNull
@Valid

  private TruncationObject truncationStrategy;

  @JsonProperty("tool_choice")
  @NotNull
@Valid

  private AssistantsApiToolChoiceOption toolChoice;

  @JsonProperty("response_format")
  @NotNull
@Valid

  private AssistantsApiResponseFormatOption responseFormat;

  public RunObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always `thread.run`.
   * @return _object
  **/
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public RunObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run was created.
   * @return createdAt
  **/
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public RunObject threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

   /**
   * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
   * @return threadId
  **/
  public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public RunObject assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

   /**
   * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
   * @return assistantId
  **/
  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  public RunObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public RunObject requiredAction(RunObjectRequiredAction requiredAction) {
    this.requiredAction = requiredAction;
    return this;
  }

   /**
   * Get requiredAction
   * @return requiredAction
  **/
  public RunObjectRequiredAction getRequiredAction() {
    return requiredAction;
  }

  public void setRequiredAction(RunObjectRequiredAction requiredAction) {
    this.requiredAction = requiredAction;
  }

  public RunObject lastError(RunObjectLastError lastError) {
    this.lastError = lastError;
    return this;
  }

   /**
   * Get lastError
   * @return lastError
  **/
  public RunObjectLastError getLastError() {
    return lastError;
  }

  public void setLastError(RunObjectLastError lastError) {
    this.lastError = lastError;
  }

  public RunObject expiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run will expire.
   * @return expiresAt
  **/
  public Integer getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

  public RunObject startedAt(Integer startedAt) {
    this.startedAt = startedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run was started.
   * @return startedAt
  **/
  public Integer getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(Integer startedAt) {
    this.startedAt = startedAt;
  }

  public RunObject cancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run was cancelled.
   * @return cancelledAt
  **/
  public Integer getCancelledAt() {
    return cancelledAt;
  }

  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  public RunObject failedAt(Integer failedAt) {
    this.failedAt = failedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run failed.
   * @return failedAt
  **/
  public Integer getFailedAt() {
    return failedAt;
  }

  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }

  public RunObject completedAt(Integer completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run was completed.
   * @return completedAt
  **/
  public Integer getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

  public RunObject incompleteDetails(RunObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
    return this;
  }

   /**
   * Get incompleteDetails
   * @return incompleteDetails
  **/
  public RunObjectIncompleteDetails getIncompleteDetails() {
    return incompleteDetails;
  }

  public void setIncompleteDetails(RunObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
  }

  public RunObject model(String model) {
    this.model = model;
    return this;
  }

   /**
   * The model that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return model
  **/
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public RunObject instructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

   /**
   * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return instructions
  **/
  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public RunObject tools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
    return this;
  }

  public RunObject addToolsItem(AssistantObjectToolsInner toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

   /**
   * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return tools
  **/
  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }

  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

  public RunObject fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public RunObject addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

   /**
   * The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
   * @return fileIds
  **/
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public RunObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
  **/
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public RunObject usage(RunCompletionUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
  public RunCompletionUsage getUsage() {
    return usage;
  }

  public void setUsage(RunCompletionUsage usage) {
    this.usage = usage;
  }

  public RunObject temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * The sampling temperature used for this run. If not set, defaults to 1.
   * @return temperature
  **/
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public RunObject maxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
    return this;
  }

   /**
   * The maximum number of prompt tokens specified to have been used over the course of the run. 
   * minimum: 256
   * @return maxPromptTokens
  **/
  public Integer getMaxPromptTokens() {
    return maxPromptTokens;
  }

  public void setMaxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }

  public RunObject maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
    return this;
  }

   /**
   * The maximum number of completion tokens specified to have been used over the course of the run. 
   * minimum: 256
   * @return maxCompletionTokens
  **/
  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }

  public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  public RunObject truncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
    return this;
  }

   /**
   * Get truncationStrategy
   * @return truncationStrategy
  **/
  public TruncationObject getTruncationStrategy() {
    return truncationStrategy;
  }

  public void setTruncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
  }

  public RunObject toolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

   /**
   * Get toolChoice
   * @return toolChoice
  **/
  public AssistantsApiToolChoiceOption getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

  public RunObject responseFormat(AssistantsApiResponseFormatOption responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * Get responseFormat
   * @return responseFormat
  **/
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
    return Objects.equals(id, runObject.id) &&
        Objects.equals(_object, runObject._object) &&
        Objects.equals(createdAt, runObject.createdAt) &&
        Objects.equals(threadId, runObject.threadId) &&
        Objects.equals(assistantId, runObject.assistantId) &&
        Objects.equals(status, runObject.status) &&
        Objects.equals(requiredAction, runObject.requiredAction) &&
        Objects.equals(lastError, runObject.lastError) &&
        Objects.equals(expiresAt, runObject.expiresAt) &&
        Objects.equals(startedAt, runObject.startedAt) &&
        Objects.equals(cancelledAt, runObject.cancelledAt) &&
        Objects.equals(failedAt, runObject.failedAt) &&
        Objects.equals(completedAt, runObject.completedAt) &&
        Objects.equals(incompleteDetails, runObject.incompleteDetails) &&
        Objects.equals(model, runObject.model) &&
        Objects.equals(instructions, runObject.instructions) &&
        Objects.equals(tools, runObject.tools) &&
        Objects.equals(fileIds, runObject.fileIds) &&
        Objects.equals(metadata, runObject.metadata) &&
        Objects.equals(usage, runObject.usage) &&
        Objects.equals(temperature, runObject.temperature) &&
        Objects.equals(maxPromptTokens, runObject.maxPromptTokens) &&
        Objects.equals(maxCompletionTokens, runObject.maxCompletionTokens) &&
        Objects.equals(truncationStrategy, runObject.truncationStrategy) &&
        Objects.equals(toolChoice, runObject.toolChoice) &&
        Objects.equals(responseFormat, runObject.responseFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, threadId, assistantId, status, requiredAction, lastError, expiresAt, startedAt, cancelledAt, failedAt, completedAt, incompleteDetails, model, instructions, tools, fileIds, metadata, usage, temperature, maxPromptTokens, maxCompletionTokens, truncationStrategy, toolChoice, responseFormat);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

