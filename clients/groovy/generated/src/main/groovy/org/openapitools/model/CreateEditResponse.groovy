package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CreateCompletionResponseUsage;
import org.openapitools.model.CreateEditResponseChoicesInner;

@Canonical
class CreateEditResponse {
    
    String _object
    
    Integer created
    
    List<CreateEditResponseChoicesInner> choices = new ArrayList<>()
    
    CreateCompletionResponseUsage usage
}
