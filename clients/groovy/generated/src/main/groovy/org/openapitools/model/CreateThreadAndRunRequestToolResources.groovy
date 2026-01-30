package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssistantObjectToolResourcesFileSearch;
import org.openapitools.model.CreateAssistantRequestToolResourcesCodeInterpreter;

@Canonical
class CreateThreadAndRunRequestToolResources {
    
    CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter
    
    AssistantObjectToolResourcesFileSearch fileSearch
}
