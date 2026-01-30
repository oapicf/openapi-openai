package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsFileSearchObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsFunctionObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;

@Canonical
class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {
    /* The index of the tool call in the tool calls array. */
    Integer index
    /* The ID of the tool call object. */
    String id

    enum TypeEnum {
    
        CODE_INTERPRETER("code_interpreter"),
        
        FILE_SEARCH("file_search"),
        
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

    /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
    TypeEnum type
    
    RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter
    /* For now, this is always going to be an empty object. */
    Object fileSearch
    
    RunStepDeltaStepDetailsToolCallsFunctionObjectFunction function
}
