package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssistantObjectToolsInner;
import org.openapitools.model.AssistantsApiResponseFormatOption;
import org.openapitools.model.AssistantsApiToolChoiceOption;
import org.openapitools.model.RunCompletionUsage;
import org.openapitools.model.RunObjectIncompleteDetails;
import org.openapitools.model.RunObjectLastError;
import org.openapitools.model.RunObjectRequiredAction;
import org.openapitools.model.TruncationObject;

@Canonical
class RunObject {
    /* The identifier, which can be referenced in API endpoints. */
    String id

    enum ObjectEnum {
    
        THREAD_RUN("thread.run")
    
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

    /* The object type, which is always `thread.run`. */
    ObjectEnum _object
    /* The Unix timestamp (in seconds) for when the run was created. */
    Integer createdAt
    /* The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. */
    String threadId
    /* The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. */
    String assistantId

    enum StatusEnum {
    
        QUEUED("queued"),
        
        IN_PROGRESS("in_progress"),
        
        REQUIRES_ACTION("requires_action"),
        
        CANCELLING("cancelling"),
        
        CANCELLED("cancelled"),
        
        FAILED("failed"),
        
        COMPLETED("completed"),
        
        INCOMPLETE("incomplete"),
        
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

    /* The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`. */
    StatusEnum status
    
    RunObjectRequiredAction requiredAction
    
    RunObjectLastError lastError
    /* The Unix timestamp (in seconds) for when the run will expire. */
    Integer expiresAt
    /* The Unix timestamp (in seconds) for when the run was started. */
    Integer startedAt
    /* The Unix timestamp (in seconds) for when the run was cancelled. */
    Integer cancelledAt
    /* The Unix timestamp (in seconds) for when the run failed. */
    Integer failedAt
    /* The Unix timestamp (in seconds) for when the run was completed. */
    Integer completedAt
    
    RunObjectIncompleteDetails incompleteDetails
    /* The model that the [assistant](/docs/api-reference/assistants) used for this run. */
    String model
    /* The instructions that the [assistant](/docs/api-reference/assistants) used for this run. */
    String instructions
    /* The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. */
    List<AssistantObjectToolsInner> tools = new ArrayList<>()
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    Object metadata
    
    RunCompletionUsage usage
    /* The sampling temperature used for this run. If not set, defaults to 1. */
    BigDecimal temperature
    /* The nucleus sampling value used for this run. If not set, defaults to 1. */
    BigDecimal topP
    /* The maximum number of prompt tokens specified to have been used over the course of the run.  */
    Integer maxPromptTokens
    /* The maximum number of completion tokens specified to have been used over the course of the run.  */
    Integer maxCompletionTokens
    
    TruncationObject truncationStrategy
    
    AssistantsApiToolChoiceOption toolChoice
    /* Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. */
    Boolean parallelToolCalls = true
    
    AssistantsApiResponseFormatOption responseFormat
}
