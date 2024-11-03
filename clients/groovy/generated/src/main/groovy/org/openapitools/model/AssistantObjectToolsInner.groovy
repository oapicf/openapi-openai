package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AssistantToolsCode;
import org.openapitools.model.AssistantToolsFunction;
import org.openapitools.model.AssistantToolsRetrieval;
import org.openapitools.model.FunctionObject;

@Canonical
class AssistantObjectToolsInner {

    enum TypeEnum {
    
        CODE_INTERPRETER("code_interpreter"),
        
        RETRIEVAL("retrieval"),
        
        FUNCTION("function")
    
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

    /* The type of tool being defined: `code_interpreter` */
    TypeEnum type
    
    FunctionObject function
}
