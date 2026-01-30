package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OpenAIFile;

@Canonical
class ListFilesResponse {
    
    String _object
    
    List<OpenAIFile> data = new ArrayList<>()
    
    String firstId
    
    String lastId
    
    Boolean hasMore
}
