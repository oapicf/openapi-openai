package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionMessageToolCall;
import org.openapitools.model.ChatCompletionRequestAssistantMessageFunctionCall;

@Canonical
class ChatCompletionRequestAssistantMessage {
    /* The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified.  */
    String content

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

    /* The role of the messages author, in this case `assistant`. */
    RoleEnum role
    /* An optional name for the participant. Provides the model information to differentiate between participants of the same role. */
    String name
    /* The tool calls generated by the model, such as function calls. */
    List<ChatCompletionMessageToolCall> toolCalls = new ArrayList<>()
    
    ChatCompletionRequestAssistantMessageFunctionCall functionCall
}
