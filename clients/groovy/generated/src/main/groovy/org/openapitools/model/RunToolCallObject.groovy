package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunToolCallObjectFunction;

@Canonical
class RunToolCallObject {
    /* The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. */
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

    /* The type of tool call the output is required for. For now, this is always `function`. */
    TypeEnum type
    
    RunToolCallObjectFunction function
}
