package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class OpenAIFile {
    
    String id
    
    String _object
    
    Integer bytes
    
    Integer createdAt
    
    String filename
    
    String purpose
    
    String status
    
    Object statusDetails
}
