package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDeltaObject;

@Canonical
class RunStepStreamEventOneOf2 {

    enum EventEnum {
    
        THREAD_RUN_STEP_DELTA("thread.run.step.delta")
    
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
    
    RunStepDeltaObject data
}
