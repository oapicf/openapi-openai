package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CreateMessageRequest;
import org.openapitools.server.model.CreateThreadRequestToolResources;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateThreadRequest   {

    private List<@Valid CreateMessageRequest> messages = new ArrayList<>();
    private CreateThreadRequestToolResources toolResources;
    private Object metadata;

    /**
     * Default constructor.
     */
    public CreateThreadRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateThreadRequest.
     *
     * @param messages A list of [messages](/docs/api-reference/messages) to start the thread with.
     * @param toolResources toolResources
     * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     */
    public CreateThreadRequest(
        List<@Valid CreateMessageRequest> messages, 
        CreateThreadRequestToolResources toolResources, 
        Object metadata
    ) {
        this.messages = messages;
        this.toolResources = toolResources;
        this.metadata = metadata;
    }



    /**
     * A list of [messages](/docs/api-reference/messages) to start the thread with.
     * @return messages
     */
    public List<@Valid CreateMessageRequest> getMessages() {
        return messages;
    }

    public void setMessages(List<@Valid CreateMessageRequest> messages) {
        this.messages = messages;
    }

    /**
     * Get toolResources
     * @return toolResources
     */
    public CreateThreadRequestToolResources getToolResources() {
        return toolResources;
    }

    public void setToolResources(CreateThreadRequestToolResources toolResources) {
        this.toolResources = toolResources;
    }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateThreadRequest {\n");
        
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    toolResources: ").append(toIndentedString(toolResources)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

