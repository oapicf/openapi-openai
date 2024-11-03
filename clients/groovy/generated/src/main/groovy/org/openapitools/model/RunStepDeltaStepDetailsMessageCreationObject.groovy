package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;

@Canonical
class RunStepDeltaStepDetailsMessageCreationObject {

    enum TypeEnum {
    
        MESSAGE_CREATION("message_creation")
    
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
}
