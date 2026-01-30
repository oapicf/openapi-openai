package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BatchErrors;
import org.openapitools.model.BatchRequestCounts;

@Canonical
class Batch {
    
    String id

    enum ObjectEnum {
    
        BATCH("batch")
    
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

    /* The object type, which is always `batch`. */
    ObjectEnum _object
    /* The OpenAI API endpoint used by the batch. */
    String endpoint
    
    BatchErrors errors
    /* The ID of the input file for the batch. */
    String inputFileId
    /* The time frame within which the batch should be processed. */
    String completionWindow

    enum StatusEnum {
    
        VALIDATING("validating"),
        
        FAILED("failed"),
        
        IN_PROGRESS("in_progress"),
        
        FINALIZING("finalizing"),
        
        COMPLETED("completed"),
        
        EXPIRED("expired"),
        
        CANCELLING("cancelling"),
        
        CANCELLED("cancelled")
    
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

    /* The current status of the batch. */
    StatusEnum status
    /* The ID of the file containing the outputs of successfully executed requests. */
    String outputFileId
    /* The ID of the file containing the outputs of requests with errors. */
    String errorFileId
    /* The Unix timestamp (in seconds) for when the batch was created. */
    Integer createdAt
    /* The Unix timestamp (in seconds) for when the batch started processing. */
    Integer inProgressAt
    /* The Unix timestamp (in seconds) for when the batch will expire. */
    Integer expiresAt
    /* The Unix timestamp (in seconds) for when the batch started finalizing. */
    Integer finalizingAt
    /* The Unix timestamp (in seconds) for when the batch was completed. */
    Integer completedAt
    /* The Unix timestamp (in seconds) for when the batch failed. */
    Integer failedAt
    /* The Unix timestamp (in seconds) for when the batch expired. */
    Integer expiredAt
    /* The Unix timestamp (in seconds) for when the batch started cancelling. */
    Integer cancellingAt
    /* The Unix timestamp (in seconds) for when the batch was cancelled. */
    Integer cancelledAt
    
    BatchRequestCounts requestCounts
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    Object metadata
}
