package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Details about the output tokens used in the Response.
 */
public class RealtimeResponseUsageOutputTokenDetails   {

    private Integer textTokens;
    private Integer audioTokens;

    /**
     * Default constructor.
     */
    public RealtimeResponseUsageOutputTokenDetails() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeResponseUsageOutputTokenDetails.
     *
     * @param textTokens The number of text tokens used in the Response.
     * @param audioTokens The number of audio tokens used in the Response.
     */
    public RealtimeResponseUsageOutputTokenDetails(
        Integer textTokens, 
        Integer audioTokens
    ) {
        this.textTokens = textTokens;
        this.audioTokens = audioTokens;
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
        sb.append("class RealtimeResponseUsageOutputTokenDetails {\n");
        
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

