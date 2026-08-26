package org.openapitools.server.model;

import org.openapitools.server.model.ChunkingStrategyRequestParam;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateVectorStoreFileRequest   {

    private String fileId;
    private ChunkingStrategyRequestParam chunkingStrategy;

    /**
     * Default constructor.
     */
    public CreateVectorStoreFileRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateVectorStoreFileRequest.
     *
     * @param fileId A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files.
     * @param chunkingStrategy chunkingStrategy
     */
    public CreateVectorStoreFileRequest(
        String fileId, 
        ChunkingStrategyRequestParam chunkingStrategy
    ) {
        this.fileId = fileId;
        this.chunkingStrategy = chunkingStrategy;
    }



    /**
     * A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
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
        sb.append("class CreateVectorStoreFileRequest {\n");
        
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
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

