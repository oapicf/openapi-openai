package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Options for streaming response. Only set this when you set `stream: true`. 
 */
public class ChatCompletionStreamOptions   {

    private Boolean includeUsage;

    /**
     * Default constructor.
     */
    public ChatCompletionStreamOptions() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionStreamOptions.
     *
     * @param includeUsage If set, an additional chunk will be streamed before the &#x60;data: [DONE]&#x60; message. The &#x60;usage&#x60; field on this chunk shows the token usage statistics for the entire request, and the &#x60;choices&#x60; field will always be an empty array. All other chunks will also include a &#x60;usage&#x60; field, but with a null value. 
     */
    public ChatCompletionStreamOptions(
        Boolean includeUsage
    ) {
        this.includeUsage = includeUsage;
    }



    /**
     * If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. 
     * @return includeUsage
     */
    public Boolean getIncludeUsage() {
        return includeUsage;
    }

    public void setIncludeUsage(Boolean includeUsage) {
        this.includeUsage = includeUsage;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionStreamOptions {\n");
        
        sb.append("    includeUsage: ").append(toIndentedString(includeUsage)).append("\n");
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

