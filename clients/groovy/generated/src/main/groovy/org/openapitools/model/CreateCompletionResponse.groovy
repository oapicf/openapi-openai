package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CreateCompletionResponseChoicesInner;
import org.openapitools.model.CreateCompletionResponseUsage;

@Canonical
class CreateCompletionResponse {
    
    String id
    
    String _object
    
    Integer created
    
    String model
    
    List<CreateCompletionResponseChoicesInner> choices = new ArrayList<>()
    
    CreateCompletionResponseUsage usage
}
