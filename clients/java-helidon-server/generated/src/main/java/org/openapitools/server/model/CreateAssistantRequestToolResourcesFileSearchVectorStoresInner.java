package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner   {

    private List<String> fileIds = new ArrayList<>();
    private CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy;
    private Object metadata;

    /**
     * Default constructor.
     */
    public CreateAssistantRequestToolResourcesFileSearchVectorStoresInner() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateAssistantRequestToolResourcesFileSearchVectorStoresInner.
     *
     * @param fileIds A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
     * @param chunkingStrategy chunkingStrategy
     * @param metadata Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     */
    public CreateAssistantRequestToolResourcesFileSearchVectorStoresInner(
        List<String> fileIds, 
        CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy, 
        Object metadata
    ) {
        this.fileIds = fileIds;
        this.chunkingStrategy = chunkingStrategy;
        this.metadata = metadata;
    }



    /**
     * A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
     * @return fileIds
     */
    public List<String> getFileIds() {
        return fileIds;
    }

    public void setFileIds(List<String> fileIds) {
        this.fileIds = fileIds;
    }

    /**
     * Get chunkingStrategy
     * @return chunkingStrategy
     */
    public CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy getChunkingStrategy() {
        return chunkingStrategy;
    }

    public void setChunkingStrategy(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy) {
        this.chunkingStrategy = chunkingStrategy;
    }

    /**
     * Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner {\n");
        
        sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
        sb.append("    chunkingStrategy: ").append(toIndentedString(chunkingStrategy)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

