package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RunStepDeltaStepDetailsToolCallsFileSearchObject {
    /* The index of the tool call in the tool calls array. */
    Integer index
    /* The ID of the tool call object. */
    String id

    enum TypeEnum {
    
        FILE_SEARCH("file_search")
    
        private final String value
    
        TypeEnum(String value) {
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

    /* The type of tool call. This is always going to be `file_search` for this type of tool call. */
    TypeEnum type
    /* For now, this is always going to be an empty object. */
    Object fileSearch
}
