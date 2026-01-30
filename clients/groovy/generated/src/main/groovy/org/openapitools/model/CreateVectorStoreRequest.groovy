package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateVectorStoreRequestChunkingStrategy;
import org.openapitools.model.VectorStoreExpirationAfter;

@Canonical
class CreateVectorStoreRequest {
    /* A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files. */
    List<String> fileIds = new ArrayList<>()
    /* The name of the vector store. */
    String name
    
    VectorStoreExpirationAfter expiresAfter
    
    CreateVectorStoreRequestChunkingStrategy chunkingStrategy
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    Object metadata
}
