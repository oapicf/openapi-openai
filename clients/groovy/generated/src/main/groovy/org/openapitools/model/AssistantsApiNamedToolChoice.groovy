package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChatCompletionNamedToolChoiceFunction;

@Canonical
class AssistantsApiNamedToolChoice {

    enum TypeEnum {
    
        FUNCTION("function"),
        
        CODE_INTERPRETER("code_interpreter"),
        
        RETRIEVAL("retrieval")
    
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

    /* The type of the tool. If type is `function`, the function name must be set */
    TypeEnum type
    
    ChatCompletionNamedToolChoiceFunction function
}
