package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepObject;

@Canonical
class RunStepStreamEventOneOf1 {

    enum EventEnum {
    
        THREAD_RUN_STEP_IN_PROGRESS("thread.run.step.in_progress")
    
        private final String value
    
        EventEnum(String value) {
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

    
    EventEnum event
    
    RunStepObject data
}
