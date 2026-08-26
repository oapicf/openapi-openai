package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The usage information for the request.
 */
public class CreateEmbeddingResponseUsage   {

    private Integer promptTokens;
    private Integer totalTokens;

    /**
     * Default constructor.
     */
    public CreateEmbeddingResponseUsage() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateEmbeddingResponseUsage.
     *
     * @param promptTokens The number of tokens used by the prompt.
     * @param totalTokens The total number of tokens used by the request.
     */
    public CreateEmbeddingResponseUsage(
        Integer promptTokens, 
        Integer totalTokens
    ) {
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
    }



    /**
     * The number of tokens used by the prompt.
     * @return promptTokens
     */
    public Integer getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(Integer promptTokens) {
        this.promptTokens = promptTokens;
    }

    /**
     * The total number of tokens used by the request.
     * @return totalTokens
     */
    public Integer getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEmbeddingResponseUsage {\n");
        
        sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n");
        sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
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

