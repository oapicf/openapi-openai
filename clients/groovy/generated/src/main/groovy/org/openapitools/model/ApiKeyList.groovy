package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AdminApiKey;

@Canonical
class ApiKeyList {
    
    String _object
    
    List<AdminApiKey> data = new ArrayList<>()
    
    Boolean hasMore
    
    String firstId
    
    String lastId
}
