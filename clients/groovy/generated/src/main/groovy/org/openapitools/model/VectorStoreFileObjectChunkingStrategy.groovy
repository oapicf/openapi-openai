package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OtherChunkingStrategyResponseParam;
import org.openapitools.model.StaticChunkingStrategy;
import org.openapitools.model.StaticChunkingStrategyResponseParam;

@Canonical
class VectorStoreFileObjectChunkingStrategy {

    enum TypeEnum {
    
        STATIC("static"),
        
        OTHER("other")
    
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
