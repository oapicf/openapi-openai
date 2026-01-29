package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunObjectRequiredActionSubmitToolOutputs;

@Canonical
class RunObjectRequiredAction {

    enum TypeEnum {
    
        SUBMIT_TOOL_OUTPUTS("submit_tool_outputs")
    
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

    /* For now, this is always `submit_tool_outputs`. */
    TypeEnum type
    
    RunObjectRequiredActionSubmitToolOutputs submitToolOutputs
}
