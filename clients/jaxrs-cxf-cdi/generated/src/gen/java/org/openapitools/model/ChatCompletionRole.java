package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The role of the author of a message
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ChatCompletionRole {

    @JsonProperty("system") SYSTEM(String.valueOf("system")), @JsonProperty("user") USER(String.valueOf("user")), @JsonProperty("assistant") ASSISTANT(String.valueOf("assistant")), @JsonProperty("tool") TOOL(String.valueOf("tool")), @JsonProperty("function") FUNCTION(String.valueOf("function"));


    private String value;

    ChatCompletionRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ChatCompletionRole fromValue(String value) {
        for (ChatCompletionRole b : ChatCompletionRole.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



