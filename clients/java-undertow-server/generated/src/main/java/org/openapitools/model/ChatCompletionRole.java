/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * The role of the author of a message
 */

/**
 * The role of the author of a message
 */
public enum ChatCompletionRole {
    
        SYSTEM("system"),
        
        USER("user"),
        
        ASSISTANT("assistant"),
        
        TOOL("tool"),
        
        FUNCTION("function");

private String value;

ChatCompletionRole(String value) {
this.value = value;
}

@Override
@JsonValue
public String toString() {
return String.valueOf(value);
}

@JsonCreator
public static ChatCompletionRole fromValue(String text) {
for (ChatCompletionRole b : ChatCompletionRole.values()) {
if (String.valueOf(b.value).equals(text)) {
return b;
}
}
throw new IllegalArgumentException("Unexpected value '" + text + "'");
}
}


