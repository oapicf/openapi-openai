package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class FineTuningJobEvent {

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

    /* The object type, which is always \"fine_tuning.job.event\". */
    ObjectEnum _object
    /* The object identifier. */
    String id
    /* The Unix timestamp (in seconds) for when the fine-tuning job was created. */
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

    /* The log level of the event. */
    LevelEnum level
    /* The message of the event. */
    String message

    enum TypeEnum {
    
        MESSAGE("message"),
        
        METRICS("metrics")
    
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

    /* The type of event. */
    TypeEnum type
    /* The data associated with the event. */
    Object data
}
