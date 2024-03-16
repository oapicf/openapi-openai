package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CreateModerationResponseResultsInner;

@Canonical
class CreateModerationResponse {
    
    String id
    
    String model
    
    List<CreateModerationResponseResultsInner> results = new ArrayList<>()
}
