package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class ChatCompletionRequestFunctionMessage {

    enum RoleEnum {
    
        FUNCTION("function")
    
        private final String value
    
        RoleEnum(String value) {
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

    /* The role of the messages author, in this case `function`. */
    RoleEnum role
    /* The contents of the function message. */
    String content
    /* The name of the function to call. */
    String name
}
