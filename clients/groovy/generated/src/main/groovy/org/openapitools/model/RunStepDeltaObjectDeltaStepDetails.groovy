package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObject;
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner;

@Canonical
class RunStepDeltaObjectDeltaStepDetails {

    enum TypeEnum {
    
        MESSAGE_CREATION("message_creation"),
        
        TOOL_CALLS("tool_calls")
    
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

    /* Always `message_creation`. */
    TypeEnum type
    
    RunStepDeltaStepDetailsMessageCreationObjectMessageCreation messageCreation
    /* An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`.  */
    List<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner> toolCalls
}
