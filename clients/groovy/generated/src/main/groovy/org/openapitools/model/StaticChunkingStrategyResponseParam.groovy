package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.StaticChunkingStrategy;

@Canonical
class StaticChunkingStrategyResponseParam {

    enum TypeEnum {
    
        STATIC("static")
    
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

    /* Always `static`. */
    TypeEnum type
    
    StaticChunkingStrategy _static
}
