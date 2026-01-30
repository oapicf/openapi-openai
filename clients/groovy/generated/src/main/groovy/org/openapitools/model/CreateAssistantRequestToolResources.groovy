package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateAssistantRequestToolResourcesCodeInterpreter;
import org.openapitools.model.CreateAssistantRequestToolResourcesFileSearch;

@Canonical
class CreateAssistantRequestToolResources {
    
    CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter
    
    CreateAssistantRequestToolResourcesFileSearch fileSearch
}
