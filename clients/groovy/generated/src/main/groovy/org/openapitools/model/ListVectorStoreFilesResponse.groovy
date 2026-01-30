package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.VectorStoreFileObject;

@Canonical
class ListVectorStoreFilesResponse {
    
    String _object
    
    List<VectorStoreFileObject> data = new ArrayList<>()
    
    String firstId
    
    String lastId
    
    Boolean hasMore
}
