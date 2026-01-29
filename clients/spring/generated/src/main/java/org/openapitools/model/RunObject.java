package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 */

@Schema(name = "RunObject", description = "Represents an execution run on a [thread](/docs/api-reference/threads).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T10:48:36.973220935Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunObject {

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private ObjectEnum _object;

  private Integer createdAt;

  private String threadId;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private StatusEnum status;

  private JsonNullable<RunObjectRequiredAction> requiredAction = JsonNullable.<RunObjectRequiredAction>undefined();

  private JsonNullable<RunObjectLastError> lastError = JsonNullable.<RunObjectLastError>undefined();

  private JsonNullable<Integer> expiresAt = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> startedAt = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> cancelledAt = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> failedAt = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> completedAt = JsonNullable.<Integer>undefined();

  private JsonNullable<RunObjectIncompleteDetails> incompleteDetails = JsonNullable.<RunObjectIncompleteDetails>undefined();

  private String model;

  private String instructions;

  @Valid
  private List<AssistantObjectToolsInner> tools = new ArrayList<>();

  @Valid
  private List<String> fileIds = new ArrayList<>();

  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  private JsonNullable<RunCompletionUsage> usage = JsonNullable.<RunCompletionUsage>undefined();

  private JsonNullable<BigDecimal> temperature = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<@Min(value = 256) Integer> maxPromptTokens = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = 256) Integer> maxCompletionTokens = JsonNullable.<Integer>undefined();

  private TruncationObject truncationStrategy;

  private AssistantsApiToolChoiceOption toolChoice;

  private AssistantsApiResponseFormatOption responseFormat;

  public RunObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RunObject(String id, ObjectEnum _object, Integer createdAt, String threadId, String assistantId, StatusEnum status, RunObjectRequiredAction requiredAction, RunObjectLastError lastError, Integer expiresAt, Integer startedAt, Integer cancelledAt, Integer failedAt, Integer completedAt, RunObjectIncompleteDetails incompleteDetails, String model, String instructions, List<AssistantObjectToolsInner> tools, List<String> fileIds, Object metadata, RunCompletionUsage usage, Integer maxPromptTokens, Integer maxCompletionTokens, TruncationObject truncationStrategy, AssistantsApiToolChoiceOption toolChoice, AssistantsApiResponseFormatOption responseFormat) {
    this.id = id;
    this._object = _object;
    this.createdAt = createdAt;
    this.threadId = threadId;
    this.assistantId = assistantId;
    this.status = status;
    this.requiredAction = JsonNullable.of(requiredAction);
    this.lastError = JsonNullable.of(lastError);
    this.expiresAt = JsonNullable.of(expiresAt);
    this.startedAt = JsonNullable.of(startedAt);
    this.cancelledAt = JsonNullable.of(cancelledAt);
    this.failedAt = JsonNullable.of(failedAt);
    this.completedAt = JsonNullable.of(completedAt);
    this.incompleteDetails = JsonNullable.of(incompleteDetails);
    this.model = model;
    this.instructions = instructions;
    this.tools = tools;
    this.fileIds = fileIds;
    this.metadata = JsonNullable.of(metadata);
    this.usage = JsonNullable.of(usage);
    this.maxPromptTokens = JsonNullable.of(maxPromptTokens);
    this.maxCompletionTokens = JsonNullable.of(maxCompletionTokens);
    this.truncationStrategy = truncationStrategy;
    this.toolChoice = toolChoice;
    this.responseFormat = responseFormat;
  }

  public RunObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier, which can be referenced in API endpoints.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "The identifier, which can be referenced in API endpoints.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   */
  @NotNull 
  @Schema(name = "object", description = "The object type, which is always `thread.run`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
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
   */
  @NotNull 
  @Schema(name = "created_at", description = "The Unix timestamp (in seconds) for when the run was created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
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
   */
  @NotNull 
  @Schema(name = "thread_id", description = "The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("thread_id")
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
   */
  @NotNull 
  @Schema(name = "assistant_id", description = "The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("assistant_id")
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
   */
  @NotNull 
  @Schema(name = "status", description = "The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public RunObject requiredAction(RunObjectRequiredAction requiredAction) {
    this.requiredAction = JsonNullable.of(requiredAction);
    return this;
  }

  /**
   * Get requiredAction
   * @return requiredAction
   */
  @NotNull @Valid 
  @Schema(name = "required_action", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("required_action")
  public JsonNullable<RunObjectRequiredAction> getRequiredAction() {
    return requiredAction;
  }

  public void setRequiredAction(JsonNullable<RunObjectRequiredAction> requiredAction) {
    this.requiredAction = requiredAction;
  }

  public RunObject lastError(RunObjectLastError lastError) {
    this.lastError = JsonNullable.of(lastError);
    return this;
  }

  /**
   * Get lastError
   * @return lastError
   */
  @NotNull @Valid 
  @Schema(name = "last_error", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("last_error")
  public JsonNullable<RunObjectLastError> getLastError() {
    return lastError;
  }

  public void setLastError(JsonNullable<RunObjectLastError> lastError) {
    this.lastError = lastError;
  }

  public RunObject expiresAt(Integer expiresAt) {
    this.expiresAt = JsonNullable.of(expiresAt);
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the run will expire.
   * @return expiresAt
   */
  @NotNull 
  @Schema(name = "expires_at", description = "The Unix timestamp (in seconds) for when the run will expire.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expires_at")
  public JsonNullable<Integer> getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(JsonNullable<Integer> expiresAt) {
    this.expiresAt = expiresAt;
  }

  public RunObject startedAt(Integer startedAt) {
    this.startedAt = JsonNullable.of(startedAt);
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the run was started.
   * @return startedAt
   */
  @NotNull 
  @Schema(name = "started_at", description = "The Unix timestamp (in seconds) for when the run was started.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("started_at")
  public JsonNullable<Integer> getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(JsonNullable<Integer> startedAt) {
    this.startedAt = startedAt;
  }

  public RunObject cancelledAt(Integer cancelledAt) {
    this.cancelledAt = JsonNullable.of(cancelledAt);
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the run was cancelled.
   * @return cancelledAt
   */
  @NotNull 
  @Schema(name = "cancelled_at", description = "The Unix timestamp (in seconds) for when the run was cancelled.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("cancelled_at")
  public JsonNullable<Integer> getCancelledAt() {
    return cancelledAt;
  }

  public void setCancelledAt(JsonNullable<Integer> cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  public RunObject failedAt(Integer failedAt) {
    this.failedAt = JsonNullable.of(failedAt);
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the run failed.
   * @return failedAt
   */
  @NotNull 
  @Schema(name = "failed_at", description = "The Unix timestamp (in seconds) for when the run failed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("failed_at")
  public JsonNullable<Integer> getFailedAt() {
    return failedAt;
  }

  public void setFailedAt(JsonNullable<Integer> failedAt) {
    this.failedAt = failedAt;
  }

  public RunObject completedAt(Integer completedAt) {
    this.completedAt = JsonNullable.of(completedAt);
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the run was completed.
   * @return completedAt
   */
  @NotNull 
  @Schema(name = "completed_at", description = "The Unix timestamp (in seconds) for when the run was completed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("completed_at")
  public JsonNullable<Integer> getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(JsonNullable<Integer> completedAt) {
    this.completedAt = completedAt;
  }

  public RunObject incompleteDetails(RunObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = JsonNullable.of(incompleteDetails);
    return this;
  }

  /**
   * Get incompleteDetails
   * @return incompleteDetails
   */
  @NotNull @Valid 
  @Schema(name = "incomplete_details", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("incomplete_details")
  public JsonNullable<RunObjectIncompleteDetails> getIncompleteDetails() {
    return incompleteDetails;
  }

  public void setIncompleteDetails(JsonNullable<RunObjectIncompleteDetails> incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
  }

  public RunObject model(String model) {
    this.model = model;
    return this;
  }

  /**
   * The model that the [assistant](/docs/api-reference/assistants) used for this run.
   * @return model
   */
  @NotNull 
  @Schema(name = "model", description = "The model that the [assistant](/docs/api-reference/assistants) used for this run.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("model")
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
   */
  @NotNull 
  @Schema(name = "instructions", description = "The instructions that the [assistant](/docs/api-reference/assistants) used for this run.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("instructions")
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
   */
  @NotNull @Valid @Size(max = 20) 
  @Schema(name = "tools", description = "The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tools")
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
   */
  @NotNull 
  @Schema(name = "file_ids", description = "The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("file_ids")
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public RunObject metadata(Object metadata) {
    this.metadata = JsonNullable.of(metadata);
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
   */
  @NotNull 
  @Schema(name = "metadata", description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("metadata")
  public JsonNullable<Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public RunObject usage(RunCompletionUsage usage) {
    this.usage = JsonNullable.of(usage);
    return this;
  }

  /**
   * Get usage
   * @return usage
   */
  @NotNull @Valid 
  @Schema(name = "usage", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("usage")
  public JsonNullable<RunCompletionUsage> getUsage() {
    return usage;
  }

  public void setUsage(JsonNullable<RunCompletionUsage> usage) {
    this.usage = usage;
  }

  public RunObject temperature(BigDecimal temperature) {
    this.temperature = JsonNullable.of(temperature);
    return this;
  }

  /**
   * The sampling temperature used for this run. If not set, defaults to 1.
   * @return temperature
   */
  @Valid 
  @Schema(name = "temperature", description = "The sampling temperature used for this run. If not set, defaults to 1.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temperature")
  public JsonNullable<BigDecimal> getTemperature() {
    return temperature;
  }

  public void setTemperature(JsonNullable<BigDecimal> temperature) {
    this.temperature = temperature;
  }

  public RunObject maxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = JsonNullable.of(maxPromptTokens);
    return this;
  }

  /**
   * The maximum number of prompt tokens specified to have been used over the course of the run. 
   * minimum: 256
   * @return maxPromptTokens
   */
  @NotNull @Min(value = 256) 
  @Schema(name = "max_prompt_tokens", description = "The maximum number of prompt tokens specified to have been used over the course of the run. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_prompt_tokens")
  public JsonNullable<@Min(value = 256) Integer> getMaxPromptTokens() {
    return maxPromptTokens;
  }

  public void setMaxPromptTokens(JsonNullable<Integer> maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }

  public RunObject maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = JsonNullable.of(maxCompletionTokens);
    return this;
  }

  /**
   * The maximum number of completion tokens specified to have been used over the course of the run. 
   * minimum: 256
   * @return maxCompletionTokens
   */
  @NotNull @Min(value = 256) 
  @Schema(name = "max_completion_tokens", description = "The maximum number of completion tokens specified to have been used over the course of the run. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_completion_tokens")
  public JsonNullable<@Min(value = 256) Integer> getMaxCompletionTokens() {
    return maxCompletionTokens;
  }

  public void setMaxCompletionTokens(JsonNullable<Integer> maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  public RunObject truncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
    return this;
  }

  /**
   * Get truncationStrategy
   * @return truncationStrategy
   */
  @NotNull @Valid 
  @Schema(name = "truncation_strategy", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("truncation_strategy")
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
   */
  @NotNull @Valid 
  @Schema(name = "tool_choice", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("tool_choice")
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
   */
  @NotNull @Valid 
  @Schema(name = "response_format", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("response_format")
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
        Objects.equals(this.fileIds, runObject.fileIds) &&
        Objects.equals(this.metadata, runObject.metadata) &&
        Objects.equals(this.usage, runObject.usage) &&
        equalsNullable(this.temperature, runObject.temperature) &&
        Objects.equals(this.maxPromptTokens, runObject.maxPromptTokens) &&
        Objects.equals(this.maxCompletionTokens, runObject.maxCompletionTokens) &&
        Objects.equals(this.truncationStrategy, runObject.truncationStrategy) &&
        Objects.equals(this.toolChoice, runObject.toolChoice) &&
        Objects.equals(this.responseFormat, runObject.responseFormat);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, threadId, assistantId, status, requiredAction, lastError, expiresAt, startedAt, cancelledAt, failedAt, completedAt, incompleteDetails, model, instructions, tools, fileIds, metadata, usage, hashCodeNullable(temperature), maxPromptTokens, maxCompletionTokens, truncationStrategy, toolChoice, responseFormat);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

