package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Breakdown of tokens used in the prompt.
 */
public class CompletionUsagePromptTokensDetails   {

    private Integer audioTokens;
    private Integer cachedTokens;

    /**
     * Default constructor.
     */
    public CompletionUsagePromptTokensDetails() {
    // JSON-B / Jackson
    }

    /**
     * Create CompletionUsagePromptTokensDetails.
     *
     * @param audioTokens Audio input tokens present in the prompt.
     * @param cachedTokens Cached tokens present in the prompt.
     */
    public CompletionUsagePromptTokensDetails(
        Integer audioTokens, 
        Integer cachedTokens
    ) {
        this.audioTokens = audioTokens;
        this.cachedTokens = cachedTokens;
    }



    /**
     * Audio input tokens present in the prompt.
     * @return audioTokens
     */
    public Integer getAudioTokens() {
        return audioTokens;
    }

    public void setAudioTokens(Integer audioTokens) {
        this.audioTokens = audioTokens;
    }

    /**
     * Cached tokens present in the prompt.
     * @return cachedTokens
     */
    public Integer getCachedTokens() {
        return cachedTokens;
    }

    public void setCachedTokens(Integer cachedTokens) {
        this.cachedTokens = cachedTokens;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompletionUsagePromptTokensDetails {\n");
        
        sb.append("    audioTokens: ").append(toIndentedString(audioTokens)).append("\n");
        sb.append("    cachedTokens: ").append(toIndentedString(cachedTokens)).append("\n");
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

