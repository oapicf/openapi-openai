package org.openapitools.server.model;

import org.openapitools.server.model.CompletionUsageCompletionTokensDetails;
import org.openapitools.server.model.CompletionUsagePromptTokensDetails;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Usage statistics for the completion request.
 */
public class CompletionUsage   {

    private Integer completionTokens;
    private Integer promptTokens;
    private Integer totalTokens;
    private CompletionUsageCompletionTokensDetails completionTokensDetails;
    private CompletionUsagePromptTokensDetails promptTokensDetails;

    /**
     * Default constructor.
     */
    public CompletionUsage() {
    // JSON-B / Jackson
    }

    /**
     * Create CompletionUsage.
     *
     * @param completionTokens Number of tokens in the generated completion.
     * @param promptTokens Number of tokens in the prompt.
     * @param totalTokens Total number of tokens used in the request (prompt + completion).
     * @param completionTokensDetails completionTokensDetails
     * @param promptTokensDetails promptTokensDetails
     */
    public CompletionUsage(
        Integer completionTokens, 
        Integer promptTokens, 
        Integer totalTokens, 
        CompletionUsageCompletionTokensDetails completionTokensDetails, 
        CompletionUsagePromptTokensDetails promptTokensDetails
    ) {
        this.completionTokens = completionTokens;
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
        this.completionTokensDetails = completionTokensDetails;
        this.promptTokensDetails = promptTokensDetails;
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
     * Get completionTokensDetails
     * @return completionTokensDetails
     */
    public CompletionUsageCompletionTokensDetails getCompletionTokensDetails() {
        return completionTokensDetails;
    }

    public void setCompletionTokensDetails(CompletionUsageCompletionTokensDetails completionTokensDetails) {
        this.completionTokensDetails = completionTokensDetails;
    }

    /**
     * Get promptTokensDetails
     * @return promptTokensDetails
     */
    public CompletionUsagePromptTokensDetails getPromptTokensDetails() {
        return promptTokensDetails;
    }

    public void setPromptTokensDetails(CompletionUsagePromptTokensDetails promptTokensDetails) {
        this.promptTokensDetails = promptTokensDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompletionUsage {\n");
        
        sb.append("    completionTokens: ").append(toIndentedString(completionTokens)).append("\n");
        sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n");
        sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
        sb.append("    completionTokensDetails: ").append(toIndentedString(completionTokensDetails)).append("\n");
        sb.append("    promptTokensDetails: ").append(toIndentedString(promptTokensDetails)).append("\n");
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

