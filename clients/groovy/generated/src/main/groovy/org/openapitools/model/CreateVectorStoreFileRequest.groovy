package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChunkingStrategyRequestParam;

@Canonical
class CreateVectorStoreFileRequest {
    /* A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files. */
    String fileId
    
    ChunkingStrategyRequestParam chunkingStrategy
}
