package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.RunStepCompletionUsage;
import org.openapitools.model.RunStepObjectLastError;
import org.openapitools.model.RunStepObjectStepDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Represents a step in execution of a run. 
 */
@ApiModel(description="Represents a step in execution of a run. ")

public class RunStepObject  {
  
 /**
  * The identifier of the run step, which can be referenced in API endpoints.
  */
  @ApiModelProperty(required = true, value = "The identifier of the run step, which can be referenced in API endpoints.")
  private String id;

public enum ObjectEnum {

    @JsonProperty("thread.run.step") THREAD_RUN_STEP(String.valueOf("thread.run.step"));

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
  * The object type, which is always `thread.run.step`.
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `thread.run.step`.")
  private ObjectEnum _object;

 /**
  * The Unix timestamp (in seconds) for when the run step was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run step was created.")
  private Integer createdAt;

 /**
  * The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
  */
  @ApiModelProperty(required = true, value = "The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.")
  private String assistantId;

 /**
  * The ID of the [thread](/docs/api-reference/threads) that was run.
  */
  @ApiModelProperty(required = true, value = "The ID of the [thread](/docs/api-reference/threads) that was run.")
  private String threadId;

 /**
  * The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
  */
  @ApiModelProperty(required = true, value = "The ID of the [run](/docs/api-reference/runs) that this run step is a part of.")
  private String runId;

public enum TypeEnum {

    @JsonProperty("message_creation") MESSAGE_CREATION(String.valueOf("message_creation")),
    @JsonProperty("tool_calls") TOOL_CALLS(String.valueOf("tool_calls"));

    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The type of run step, which can be either `message_creation` or `tool_calls`.
  */
  @ApiModelProperty(required = true, value = "The type of run step, which can be either `message_creation` or `tool_calls`.")
  private TypeEnum type;

public enum StatusEnum {

    @JsonProperty("in_progress") IN_PROGRESS(String.valueOf("in_progress")),
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
  * The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
  */
  @ApiModelProperty(required = true, value = "The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.")
  private StatusEnum status;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RunStepObjectStepDetails stepDetails;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RunStepObjectLastError lastError;

 /**
  * The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.")
  private Integer expiredAt;

 /**
  * The Unix timestamp (in seconds) for when the run step was cancelled.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run step was cancelled.")
  private Integer cancelledAt;

 /**
  * The Unix timestamp (in seconds) for when the run step failed.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run step failed.")
  private Integer failedAt;

 /**
  * The Unix timestamp (in seconds) for when the run step completed.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run step completed.")
  private Integer completedAt;

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  */
  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
  private Object metadata;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private RunStepCompletionUsage usage;
 /**
  * The identifier of the run step, which can be referenced in API endpoints.
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
  public RunStepObject id(String id) {
    this.id = id;
    return this;
  }

 /**
  * The object type, which is always &#x60;thread.run.step&#x60;.
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
  public RunStepObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the run step was created.
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
  public RunStepObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

 /**
  * The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
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
  public RunStepObject assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

 /**
  * The ID of the [thread](/docs/api-reference/threads) that was run.
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
  public RunStepObject threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

 /**
  * The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
  * @return runId
  */
  @JsonProperty("run_id")
  @NotNull
  public String getRunId() {
    return runId;
  }

  /**
   * Sets the <code>runId</code> property.
   */
 public void setRunId(String runId) {
    this.runId = runId;
  }

  /**
   * Sets the <code>runId</code> property.
   */
  public RunStepObject runId(String runId) {
    this.runId = runId;
    return this;
  }

 /**
  * The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public RunStepObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.
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
  public RunStepObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

 /**
  * Get stepDetails
  * @return stepDetails
  */
  @JsonProperty("step_details")
  @NotNull
  public RunStepObjectStepDetails getStepDetails() {
    return stepDetails;
  }

  /**
   * Sets the <code>stepDetails</code> property.
   */
 public void setStepDetails(RunStepObjectStepDetails stepDetails) {
    this.stepDetails = stepDetails;
  }

  /**
   * Sets the <code>stepDetails</code> property.
   */
  public RunStepObject stepDetails(RunStepObjectStepDetails stepDetails) {
    this.stepDetails = stepDetails;
    return this;
  }

 /**
  * Get lastError
  * @return lastError
  */
  @JsonProperty("last_error")
  @NotNull
  public RunStepObjectLastError getLastError() {
    return lastError;
  }

  /**
   * Sets the <code>lastError</code> property.
   */
 public void setLastError(RunStepObjectLastError lastError) {
    this.lastError = lastError;
  }

  /**
   * Sets the <code>lastError</code> property.
   */
  public RunStepObject lastError(RunStepObjectLastError lastError) {
    this.lastError = lastError;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
  * @return expiredAt
  */
  @JsonProperty("expired_at")
  @NotNull
  public Integer getExpiredAt() {
    return expiredAt;
  }

  /**
   * Sets the <code>expiredAt</code> property.
   */
 public void setExpiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
  }

  /**
   * Sets the <code>expiredAt</code> property.
   */
  public RunStepObject expiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the run step was cancelled.
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
  public RunStepObject cancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the run step failed.
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
  public RunStepObject failedAt(Integer failedAt) {
    this.failedAt = failedAt;
    return this;
  }

 /**
  * The Unix timestamp (in seconds) for when the run step completed.
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
  public RunStepObject completedAt(Integer completedAt) {
    this.completedAt = completedAt;
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
  public RunStepObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
  * Get usage
  * @return usage
  */
  @JsonProperty("usage")
  @NotNull
  public RunStepCompletionUsage getUsage() {
    return usage;
  }

  /**
   * Sets the <code>usage</code> property.
   */
 public void setUsage(RunStepCompletionUsage usage) {
    this.usage = usage;
  }

  /**
   * Sets the <code>usage</code> property.
   */
  public RunStepObject usage(RunStepCompletionUsage usage) {
    this.usage = usage;
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
    RunStepObject runStepObject = (RunStepObject) o;
    return Objects.equals(this.id, runStepObject.id) &&
        Objects.equals(this._object, runStepObject._object) &&
        Objects.equals(this.createdAt, runStepObject.createdAt) &&
        Objects.equals(this.assistantId, runStepObject.assistantId) &&
        Objects.equals(this.threadId, runStepObject.threadId) &&
        Objects.equals(this.runId, runStepObject.runId) &&
        Objects.equals(this.type, runStepObject.type) &&
        Objects.equals(this.status, runStepObject.status) &&
        Objects.equals(this.stepDetails, runStepObject.stepDetails) &&
        Objects.equals(this.lastError, runStepObject.lastError) &&
        Objects.equals(this.expiredAt, runStepObject.expiredAt) &&
        Objects.equals(this.cancelledAt, runStepObject.cancelledAt) &&
        Objects.equals(this.failedAt, runStepObject.failedAt) &&
        Objects.equals(this.completedAt, runStepObject.completedAt) &&
        Objects.equals(this.metadata, runStepObject.metadata) &&
        Objects.equals(this.usage, runStepObject.usage);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

