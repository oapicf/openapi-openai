package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class StaticChunkingStrategyStatic   {

    private Integer maxChunkSizeTokens;
    private Integer chunkOverlapTokens;

    /**
     * Default constructor.
     */
    public StaticChunkingStrategyStatic() {
    // JSON-B / Jackson
    }

    /**
     * Create StaticChunkingStrategyStatic.
     *
     * @param maxChunkSizeTokens The maximum number of tokens in each chunk. The default value is &#x60;800&#x60;. The minimum value is &#x60;100&#x60; and the maximum value is &#x60;4096&#x60;.
     * @param chunkOverlapTokens The number of tokens that overlap between chunks. The default value is &#x60;400&#x60;.  Note that the overlap must not exceed half of &#x60;max_chunk_size_tokens&#x60;. 
     */
    public StaticChunkingStrategyStatic(
        Integer maxChunkSizeTokens, 
        Integer chunkOverlapTokens
    ) {
        this.maxChunkSizeTokens = maxChunkSizeTokens;
        this.chunkOverlapTokens = chunkOverlapTokens;
    }



    /**
     * The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
     * minimum: 100
     * maximum: 4096
     * @return maxChunkSizeTokens
     */
    public Integer getMaxChunkSizeTokens() {
        return maxChunkSizeTokens;
    }

    public void setMaxChunkSizeTokens(Integer maxChunkSizeTokens) {
        this.maxChunkSizeTokens = maxChunkSizeTokens;
    }

    /**
     * The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
     * @return chunkOverlapTokens
     */
    public Integer getChunkOverlapTokens() {
        return chunkOverlapTokens;
    }

    public void setChunkOverlapTokens(Integer chunkOverlapTokens) {
        this.chunkOverlapTokens = chunkOverlapTokens;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StaticChunkingStrategyStatic {\n");
        
        sb.append("    maxChunkSizeTokens: ").append(toIndentedString(maxChunkSizeTokens)).append("\n");
        sb.append("    chunkOverlapTokens: ").append(toIndentedString(chunkOverlapTokens)).append("\n");
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

