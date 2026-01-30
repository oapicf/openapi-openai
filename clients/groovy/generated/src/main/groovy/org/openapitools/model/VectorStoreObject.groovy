package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.VectorStoreExpirationAfter;
import org.openapitools.model.VectorStoreObjectFileCounts;

@Canonical
class VectorStoreObject {
    /* The identifier, which can be referenced in API endpoints. */
    String id

    enum ObjectEnum {
    
        VECTOR_STORE("vector_store")
    
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

    /* The object type, which is always `vector_store`. */
    ObjectEnum _object
    /* The Unix timestamp (in seconds) for when the vector store was created. */
    Integer createdAt
    /* The name of the vector store. */
    String name
    /* The total number of bytes used by the files in the vector store. */
    Integer usageBytes
    
    VectorStoreObjectFileCounts fileCounts

    enum StatusEnum {
    
        EXPIRED("expired"),
        
        IN_PROGRESS("in_progress"),
        
        COMPLETED("completed")
    
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

    /* The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use. */
    StatusEnum status
    
    VectorStoreExpirationAfter expiresAfter
    /* The Unix timestamp (in seconds) for when the vector store will expire. */
    Integer expiresAt
    /* The Unix timestamp (in seconds) for when the vector store was last active. */
    Integer lastActiveAt
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    Object metadata
}
