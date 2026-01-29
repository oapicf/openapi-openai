/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.0.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepCompletionUsage;
import org.openapitools.model.RunStepObjectLastError;
import org.openapitools.model.RunStepObjectStepDetails;



/**
 * Represents a step in execution of a run. 
 */

@ApiModel(description = "Represents a step in execution of a run. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T10:45:08.090000084Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  /**
   * The identifier of the run step, which can be referenced in API endpoints.
   */
  public RunStepObject id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The identifier of the run step, which can be referenced in API endpoints.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The object type, which is always `thread.run.step`.
   */
  public RunStepObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always `thread.run.step`.")
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * The Unix timestamp (in seconds) for when the run step was created.
   */
  public RunStepObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run step was created.")
  @JsonProperty("created_at")
  public Integer getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
   */
  public RunStepObject assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.")
  @JsonProperty("assistant_id")
  public String getAssistantId() {
    return assistantId;
  }
  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }

  /**
   * The ID of the [thread](/docs/api-reference/threads) that was run.
   */
  public RunStepObject threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the [thread](/docs/api-reference/threads) that was run.")
  @JsonProperty("thread_id")
  public String getThreadId() {
    return threadId;
  }
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }

  /**
   * The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
   */
  public RunStepObject runId(String runId) {
    this.runId = runId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the [run](/docs/api-reference/runs) that this run step is a part of.")
  @JsonProperty("run_id")
  public String getRunId() {
    return runId;
  }
  public void setRunId(String runId) {
    this.runId = runId;
  }

  /**
   * The type of run step, which can be either `message_creation` or `tool_calls`.
   */
  public RunStepObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of run step, which can be either `message_creation` or `tool_calls`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
   */
  public RunStepObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   */
  public RunStepObject stepDetails(RunStepObjectStepDetails stepDetails) {
    this.stepDetails = stepDetails;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("step_details")
  public RunStepObjectStepDetails getStepDetails() {
    return stepDetails;
  }
  public void setStepDetails(RunStepObjectStepDetails stepDetails) {
    this.stepDetails = stepDetails;
  }

  /**
   */
  public RunStepObject lastError(RunStepObjectLastError lastError) {
    this.lastError = lastError;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("last_error")
  public RunStepObjectLastError getLastError() {
    return lastError;
  }
  public void setLastError(RunStepObjectLastError lastError) {
    this.lastError = lastError;
  }

  /**
   * The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
   */
  public RunStepObject expiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.")
  @JsonProperty("expired_at")
  public Integer getExpiredAt() {
    return expiredAt;
  }
  public void setExpiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the run step was cancelled.
   */
  public RunStepObject cancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run step was cancelled.")
  @JsonProperty("cancelled_at")
  public Integer getCancelledAt() {
    return cancelledAt;
  }
  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the run step failed.
   */
  public RunStepObject failedAt(Integer failedAt) {
    this.failedAt = failedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run step failed.")
  @JsonProperty("failed_at")
  public Integer getFailedAt() {
    return failedAt;
  }
  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }

  /**
   * The Unix timestamp (in seconds) for when the run step completed.
   */
  public RunStepObject completedAt(Integer completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) for when the run step completed.")
  @JsonProperty("completed_at")
  public Integer getCompletedAt() {
    return completedAt;
  }
  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   */
  public RunStepObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. ")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   */
  public RunStepObject usage(RunStepCompletionUsage usage) {
    this.usage = usage;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

