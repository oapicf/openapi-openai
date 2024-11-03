package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.RunObject;

@Canonical
class ListRunsResponse {
    
    String _object
    
    List<RunObject> data = new ArrayList<>()
    
    String firstId
    
    String lastId
    
    Boolean hasMore
}
