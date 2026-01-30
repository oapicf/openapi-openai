package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@Canonical
class FileSearchRankingOptions {

    enum RankerEnum {
    
        AUTO("auto"),
        
        DEFAULT_2024_08_21("default_2024_08_21")
    
        private final String value
    
        RankerEnum(String value) {
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

    /* The ranker to use for the file search. If not specified will use the `auto` ranker. */
    RankerEnum ranker
    /* The score threshold for the file search. All values must be a floating point number between 0 and 1. */
    BigDecimal scoreThreshold
}
