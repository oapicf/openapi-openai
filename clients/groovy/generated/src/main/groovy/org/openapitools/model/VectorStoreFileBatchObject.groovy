package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VectorStoreFileBatchObjectFileCounts;

@Canonical
class VectorStoreFileBatchObject {
    /* The identifier, which can be referenced in API endpoints. */
    String id

    enum ObjectEnum {
    
        VECTOR_STORE_FILES_BATCH("vector_store.files_batch")
    
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

    /* The object type, which is always `vector_store.file_batch`. */
    ObjectEnum _object
    /* The Unix timestamp (in seconds) for when the vector store files batch was created. */
    Integer createdAt
    /* The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. */
    String vectorStoreId

    enum StatusEnum {
    
        IN_PROGRESS("in_progress"),
        
        COMPLETED("completed"),
        
        CANCELLED("cancelled"),
        
        FAILED("failed")
    
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

    /* The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`. */
    StatusEnum status
    
    VectorStoreFileBatchObjectFileCounts fileCounts
}
