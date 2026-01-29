package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.MessageFileObject;

@Canonical
class ListMessageFilesResponse {
    
    String _object
    
    List<MessageFileObject> data = new ArrayList<>()
    
    String firstId
    
    String lastId
    
    Boolean hasMore
}
