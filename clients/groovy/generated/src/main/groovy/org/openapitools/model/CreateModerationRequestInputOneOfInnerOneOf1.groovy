package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CreateModerationRequestInputOneOfInnerOneOf1 {

    enum TypeEnum {
    
        TEXT("text")
    
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

    /* Always `text`. */
    TypeEnum type
    /* A string of text to classify. */
    String text
}
