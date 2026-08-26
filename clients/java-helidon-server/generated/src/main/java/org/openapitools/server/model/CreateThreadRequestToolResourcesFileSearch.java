package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CreateThreadRequestToolResourcesFileSearchVectorStoresInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateThreadRequestToolResourcesFileSearch   {

    private List<String> vectorStoreIds = new ArrayList<>();
    private List<@Valid CreateThreadRequestToolResourcesFileSearchVectorStoresInner> vectorStores = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CreateThreadRequestToolResourcesFileSearch() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateThreadRequestToolResourcesFileSearch.
     *
     * @param vectorStoreIds The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
     * @param vectorStores A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
     */
    public CreateThreadRequestToolResourcesFileSearch(
        List<String> vectorStoreIds, 
        List<@Valid CreateThreadRequestToolResourcesFileSearchVectorStoresInner> vectorStores
    ) {
        this.vectorStoreIds = vectorStoreIds;
        this.vectorStores = vectorStores;
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
     * A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
     * @return vectorStores
     */
    public List<@Valid CreateThreadRequestToolResourcesFileSearchVectorStoresInner> getVectorStores() {
        return vectorStores;
    }

    public void setVectorStores(List<@Valid CreateThreadRequestToolResourcesFileSearchVectorStoresInner> vectorStores) {
        this.vectorStores = vectorStores;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateThreadRequestToolResourcesFileSearch {\n");
        
        sb.append("    vectorStoreIds: ").append(toIndentedString(vectorStoreIds)).append("\n");
        sb.append("    vectorStores: ").append(toIndentedString(vectorStores)).append("\n");
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

