package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Details about the input tokens used in the Response.
 */
public class RealtimeResponseUsageInputTokenDetails   {

    private Integer cachedTokens;
    private Integer textTokens;
    private Integer audioTokens;

    /**
     * Default constructor.
     */
    public RealtimeResponseUsageInputTokenDetails() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeResponseUsageInputTokenDetails.
     *
     * @param cachedTokens The number of cached tokens used in the Response.
     * @param textTokens The number of text tokens used in the Response.
     * @param audioTokens The number of audio tokens used in the Response.
     */
    public RealtimeResponseUsageInputTokenDetails(
        Integer cachedTokens, 
        Integer textTokens, 
        Integer audioTokens
    ) {
        this.cachedTokens = cachedTokens;
        this.textTokens = textTokens;
        this.audioTokens = audioTokens;
    }



    /**
     * The number of cached tokens used in the Response.
     * @return cachedTokens
     */
    public Integer getCachedTokens() {
        return cachedTokens;
    }

    public void setCachedTokens(Integer cachedTokens) {
        this.cachedTokens = cachedTokens;
    }

    /**
     * The number of text tokens used in the Response.
     * @return textTokens
     */
    public Integer getTextTokens() {
        return textTokens;
    }

    public void setTextTokens(Integer textTokens) {
        this.textTokens = textTokens;
    }

    /**
     * The number of audio tokens used in the Response.
     * @return audioTokens
     */
    public Integer getAudioTokens() {
        return audioTokens;
    }

    public void setAudioTokens(Integer audioTokens) {
        this.audioTokens = audioTokens;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeResponseUsageInputTokenDetails {\n");
        
        sb.append("    cachedTokens: ").append(toIndentedString(cachedTokens)).append("\n");
        sb.append("    textTokens: ").append(toIndentedString(textTokens)).append("\n");
        sb.append("    audioTokens: ").append(toIndentedString(audioTokens)).append("\n");
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

