package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDetailsToolCallsCodeObject;
import org.openapitools.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter;
import org.openapitools.model.RunStepDetailsToolCallsFunctionObject;
import org.openapitools.model.RunStepDetailsToolCallsFunctionObjectFunction;
import org.openapitools.model.RunStepDetailsToolCallsRetrievalObject;

@Canonical
class RunStepDetailsToolCallsObjectToolCallsInner {
    /* The ID of the tool call object. */
    String id

    enum TypeEnum {
    
        CODE_INTERPRETER("code_interpreter"),
        
        RETRIEVAL("retrieval"),
        
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
    
    RunStepDetailsToolCallsCodeObjectCodeInterpreter codeInterpreter
    /* For now, this is always going to be an empty object. */
    Object retrieval
    
    RunStepDetailsToolCallsFunctionObjectFunction function
}
