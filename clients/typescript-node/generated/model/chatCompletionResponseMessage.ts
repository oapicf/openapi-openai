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

/**
* A chat completion message generated by the model.
*/
export class ChatCompletionResponseMessage {
    /**
    * The contents of the message.
    */
    'content': string | null;
    /**
    * The tool calls generated by the model, such as function calls.
    */
    'toolCalls'?: Array<ChatCompletionMessageToolCall>;
    /**
    * The role of the author of this message.
    */
    'role': ChatCompletionResponseMessage.RoleEnum;
    'functionCall'?: ChatCompletionRequestAssistantMessageFunctionCall;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "content",
            "baseName": "content",
            "type": "string"
        },
        {
            "name": "toolCalls",
            "baseName": "tool_calls",
            "type": "Array<ChatCompletionMessageToolCall>"
        },
        {
            "name": "role",
            "baseName": "role",
            "type": "ChatCompletionResponseMessage.RoleEnum"
        },
        {
            "name": "functionCall",
            "baseName": "function_call",
            "type": "ChatCompletionRequestAssistantMessageFunctionCall"
        }    ];

    static getAttributeTypeMap() {
        return ChatCompletionResponseMessage.attributeTypeMap;
    }
}

export namespace ChatCompletionResponseMessage {
    export enum RoleEnum {
        Assistant = <any> 'assistant'
    }
}