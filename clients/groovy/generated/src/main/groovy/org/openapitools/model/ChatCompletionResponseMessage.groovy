package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ChatCompletionMessageToolCall;
import org.openapitools.model.ChatCompletionRequestAssistantMessageFunctionCall;

@Canonical
class ChatCompletionResponseMessage {
    /* The contents of the message. */
    String content
    /* The tool calls generated by the model, such as function calls. */
    List<ChatCompletionMessageToolCall> toolCalls = new ArrayList<>()

    enum RoleEnum {
    
        ASSISTANT("assistant")
    
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

    /* The role of the author of this message. */
    RoleEnum role
    
    ChatCompletionRequestAssistantMessageFunctionCall functionCall
}
