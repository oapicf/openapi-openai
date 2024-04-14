package apimodels;

import apimodels.RunStepCompletionUsage;
import apimodels.RunStepObjectLastError;
import apimodels.RunStepObjectStepDetails;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Represents a step in execution of a run. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-04-14T13:39:27.767845477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunStepObject   {
  @JsonProperty("id")
  @NotNull

  private String id;

  /**
   * The object type, which is always `thread.run.step`.
   */
  public enum ObjectEnum {
    THREAD_RUN_STEP("thread.run.step");

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

  @JsonProperty("assistant_id")
  @NotNull

  private String assistantId;

  @JsonProperty("thread_id")
  @NotNull

  private String threadId;

  @JsonProperty("run_id")
  @NotNull

  private String runId;

  /**
   * The type of run step, which can be either `message_creation` or `tool_calls`.
   */
  public enum TypeEnum {
    MESSAGE_CREATION("message_creation"),
    
    TOOL_CALLS("tool_calls");

    private final String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  @NotNull

  private TypeEnum type;

  /**
   * The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
   */
  public enum StatusEnum {
    IN_PROGRESS("in_progress"),
    
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

  @JsonProperty("step_details")
  @NotNull
@Valid

  private RunStepObjectStepDetails stepDetails;

  @JsonProperty("last_error")
  @NotNull
@Valid

  private RunStepObjectLastError lastError;

  @JsonProperty("expired_at")
  @NotNull

  private Integer expiredAt;

  @JsonProperty("cancelled_at")
  @NotNull

  private Integer cancelledAt;

  @JsonProperty("failed_at")
  @NotNull

  private Integer failedAt;

  @JsonProperty("completed_at")
  @NotNull

  private Integer completedAt;

  @JsonProperty("metadata")
  @NotNull

  private Object metadata;

  @JsonProperty("usage")
  @NotNull
@Valid

  private RunStepCompletionUsage usage;

  public RunStepObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier of the run step, which can be referenced in API endpoints.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RunStepObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

   /**
   * The object type, which is always `thread.run.step`.
   * @return _object
  **/
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public RunStepObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run step was created.
   * @return createdAt
  **/
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  public RunStepObject assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

   /**
   * The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
   * @return assistantId
  **/
  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  public RunStepObject threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

   /**
   * The ID of the [thread](/docs/api-reference/threads) that was run.
   * @return threadId
  **/
  public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  public RunStepObject runId(String runId) {
    this.runId = runId;
    return this;
  }

   /**
   * The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
   * @return runId
  **/
  public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
  }

  public RunStepObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of run step, which can be either `message_creation` or `tool_calls`.
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public RunStepObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
   * @return status
  **/
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public RunStepObject stepDetails(RunStepObjectStepDetails stepDetails) {
    this.stepDetails = stepDetails;
    return this;
  }

   /**
   * Get stepDetails
   * @return stepDetails
  **/
  public RunStepObjectStepDetails getStepDetails() {
    return stepDetails;
  }

  public void setStepDetails(RunStepObjectStepDetails stepDetails) {
    this.stepDetails = stepDetails;
  }

  public RunStepObject lastError(RunStepObjectLastError lastError) {
    this.lastError = lastError;
    return this;
  }

   /**
   * Get lastError
   * @return lastError
  **/
  public RunStepObjectLastError getLastError() {
    return lastError;
  }

  public void setLastError(RunStepObjectLastError lastError) {
    this.lastError = lastError;
  }

  public RunStepObject expiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
   * @return expiredAt
  **/
  public Integer getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
  }

  public RunStepObject cancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run step was cancelled.
   * @return cancelledAt
  **/
  public Integer getCancelledAt() {
    return cancelledAt;
  }

  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  public RunStepObject failedAt(Integer failedAt) {
    this.failedAt = failedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run step failed.
   * @return failedAt
  **/
  public Integer getFailedAt() {
    return failedAt;
  }

  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }

  public RunStepObject completedAt(Integer completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) for when the run step completed.
   * @return completedAt
  **/
  public Integer getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

  public RunStepObject metadata(Object metadata) {
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

  public RunStepObject usage(RunStepCompletionUsage usage) {
    this.usage = usage;
    return this;
  }

   /**
   * Get usage
   * @return usage
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

