package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;

@Canonical
class RunStepDeltaStepDetailsToolCallsCodeObject {
    /* The index of the tool call in the tool calls array. */
    Integer index
    /* The ID of the tool call. */
    String id

    enum TypeEnum {
    
        CODE_INTERPRETER("code_interpreter")
    
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

    /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
    TypeEnum type
    
    RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter
}
