package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class FineTuningJobEvent {
    
    String id
    
    Integer createdAt

    enum LevelEnum {
    
        INFO("info"),
        
        WARN("warn"),
        
        ERROR("error")
    
        private final String value
    
        LevelEnum(String value) {
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

    
    LevelEnum level
    
    String message

    enum ObjectEnum {
    
        FINE_TUNING_JOB_EVENT("fine_tuning.job.event")
    
        private final String value
    
        ObjectEnum(String value) {
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

    
    ObjectEnum _object
}
