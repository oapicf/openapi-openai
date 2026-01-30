package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AutoChunkingStrategyRequestParam;
import org.openapitools.model.StaticChunkingStrategy;
import org.openapitools.model.StaticChunkingStrategyRequestParam;

@Canonical
class ChunkingStrategyRequestParam {

    enum TypeEnum {
    
        AUTO("auto"),
        
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

    /* Always `auto`. */
    TypeEnum type
    
    StaticChunkingStrategy _static
}
