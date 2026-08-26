package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AssistantObjectToolResourcesCodeInterpreter;
import org.openapitools.server.model.AssistantObjectToolResourcesFileSearch;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 */
public class AssistantObjectToolResources   {

    private AssistantObjectToolResourcesCodeInterpreter codeInterpreter;
    private AssistantObjectToolResourcesFileSearch fileSearch;

    /**
     * Default constructor.
     */
    public AssistantObjectToolResources() {
    // JSON-B / Jackson
    }

    /**
     * Create AssistantObjectToolResources.
     *
     * @param codeInterpreter codeInterpreter
     * @param fileSearch fileSearch
     */
    public AssistantObjectToolResources(
        AssistantObjectToolResourcesCodeInterpreter codeInterpreter, 
        AssistantObjectToolResourcesFileSearch fileSearch
    ) {
        this.codeInterpreter = codeInterpreter;
        this.fileSearch = fileSearch;
    }



    /**
     * Get codeInterpreter
     * @return codeInterpreter
     */
    public AssistantObjectToolResourcesCodeInterpreter getCodeInterpreter() {
        return codeInterpreter;
    }

    public void setCodeInterpreter(AssistantObjectToolResourcesCodeInterpreter codeInterpreter) {
        this.codeInterpreter = codeInterpreter;
    }

    /**
     * Get fileSearch
     * @return fileSearch
     */
    public AssistantObjectToolResourcesFileSearch getFileSearch() {
        return fileSearch;
    }

    public void setFileSearch(AssistantObjectToolResourcesFileSearch fileSearch) {
        this.fileSearch = fileSearch;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistantObjectToolResources {\n");
        
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

