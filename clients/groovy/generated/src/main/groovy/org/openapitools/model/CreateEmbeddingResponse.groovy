package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CreateEmbeddingResponseDataInner;
import org.openapitools.model.CreateEmbeddingResponseUsage;

@Canonical
class CreateEmbeddingResponse {
    
    String _object
    
    String model
    
    List<CreateEmbeddingResponseDataInner> data = new ArrayList<>()
    
    CreateEmbeddingResponseUsage usage
}
