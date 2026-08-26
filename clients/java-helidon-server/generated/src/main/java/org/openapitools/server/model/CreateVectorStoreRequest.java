package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CreateVectorStoreRequestChunkingStrategy;
import org.openapitools.server.model.VectorStoreExpirationAfter;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateVectorStoreRequest   {

    private List<String> fileIds = new ArrayList<>();
    private String name;
    private VectorStoreExpirationAfter expiresAfter;
    private CreateVectorStoreRequestChunkingStrategy chunkingStrategy;
    private Object metadata;

    /**
     * Default constructor.
     */
    public CreateVectorStoreRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateVectorStoreRequest.
     *
     * @param fileIds A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files.
     * @param name The name of the vector store.
     * @param expiresAfter expiresAfter
     * @param chunkingStrategy chunkingStrategy
     * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     */
    public CreateVectorStoreRequest(
        List<String> fileIds, 
        String name, 
        VectorStoreExpirationAfter expiresAfter, 
        CreateVectorStoreRequestChunkingStrategy chunkingStrategy, 
        Object metadata
    ) {
        this.fileIds = fileIds;
        this.name = name;
        this.expiresAfter = expiresAfter;
        this.chunkingStrategy = chunkingStrategy;
        this.metadata = metadata;
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
     * The name of the vector store.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get expiresAfter
     * @return expiresAfter
     */
    public VectorStoreExpirationAfter getExpiresAfter() {
        return expiresAfter;
    }

    public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
        this.expiresAfter = expiresAfter;
    }

    /**
     * Get chunkingStrategy
     * @return chunkingStrategy
     */
    public CreateVectorStoreRequestChunkingStrategy getChunkingStrategy() {
        return chunkingStrategy;
    }

    public void setChunkingStrategy(CreateVectorStoreRequestChunkingStrategy chunkingStrategy) {
        this.chunkingStrategy = chunkingStrategy;
    }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
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
        sb.append("class CreateVectorStoreRequest {\n");
        
        sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    expiresAfter: ").append(toIndentedString(expiresAfter)).append("\n");
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

