package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunObject;

@Canonical
class RunStreamEventOneOf5 {

    enum EventEnum {
    
        THREAD_RUN_INCOMPLETE("thread.run.incomplete")
    
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
    
    RunObject data
}
