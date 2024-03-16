package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CreateModerationResponseResultsInnerCategories {
    
    Boolean hate
    
    Boolean hateThreatening
    
    Boolean selfHarm
    
    Boolean sexual
    
    Boolean sexualMinors
    
    Boolean violence
    
    Boolean violenceGraphic
}
