package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import org.openapitools.server.model.ChatCompletionRequestAssistantMessageContentPart;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
 */
public class ChatCompletionRequestAssistantMessageContent   {


    /**
     * Default constructor.
     */
    public ChatCompletionRequestAssistantMessageContent() {
    // JSON-B / Jackson
    }





    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionRequestAssistantMessageContent {\n");
        
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

