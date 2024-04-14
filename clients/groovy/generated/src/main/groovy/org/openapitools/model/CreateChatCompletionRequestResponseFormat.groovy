package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CreateChatCompletionRequestResponseFormat {

    enum TypeEnum {
    
        TEXT("text"),
        
        JSON_OBJECT("json_object")
    
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

    /* Must be one of `text` or `json_object`. */
    TypeEnum type = TypeEnum.TEXT
}
