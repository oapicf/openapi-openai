/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';
import { ChatCompletionMessageToolCall } from './chatCompletionMessageToolCall';
import { ChatCompletionRequestAssistantMessageFunctionCall } from './chatCompletionRequestAssistantMessageFunctionCall';

export class ChatCompletionRequestAssistantMessage {
    /**
    * The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
    */
    'content'?: string | null;
    /**
    * The role of the messages author, in this case `assistant`.
    */
    'role': ChatCompletionRequestAssistantMessage.RoleEnum;
    /**
    * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
    */
    'name'?: string;
    /**
    * The tool calls generated by the model, such as function calls.
    */
    'toolCalls'?: Array<ChatCompletionMessageToolCall>;
    'functionCall'?: ChatCompletionRequestAssistantMessageFunctionCall;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "content",
            "baseName": "content",
            "type": "string"
        },
        {
            "name": "role",
            "baseName": "role",
            "type": "ChatCompletionRequestAssistantMessage.RoleEnum"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "toolCalls",
            "baseName": "tool_calls",
            "type": "Array<ChatCompletionMessageToolCall>"
        },
        {
            "name": "functionCall",
            "baseName": "function_call",
            "type": "ChatCompletionRequestAssistantMessageFunctionCall"
        }    ];

    static getAttributeTypeMap() {
        return ChatCompletionRequestAssistantMessage.attributeTypeMap;
    }
}

export namespace ChatCompletionRequestAssistantMessage {
    export enum RoleEnum {
        Assistant = <any> 'assistant'
    }
}