package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VectorStoreFileObjectChunkingStrategy;
import org.openapitools.model.VectorStoreFileObjectLastError;

@Canonical
class VectorStoreFileObject {
    /* The identifier, which can be referenced in API endpoints. */
    String id

    enum ObjectEnum {
    
        VECTOR_STORE_FILE("vector_store.file")
    
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

    /* The object type, which is always `vector_store.file`. */
    ObjectEnum _object
    /* The total vector store usage in bytes. Note that this may be different from the original file size. */
    Integer usageBytes
    /* The Unix timestamp (in seconds) for when the vector store file was created. */
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

    /* The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use. */
    StatusEnum status
    
    VectorStoreFileObjectLastError lastError
    
    VectorStoreFileObjectChunkingStrategy chunkingStrategy
}
