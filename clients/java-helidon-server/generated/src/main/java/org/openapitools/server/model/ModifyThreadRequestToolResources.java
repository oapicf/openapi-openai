package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.CreateAssistantRequestToolResourcesCodeInterpreter;
import org.openapitools.server.model.ModifyThreadRequestToolResourcesFileSearch;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 */
public class ModifyThreadRequestToolResources   {

    private CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter;
    private ModifyThreadRequestToolResourcesFileSearch fileSearch;

    /**
     * Default constructor.
     */
    public ModifyThreadRequestToolResources() {
    // JSON-B / Jackson
    }

    /**
     * Create ModifyThreadRequestToolResources.
     *
     * @param codeInterpreter codeInterpreter
     * @param fileSearch fileSearch
     */
    public ModifyThreadRequestToolResources(
        CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter, 
        ModifyThreadRequestToolResourcesFileSearch fileSearch
    ) {
        this.codeInterpreter = codeInterpreter;
        this.fileSearch = fileSearch;
    }



    /**
     * Get codeInterpreter
     * @return codeInterpreter
     */
    public CreateAssistantRequestToolResourcesCodeInterpreter getCodeInterpreter() {
        return codeInterpreter;
    }

    public void setCodeInterpreter(CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
        this.codeInterpreter = codeInterpreter;
    }

    /**
     * Get fileSearch
     * @return fileSearch
     */
    public ModifyThreadRequestToolResourcesFileSearch getFileSearch() {
        return fileSearch;
    }

    public void setFileSearch(ModifyThreadRequestToolResourcesFileSearch fileSearch) {
        this.fileSearch = fileSearch;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyThreadRequestToolResources {\n");
        
        sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
        sb.append("    fileSearch: ").append(toIndentedString(fileSearch)).append("\n");
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

