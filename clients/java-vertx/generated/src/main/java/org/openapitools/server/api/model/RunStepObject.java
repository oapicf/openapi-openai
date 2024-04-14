package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.RunStepCompletionUsage;
import org.openapitools.server.api.model.RunStepObjectLastError;
import org.openapitools.server.api.model.RunStepObjectStepDetails;

/**
 * Represents a step in execution of a run. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunStepObject   {
  
  private String id;


  public enum ObjectEnum {
    THREAD_RUN_STEP("thread.run.step");

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
  private String assistantId;
  private String threadId;
  private String runId;


  public enum TypeEnum {
    MESSAGE_CREATION("message_creation"),
    TOOL_CALLS("tool_calls");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;


  public enum StatusEnum {
    IN_PROGRESS("in_progress"),
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
  private RunStepObjectStepDetails stepDetails;
  private RunStepObjectLastError lastError;
  private Integer expiredAt;
  private Integer cancelledAt;
  private Integer failedAt;
  private Integer completedAt;
  private Object metadata;
  private RunStepCompletionUsage usage;

  public RunStepObject () {

  }

  public RunStepObject (String id, ObjectEnum _object, Integer createdAt, String assistantId, String threadId, String runId, TypeEnum type, StatusEnum status, RunStepObjectStepDetails stepDetails, RunStepObjectLastError lastError, Integer expiredAt, Integer cancelledAt, Integer failedAt, Integer completedAt, Object metadata, RunStepCompletionUsage usage) {
    this.id = id;
    this._object = _object;
    this.createdAt = createdAt;
    this.assistantId = assistantId;
    this.threadId = threadId;
    this.runId = runId;
    this.type = type;
    this.status = status;
    this.stepDetails = stepDetails;
    this.lastError = lastError;
    this.expiredAt = expiredAt;
    this.cancelledAt = cancelledAt;
    this.failedAt = failedAt;
    this.completedAt = completedAt;
    this.metadata = metadata;
    this.usage = usage;
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

    
  @JsonProperty("assistant_id")
  public String getAssistantId() {
    return assistantId;
  }
  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

    
  @JsonProperty("thread_id")
  public String getThreadId() {
    return threadId;
  }
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

    
  @JsonProperty("run_id")
  public String getRunId() {
    return runId;
  }
  public void setRunId(String runId) {
    this.runId = runId;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("step_details")
  public RunStepObjectStepDetails getStepDetails() {
    return stepDetails;
  }
  public void setStepDetails(RunStepObjectStepDetails stepDetails) {
    this.stepDetails = stepDetails;
  }

    
  @JsonProperty("last_error")
  public RunStepObjectLastError getLastError() {
    return lastError;
  }
  public void setLastError(RunStepObjectLastError lastError) {
    this.lastError = lastError;
  }

    
  @JsonProperty("expired_at")
  public Integer getExpiredAt() {
    return expiredAt;
  }
  public void setExpiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
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

    
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

    
  @JsonProperty("usage")
  public RunStepCompletionUsage getUsage() {
    return usage;
  }
  public void setUsage(RunStepCompletionUsage usage) {
    this.usage = usage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepObject runStepObject = (RunStepObject) o;
    return Objects.equals(id, runStepObject.id) &&
        Objects.equals(_object, runStepObject._object) &&
        Objects.equals(createdAt, runStepObject.createdAt) &&
        Objects.equals(assistantId, runStepObject.assistantId) &&
        Objects.equals(threadId, runStepObject.threadId) &&
        Objects.equals(runId, runStepObject.runId) &&
        Objects.equals(type, runStepObject.type) &&
        Objects.equals(status, runStepObject.status) &&
        Objects.equals(stepDetails, runStepObject.stepDetails) &&
        Objects.equals(lastError, runStepObject.lastError) &&
        Objects.equals(expiredAt, runStepObject.expiredAt) &&
        Objects.equals(cancelledAt, runStepObject.cancelledAt) &&
        Objects.equals(failedAt, runStepObject.failedAt) &&
        Objects.equals(completedAt, runStepObject.completedAt) &&
        Objects.equals(metadata, runStepObject.metadata) &&
        Objects.equals(usage, runStepObject.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, assistantId, threadId, runId, type, status, stepDetails, lastError, expiredAt, cancelledAt, failedAt, completedAt, metadata, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepObject {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stepDetails: ").append(toIndentedString(stepDetails)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
    sb.append("    cancelledAt: ").append(toIndentedString(cancelledAt)).append("\n");
    sb.append("    failedAt: ").append(toIndentedString(failedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
