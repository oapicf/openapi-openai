package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.RealtimeResponseUsageInputTokenDetails;
import org.openapitools.server.model.RealtimeResponseUsageOutputTokenDetails;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
 */
public class RealtimeResponseUsage   {

    private Integer totalTokens;
    private Integer inputTokens;
    private Integer outputTokens;
    private RealtimeResponseUsageInputTokenDetails inputTokenDetails;
    private RealtimeResponseUsageOutputTokenDetails outputTokenDetails;

    /**
     * Default constructor.
     */
    public RealtimeResponseUsage() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeResponseUsage.
     *
     * @param totalTokens The total number of tokens in the Response including input and output  text and audio tokens. 
     * @param inputTokens The number of input tokens used in the Response, including text and  audio tokens. 
     * @param outputTokens The number of output tokens sent in the Response, including text and  audio tokens. 
     * @param inputTokenDetails inputTokenDetails
     * @param outputTokenDetails outputTokenDetails
     */
    public RealtimeResponseUsage(
        Integer totalTokens, 
        Integer inputTokens, 
        Integer outputTokens, 
        RealtimeResponseUsageInputTokenDetails inputTokenDetails, 
        RealtimeResponseUsageOutputTokenDetails outputTokenDetails
    ) {
        this.totalTokens = totalTokens;
        this.inputTokens = inputTokens;
        this.outputTokens = outputTokens;
        this.inputTokenDetails = inputTokenDetails;
        this.outputTokenDetails = outputTokenDetails;
    }



    /**
     * The total number of tokens in the Response including input and output  text and audio tokens. 
     * @return totalTokens
     */
    public Integer getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(Integer totalTokens) {
        this.totalTokens = totalTokens;
    }

    /**
     * The number of input tokens used in the Response, including text and  audio tokens. 
     * @return inputTokens
     */
    public Integer getInputTokens() {
        return inputTokens;
    }

    public void setInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens;
    }

    /**
     * The number of output tokens sent in the Response, including text and  audio tokens. 
     * @return outputTokens
     */
    public Integer getOutputTokens() {
        return outputTokens;
    }

    public void setOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens;
    }

    /**
     * Get inputTokenDetails
     * @return inputTokenDetails
     */
    public RealtimeResponseUsageInputTokenDetails getInputTokenDetails() {
        return inputTokenDetails;
    }

    public void setInputTokenDetails(RealtimeResponseUsageInputTokenDetails inputTokenDetails) {
        this.inputTokenDetails = inputTokenDetails;
    }

    /**
     * Get outputTokenDetails
     * @return outputTokenDetails
     */
    public RealtimeResponseUsageOutputTokenDetails getOutputTokenDetails() {
        return outputTokenDetails;
    }

    public void setOutputTokenDetails(RealtimeResponseUsageOutputTokenDetails outputTokenDetails) {
        this.outputTokenDetails = outputTokenDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeResponseUsage {\n");
        
        sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
        sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
        sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
        sb.append("    inputTokenDetails: ").append(toIndentedString(inputTokenDetails)).append("\n");
        sb.append("    outputTokenDetails: ").append(toIndentedString(outputTokenDetails)).append("\n");
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

