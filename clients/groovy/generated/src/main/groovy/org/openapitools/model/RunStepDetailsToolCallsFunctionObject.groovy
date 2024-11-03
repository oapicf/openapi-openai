package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDetailsToolCallsFunctionObjectFunction;

@Canonical
class RunStepDetailsToolCallsFunctionObject {
    /* The ID of the tool call object. */
    String id

    enum TypeEnum {
    
        FUNCTION("function")
    
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

    /* The type of tool call. This is always going to be `function` for this type of tool call. */
    TypeEnum type
    
    RunStepDetailsToolCallsFunctionObjectFunction function
}
