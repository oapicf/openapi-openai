package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ChunkingStrategyRequestParam;

@Canonical
class CreateVectorStoreFileBatchRequest {
    /* A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files. */
    List<String> fileIds = new ArrayList<>()
    
    ChunkingStrategyRequestParam chunkingStrategy
}
