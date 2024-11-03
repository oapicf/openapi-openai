package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssistantObjectToolsInner;

@Canonical
class ModifyAssistantRequest {
    
    String model
    /* The name of the assistant. The maximum length is 256 characters.  */
    String name
    /* The description of the assistant. The maximum length is 512 characters.  */
    String description
    /* The system instructions that the assistant uses. The maximum length is 256,000 characters.  */
    String instructions
    /* A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.  */
    List<AssistantObjectToolsInner> tools = new ArrayList<>()
    /* A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant.  */
    List<String> fileIds = new ArrayList<>()
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    Object metadata
}
