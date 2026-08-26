package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AssistantObjectToolResourcesFileSearch   {

    private List<String> vectorStoreIds = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AssistantObjectToolResourcesFileSearch() {
    // JSON-B / Jackson
    }

    /**
     * Create AssistantObjectToolResourcesFileSearch.
     *
     * @param vectorStoreIds The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
     */
    public AssistantObjectToolResourcesFileSearch(
        List<String> vectorStoreIds
    ) {
        this.vectorStoreIds = vectorStoreIds;
    }



    /**
     * The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
     * @return vectorStoreIds
     */
    public List<String> getVectorStoreIds() {
        return vectorStoreIds;
    }

    public void setVectorStoreIds(List<String> vectorStoreIds) {
        this.vectorStoreIds = vectorStoreIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistantObjectToolResourcesFileSearch {\n");
        
        sb.append("    vectorStoreIds: ").append(toIndentedString(vectorStoreIds)).append("\n");
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

