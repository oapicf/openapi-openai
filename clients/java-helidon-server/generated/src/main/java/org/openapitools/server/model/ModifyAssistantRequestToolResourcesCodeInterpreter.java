package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ModifyAssistantRequestToolResourcesCodeInterpreter   {

    private List<String> fileIds = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ModifyAssistantRequestToolResourcesCodeInterpreter() {
    // JSON-B / Jackson
    }

    /**
     * Create ModifyAssistantRequestToolResourcesCodeInterpreter.
     *
     * @param fileIds Overrides the list of [file](/docs/api-reference/files) IDs made available to the &#x60;code_interpreter&#x60; tool. There can be a maximum of 20 files associated with the tool. 
     */
    public ModifyAssistantRequestToolResourcesCodeInterpreter(
        List<String> fileIds
    ) {
        this.fileIds = fileIds;
    }



    /**
     * Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
     * @return fileIds
     */
    public List<String> getFileIds() {
        return fileIds;
    }

    public void setFileIds(List<String> fileIds) {
        this.fileIds = fileIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyAssistantRequestToolResourcesCodeInterpreter {\n");
        
        sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
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

