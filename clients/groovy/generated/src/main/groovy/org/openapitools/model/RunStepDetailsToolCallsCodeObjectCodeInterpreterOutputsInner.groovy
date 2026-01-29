package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputImageObject;
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputImageObjectImage;
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputLogsObject;

@Canonical
class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {

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
    
    RunStepDetailsToolCallsCodeOutputImageObjectImage image
}
