package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ChunkingStrategyRequestParam;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateVectorStoreFileBatchRequest   {

    private List<String> fileIds = new ArrayList<>();
    private ChunkingStrategyRequestParam chunkingStrategy;

    /**
     * Default constructor.
     */
    public CreateVectorStoreFileBatchRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateVectorStoreFileBatchRequest.
     *
     * @param fileIds A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files.
     * @param chunkingStrategy chunkingStrategy
     */
    public CreateVectorStoreFileBatchRequest(
        List<String> fileIds, 
        ChunkingStrategyRequestParam chunkingStrategy
    ) {
        this.fileIds = fileIds;
        this.chunkingStrategy = chunkingStrategy;
    }



    /**
     * A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
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
    public ChunkingStrategyRequestParam getChunkingStrategy() {
        return chunkingStrategy;
    }

    public void setChunkingStrategy(ChunkingStrategyRequestParam chunkingStrategy) {
        this.chunkingStrategy = chunkingStrategy;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVectorStoreFileBatchRequest {\n");
        
        sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
        sb.append("    chunkingStrategy: ").append(toIndentedString(chunkingStrategy)).append("\n");
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

