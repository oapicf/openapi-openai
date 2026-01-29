package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunObject;
import org.openapitools.model.RunStreamEventOneOf;
import org.openapitools.model.RunStreamEventOneOf1;
import org.openapitools.model.RunStreamEventOneOf2;
import org.openapitools.model.RunStreamEventOneOf3;
import org.openapitools.model.RunStreamEventOneOf4;
import org.openapitools.model.RunStreamEventOneOf5;
import org.openapitools.model.RunStreamEventOneOf6;
import org.openapitools.model.RunStreamEventOneOf7;
import org.openapitools.model.RunStreamEventOneOf8;

@Canonical
class RunStreamEvent {

    enum EventEnum {
    
        THREAD_RUN_EXPIRED("thread.run.expired")
    
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
