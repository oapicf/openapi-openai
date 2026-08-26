package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.RunStepCompletionUsage;
import org.openapitools.server.model.RunStepObjectLastError;
import org.openapitools.server.model.RunStepObjectStepDetails;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents a step in execution of a run. 
 */
public class RunStepObject   {

    private String id;

    /**
    * The object type, which is always `thread.run.step`.
    */
    public enum ObjectEnum {
        THREAD_RUN_STEP("thread.run.step");

        private String value;

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
        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ObjectEnum _object;
    private Integer createdAt;
    private String assistantId;
    private String threadId;
    private String runId;

    /**
    * The type of run step, which can be either `message_creation` or `tool_calls`.
    */
    public enum TypeEnum {
        MESSAGE_CREATION("message_creation"),
        TOOL_CALLS("tool_calls");

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


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

        private String value;

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
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
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
     * Default constructor.
     */
    public RunStepObject() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepObject.
     *
     * @param id The identifier of the run step, which can be referenced in API endpoints.
     * @param _object The object type, which is always &#x60;thread.run.step&#x60;.
     * @param createdAt The Unix timestamp (in seconds) for when the run step was created.
     * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param runId The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
     * @param type The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;.
     * @param status The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.
     * @param stepDetails stepDetails
     * @param lastError lastError
     * @param expiredAt The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
     * @param cancelledAt The Unix timestamp (in seconds) for when the run step was cancelled.
     * @param failedAt The Unix timestamp (in seconds) for when the run step failed.
     * @param completedAt The Unix timestamp (in seconds) for when the run step completed.
     * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     * @param usage usage
     */
    public RunStepObject(
        String id, 
        ObjectEnum _object, 
        Integer createdAt, 
        String assistantId, 
        String threadId, 
        String runId, 
        TypeEnum type, 
        StatusEnum status, 
        RunStepObjectStepDetails stepDetails, 
        RunStepObjectLastError lastError, 
        Integer expiredAt, 
        Integer cancelledAt, 
        Integer failedAt, 
        Integer completedAt, 
        Object metadata, 
        RunStepCompletionUsage usage
    ) {
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



    /**
     * The identifier of the run step, which can be referenced in API endpoints.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The object type, which is always `thread.run.step`.
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The Unix timestamp (in seconds) for when the run step was created.
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
     * @return assistantId
     */
    public String getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    /**
     * The ID of the [thread](/docs/api-reference/threads) that was run.
     * @return threadId
     */
    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    /**
     * The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
     * @return runId
     */
    public String getRunId() {
        return runId;
    }

    public void setRunId(String runId) {
        this.runId = runId;
    }

    /**
     * The type of run step, which can be either `message_creation` or `tool_calls`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Get stepDetails
     * @return stepDetails
     */
    public RunStepObjectStepDetails getStepDetails() {
        return stepDetails;
    }

    public void setStepDetails(RunStepObjectStepDetails stepDetails) {
        this.stepDetails = stepDetails;
    }

    /**
     * Get lastError
     * @return lastError
     */
    public RunStepObjectLastError getLastError() {
        return lastError;
    }

    public void setLastError(RunStepObjectLastError lastError) {
        this.lastError = lastError;
    }

    /**
     * The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
     * @return expiredAt
     */
    public Integer getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(Integer expiredAt) {
        this.expiredAt = expiredAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the run step was cancelled.
     * @return cancelledAt
     */
    public Integer getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(Integer cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the run step failed.
     * @return failedAt
     */
    public Integer getFailedAt() {
        return failedAt;
    }

    public void setFailedAt(Integer failedAt) {
        this.failedAt = failedAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the run step completed.
     * @return completedAt
     */
    public Integer getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Integer completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
     * Get usage
     * @return usage
     */
    public RunStepCompletionUsage getUsage() {
        return usage;
    }

    public void setUsage(RunStepCompletionUsage usage) {
        this.usage = usage;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

