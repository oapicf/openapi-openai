package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepCompletionUsage;
import org.openapitools.model.RunStepObjectLastError;
import org.openapitools.model.RunStepObjectStepDetails;

@Canonical
class RunStepObject {
    /* The identifier of the run step, which can be referenced in API endpoints. */
    String id

    enum ObjectEnum {
    
        THREAD_RUN_STEP("thread.run.step")
    
        private final String value
    
        ObjectEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The object type, which is always `thread.run.step`. */
    ObjectEnum _object
    /* The Unix timestamp (in seconds) for when the run step was created. */
    Integer createdAt
    /* The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. */
    String assistantId
    /* The ID of the [thread](/docs/api-reference/threads) that was run. */
    String threadId
    /* The ID of the [run](/docs/api-reference/runs) that this run step is a part of. */
    String runId

    enum TypeEnum {
    
        MESSAGE_CREATION("message_creation"),
        
        TOOL_CALLS("tool_calls")
    
        private final String value
    
        TypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The type of run step, which can be either `message_creation` or `tool_calls`. */
    TypeEnum type

    enum StatusEnum {
    
        IN_PROGRESS("in_progress"),
        
        CANCELLED("cancelled"),
        
        FAILED("failed"),
        
        COMPLETED("completed"),
        
        EXPIRED("expired")
    
        private final String value
    
        StatusEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`. */
    StatusEnum status
    
    RunStepObjectStepDetails stepDetails
    
    RunStepObjectLastError lastError
    /* The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. */
    Integer expiredAt
    /* The Unix timestamp (in seconds) for when the run step was cancelled. */
    Integer cancelledAt
    /* The Unix timestamp (in seconds) for when the run step failed. */
    Integer failedAt
    /* The Unix timestamp (in seconds) for when the run step completed. */
    Integer completedAt
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    Object metadata
    
    RunStepCompletionUsage usage
}
