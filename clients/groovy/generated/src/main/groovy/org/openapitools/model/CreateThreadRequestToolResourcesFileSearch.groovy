package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CreateThreadRequestToolResourcesFileSearchVectorStoresInner;

@Canonical
class CreateThreadRequestToolResourcesFileSearch {
    /* The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.  */
    List<String> vectorStoreIds = new ArrayList<>()
    /* A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread.  */
    List<CreateThreadRequestToolResourcesFileSearchVectorStoresInner> vectorStores = new ArrayList<>()
}
