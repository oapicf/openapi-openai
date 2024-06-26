/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { ChatCompletionMessageToolCall } from '../models/ChatCompletionMessageToolCall';
import { ChatCompletionRequestAssistantMessage } from '../models/ChatCompletionRequestAssistantMessage';
import { ChatCompletionRequestAssistantMessageFunctionCall } from '../models/ChatCompletionRequestAssistantMessageFunctionCall';
import { ChatCompletionRequestFunctionMessage } from '../models/ChatCompletionRequestFunctionMessage';
import { ChatCompletionRequestSystemMessage } from '../models/ChatCompletionRequestSystemMessage';
import { ChatCompletionRequestToolMessage } from '../models/ChatCompletionRequestToolMessage';
import { ChatCompletionRequestUserMessage } from '../models/ChatCompletionRequestUserMessage';
import { HttpFile } from '../http/http';

export class ChatCompletionRequestMessage {
    /**
    * The contents of the function message.
    */
    'content': string | null;
    /**
    * The role of the messages author, in this case `function`.
    */
    'role': ChatCompletionRequestMessageRoleEnum;
    /**
    * The name of the function to call.
    */
    'name': string;
    /**
    * The tool calls generated by the model, such as function calls.
    */
    'toolCalls'?: Array<ChatCompletionMessageToolCall>;
    'functionCall'?: ChatCompletionRequestAssistantMessageFunctionCall;
    /**
    * Tool call that this message is responding to.
    */
    'toolCallId': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "content",
            "baseName": "content",
            "type": "string",
            "format": ""
        },
        {
            "name": "role",
            "baseName": "role",
            "type": "ChatCompletionRequestMessageRoleEnum",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "toolCalls",
            "baseName": "tool_calls",
            "type": "Array<ChatCompletionMessageToolCall>",
            "format": ""
        },
        {
            "name": "functionCall",
            "baseName": "function_call",
            "type": "ChatCompletionRequestAssistantMessageFunctionCall",
            "format": ""
        },
        {
            "name": "toolCallId",
            "baseName": "tool_call_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ChatCompletionRequestMessage.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum ChatCompletionRequestMessageRoleEnum {
    Function = 'function'
}

