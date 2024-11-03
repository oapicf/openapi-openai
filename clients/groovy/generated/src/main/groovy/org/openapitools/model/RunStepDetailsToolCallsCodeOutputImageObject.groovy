package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RunStepDetailsToolCallsCodeOutputImageObjectImage;

@Canonical
class RunStepDetailsToolCallsCodeOutputImageObject {

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
    
    RunStepDetailsToolCallsCodeOutputImageObjectImage image
}
