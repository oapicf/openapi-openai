package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
 */
public class ChatCompletionRequestAssistantMessageAudio   {

    private String id;

    /**
     * Default constructor.
     */
    public ChatCompletionRequestAssistantMessageAudio() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionRequestAssistantMessageAudio.
     *
     * @param id Unique identifier for a previous audio response from the model. 
     */
    public ChatCompletionRequestAssistantMessageAudio(
        String id
    ) {
        this.id = id;
    }



    /**
     * Unique identifier for a previous audio response from the model. 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionRequestAssistantMessageAudio {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

