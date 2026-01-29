package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ChatCompletionRole {

    SYSTEM("system"),
    
    USER("user"),
    
    ASSISTANT("assistant"),
    
    TOOL("tool"),
    
    FUNCTION("function")

    private final String value

    ChatCompletionRole(String value) {
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
