package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdminApiKeyOwner;

@Canonical
class AdminApiKey {
    
    String _object
    
    String id
    
    String name
    
    String redactedValue
    
    String value
    
    Long createdAt
    
    AdminApiKeyOwner owner
}
