package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RunObjectIncompleteDetails {

    enum ReasonEnum {
    
        COMPLETION_TOKENS("max_completion_tokens"),
        
        PROMPT_TOKENS("max_prompt_tokens")
    
        private final String value
    
        ReasonEnum(String value) {
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

    /* The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run. */
    ReasonEnum reason
}
