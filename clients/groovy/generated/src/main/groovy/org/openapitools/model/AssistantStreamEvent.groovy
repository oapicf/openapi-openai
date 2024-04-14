package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DoneEvent;
import org.openapitools.model.ErrorEvent;
import org.openapitools.model.MessageStreamEvent;
import org.openapitools.model.RunStepStreamEvent;
import org.openapitools.model.RunStreamEvent;
import org.openapitools.model.ThreadStreamEvent;

@Canonical
class AssistantStreamEvent {

    enum EventEnum {
    
        DONE("done")
    
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

    enum DataEnum {
    
        _DONE_("[DONE]")
    
        private final String value
    
        DataEnum(String value) {
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

    
    DataEnum data
}
