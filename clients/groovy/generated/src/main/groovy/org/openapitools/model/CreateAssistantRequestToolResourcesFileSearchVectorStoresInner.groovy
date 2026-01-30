package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy;

@Canonical
class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner {
    /* A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.  */
    List<String> fileIds = new ArrayList<>()
    
    CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy
    /* Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    Object metadata
}
