package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PredictionContentContent;

@Canonical
class PredictionContent {

    enum TypeEnum {
    
        CONTENT("content")
    
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

    /* The type of the predicted content you want to provide. This type is currently always `content`.  */
    TypeEnum type
    
    PredictionContentContent content
}
