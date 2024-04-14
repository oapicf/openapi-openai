package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.AssistantObjectToolsInner;
import org.openapitools.server.api.model.AssistantsApiResponseFormatOption;
import org.openapitools.server.api.model.AssistantsApiToolChoiceOption;
import org.openapitools.server.api.model.RunCompletionUsage;
import org.openapitools.server.api.model.RunObjectIncompleteDetails;
import org.openapitools.server.api.model.RunObjectLastError;
import org.openapitools.server.api.model.RunObjectRequiredAction;
import org.openapitools.server.api.model.TruncationObject;

/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunObject   {
  
  private String id;


  public enum ObjectEnum {
    THREAD_RUN("thread.run");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;
  private Integer createdAt;
  private String threadId;
  private String assistantId;


  public enum StatusEnum {
    QUEUED("queued"),
    IN_PROGRESS("in_progress"),
    REQUIRES_ACTION("requires_action"),
    CANCELLING("cancelling"),
    CANCELLED("cancelled"),
    FAILED("failed"),
    COMPLETED("completed"),
    EXPIRED("expired");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
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
  private List<String> fileIds = new ArrayList<>();
  private Object metadata;
  private RunCompletionUsage usage;
  private BigDecimal temperature;
  private Integer maxPromptTokens;
  private Integer maxCompletionTokens;
  private TruncationObject truncationStrategy;
  private AssistantsApiToolChoiceOption toolChoice;
  private AssistantsApiResponseFormatOption responseFormat;

  public RunObject () {

  }

  public RunObject (String id, ObjectEnum _object, Integer createdAt, String threadId, String assistantId, StatusEnum status, RunObjectRequiredAction requiredAction, RunObjectLastError lastError, Integer expiresAt, Integer startedAt, Integer cancelledAt, Integer failedAt, Integer completedAt, RunObjectIncompleteDetails incompleteDetails, String model, String instructions, List<AssistantObjectToolsInner> tools, List<String> fileIds, Object metadata, RunCompletionUsage usage, BigDecimal temperature, Integer maxPromptTokens, Integer maxCompletionTokens, TruncationObject truncationStrategy, AssistantsApiToolChoiceOption toolChoice, AssistantsApiResponseFormatOption responseFormat) {
    this.id = id;
    this._object = _object;
    this.createdAt = createdAt;
    this.threadId = threadId;
    this.assistantId = assistantId;
    this.status = status;
    this.requiredAction = requiredAction;
    this.lastError = lastError;
    this.expiresAt = expiresAt;
    this.startedAt = startedAt;
    this.cancelledAt = cancelledAt;
    this.failedAt = failedAt;
    this.completedAt = completedAt;
    this.incompleteDetails = incompleteDetails;
    this.model = model;
    this.instructions = instructions;
    this.tools = tools;
    this.fileIds = fileIds;
    this.metadata = metadata;
    this.usage = usage;
    this.temperature = temperature;
    this.maxPromptTokens = maxPromptTokens;
    this.maxCompletionTokens = maxCompletionTokens;
    this.truncationStrategy = truncationStrategy;
    this.toolChoice = toolChoice;
    this.responseFormat = responseFormat;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

    
  @JsonProperty("thread_id")
  public String getThreadId() {
    return threadId;
  }
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

    
  @JsonProperty("assistant_id")
  public String getAssistantId() {
    return assistantId;
  }
  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("required_action")
  public RunObjectRequiredAction getRequiredAction() {
    return requiredAction;
  }
  public void setRequiredAction(RunObjectRequiredAction requiredAction) {
    this.requiredAction = requiredAction;
  }

    
  @JsonProperty("last_error")
  public RunObjectLastError getLastError() {
    return lastError;
  }
  public void setLastError(RunObjectLastError lastError) {
    this.lastError = lastError;
  }

    
  @JsonProperty("expires_at")
  public Integer getExpiresAt() {
    return expiresAt;
  }
  public void setExpiresAt(Integer expiresAt) {
    this.expiresAt = expiresAt;
  }

    
  @JsonProperty("started_at")
  public Integer getStartedAt() {
    return startedAt;
  }
  public void setStartedAt(Integer startedAt) {
    this.startedAt = startedAt;
  }

    
  @JsonProperty("cancelled_at")
  public Integer getCancelledAt() {
    return cancelledAt;
  }
  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

    
  @JsonProperty("failed_at")
  public Integer getFailedAt() {
    return failedAt;
  }
  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }

    
  @JsonProperty("completed_at")
  public Integer getCompletedAt() {
    return completedAt;
  }
  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

    
  @JsonProperty("incomplete_details")
  public RunObjectIncompleteDetails getIncompleteDetails() {
    return incompleteDetails;
  }
  public void setIncompleteDetails(RunObjectIncompleteDetails incompleteDetails) {
    this.incompleteDetails = incompleteDetails;
  }

    
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

    
  @JsonProperty("instructions")
  public String getInstructions() {
    return instructions;
  }
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

    
  @JsonProperty("tools")
  public List<AssistantObjectToolsInner> getTools() {
    return tools;
  }
  public void setTools(List<AssistantObjectToolsInner> tools) {
    this.tools = tools;
  }

    
  @JsonProperty("file_ids")
  public List<String> getFileIds() {
    return fileIds;
  }
  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

    
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

    
  @JsonProperty("usage")
  public RunCompletionUsage getUsage() {
    return usage;
  }
  public void setUsage(RunCompletionUsage usage) {
    this.usage = usage;
  }

    
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

    
  @JsonProperty("max_prompt_tokens")
  public Integer getMaxPromptTokens() {
    return maxPromptTokens;
  }
  public void setMaxPromptTokens(Integer maxPromptTokens) {
    this.maxPromptTokens = maxPromptTokens;
  }

    
  @JsonProperty("max_completion_tokens")
  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }
  public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

    
  @JsonProperty("truncation_strategy")
  public TruncationObject getTruncationStrategy() {
    return truncationStrategy;
  }
  public void setTruncationStrategy(TruncationObject truncationStrategy) {
    this.truncationStrategy = truncationStrategy;
  }

    
  @JsonProperty("tool_choice")
  public AssistantsApiToolChoiceOption getToolChoice() {
    return toolChoice;
  }
  public void setToolChoice(AssistantsApiToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

    
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
