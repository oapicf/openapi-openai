package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ModifyThreadRequestToolResourcesFileSearch   {

    private List<String> vectorStoreIds = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ModifyThreadRequestToolResourcesFileSearch() {
    // JSON-B / Jackson
    }

    /**
     * Create ModifyThreadRequestToolResourcesFileSearch.
     *
     * @param vectorStoreIds The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
     */
    public ModifyThreadRequestToolResourcesFileSearch(
        List<String> vectorStoreIds
    ) {
        this.vectorStoreIds = vectorStoreIds;
    }



    /**
     * The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
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
        sb.append("class ModifyThreadRequestToolResourcesFileSearch {\n");
        
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

