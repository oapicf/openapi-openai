package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
 */
public class CreateChatCompletionStreamResponseUsage   {

    private Integer completionTokens;
    private Integer promptTokens;
    private Integer totalTokens;

    /**
     * Default constructor.
     */
    public CreateChatCompletionStreamResponseUsage() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateChatCompletionStreamResponseUsage.
     *
     * @param completionTokens Number of tokens in the generated completion.
     * @param promptTokens Number of tokens in the prompt.
     * @param totalTokens Total number of tokens used in the request (prompt + completion).
     */
    public CreateChatCompletionStreamResponseUsage(
        Integer completionTokens, 
        Integer promptTokens, 
        Integer totalTokens
    ) {
        this.completionTokens = completionTokens;
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
    }



    /**
     * Number of tokens in the generated completion.
     * @return completionTokens
     */
    public Integer getCompletionTokens() {
        return completionTokens;
    }

    public void setCompletionTokens(Integer completionTokens) {
        this.completionTokens = completionTokens;
    }

    /**
     * Number of tokens in the prompt.
     * @return promptTokens
     */
    public Integer getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(Integer promptTokens) {
        this.promptTokens = promptTokens;
    }

    /**
     * Total number of tokens used in the request (prompt + completion).
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
        sb.append("class CreateChatCompletionStreamResponseUsage {\n");
        
        sb.append("    completionTokens: ").append(toIndentedString(completionTokens)).append("\n");
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

