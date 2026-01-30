package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInner;

@Canonical
class CreateAssistantRequestToolResourcesFileSearch {
    /* The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  */
    List<String> vectorStoreIds = new ArrayList<>()
    /* A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant.  */
    List<CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> vectorStores = new ArrayList<>()
}
