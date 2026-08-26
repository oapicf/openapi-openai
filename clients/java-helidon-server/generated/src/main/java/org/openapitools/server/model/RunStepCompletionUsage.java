package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
 */
public class RunStepCompletionUsage   {

    private Integer completionTokens;
    private Integer promptTokens;
    private Integer totalTokens;

    /**
     * Default constructor.
     */
    public RunStepCompletionUsage() {
    // JSON-B / Jackson
    }

    /**
     * Create RunStepCompletionUsage.
     *
     * @param completionTokens Number of completion tokens used over the course of the run step.
     * @param promptTokens Number of prompt tokens used over the course of the run step.
     * @param totalTokens Total number of tokens used (prompt + completion).
     */
    public RunStepCompletionUsage(
        Integer completionTokens, 
        Integer promptTokens, 
        Integer totalTokens
    ) {
        this.completionTokens = completionTokens;
        this.promptTokens = promptTokens;
        this.totalTokens = totalTokens;
    }



    /**
     * Number of completion tokens used over the course of the run step.
     * @return completionTokens
     */
    public Integer getCompletionTokens() {
        return completionTokens;
    }

    public void setCompletionTokens(Integer completionTokens) {
        this.completionTokens = completionTokens;
    }

    /**
     * Number of prompt tokens used over the course of the run step.
     * @return promptTokens
     */
    public Integer getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(Integer promptTokens) {
        this.promptTokens = promptTokens;
    }

    /**
     * Total number of tokens used (prompt + completion).
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
        sb.append("class RunStepCompletionUsage {\n");
        
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

