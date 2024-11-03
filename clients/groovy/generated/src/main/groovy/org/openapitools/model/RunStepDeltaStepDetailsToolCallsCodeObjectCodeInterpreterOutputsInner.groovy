package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObject;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject;

@Canonical
class RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
    /* The index of the output in the outputs array. */
    Integer index

    enum TypeEnum {
    
        LOGS("logs"),
        
        IMAGE("image")
    
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

    /* Always `logs`. */
    TypeEnum type
    /* The text output from the Code Interpreter tool call. */
    String logs
    
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image
}
