package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AssistantObjectToolsInner;

@Canonical
class AssistantObject {
    /* The identifier, which can be referenced in API endpoints. */
    String id

    enum ObjectEnum {
    
        ASSISTANT("assistant")
    
        private final String value
    
        ObjectEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The object type, which is always `assistant`. */
    ObjectEnum _object
    /* The Unix timestamp (in seconds) for when the assistant was created. */
    Integer createdAt
    /* The name of the assistant. The maximum length is 256 characters.  */
    String name
    /* The description of the assistant. The maximum length is 512 characters.  */
    String description
    /* ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.  */
    String model
    /* The system instructions that the assistant uses. The maximum length is 256,000 characters.  */
    String instructions
    /* A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.  */
    List<AssistantObjectToolsInner> tools = new ArrayList<>()
    /* A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.  */
    List<String> fileIds = new ArrayList<>()
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    Object metadata
}
