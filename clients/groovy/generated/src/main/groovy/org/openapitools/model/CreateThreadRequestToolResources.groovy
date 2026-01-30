package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateAssistantRequestToolResourcesCodeInterpreter;
import org.openapitools.model.CreateThreadRequestToolResourcesFileSearch;

@Canonical
class CreateThreadRequestToolResources {
    
    CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter
    
    CreateThreadRequestToolResourcesFileSearch fileSearch
}
