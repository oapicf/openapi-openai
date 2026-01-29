package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;

@Canonical
class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject {
    /* The index of the output in the outputs array. */
    Integer index

    enum TypeEnum {
    
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

    /* Always `image`. */
    TypeEnum type
    
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image
}
