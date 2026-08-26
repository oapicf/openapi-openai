package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ModifyThreadRequestToolResources;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ModifyThreadRequest   {

    private ModifyThreadRequestToolResources toolResources;
    private Object metadata;

    /**
     * Default constructor.
     */
    public ModifyThreadRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create ModifyThreadRequest.
     *
     * @param toolResources toolResources
     * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     */
    public ModifyThreadRequest(
        ModifyThreadRequestToolResources toolResources, 
        Object metadata
    ) {
        this.toolResources = toolResources;
        this.metadata = metadata;
    }



    /**
     * Get toolResources
     * @return toolResources
     */
    public ModifyThreadRequestToolResources getToolResources() {
        return toolResources;
    }

    public void setToolResources(ModifyThreadRequestToolResources toolResources) {
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
        sb.append("class ModifyThreadRequest {\n");
        
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

