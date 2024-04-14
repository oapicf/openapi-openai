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
import { ChatCompletionMessageToolCallChunk } from './chatCompletionMessageToolCallChunk';
import { ChatCompletionStreamResponseDeltaFunctionCall } from './chatCompletionStreamResponseDeltaFunctionCall';

/**
* A chat completion delta generated by streamed model responses.
*/
export class ChatCompletionStreamResponseDelta {
    /**
    * The contents of the chunk message.
    */
    'content'?: string | null;
    'functionCall'?: ChatCompletionStreamResponseDeltaFunctionCall;
    'toolCalls'?: Array<ChatCompletionMessageToolCallChunk>;
    /**
    * The role of the author of this message.
    */
    'role'?: ChatCompletionStreamResponseDelta.RoleEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "content",
            "baseName": "content",
            "type": "string"
        },
        {
            "name": "functionCall",
            "baseName": "function_call",
            "type": "ChatCompletionStreamResponseDeltaFunctionCall"
        },
        {
            "name": "toolCalls",
            "baseName": "tool_calls",
            "type": "Array<ChatCompletionMessageToolCallChunk>"
        },
        {
            "name": "role",
            "baseName": "role",
            "type": "ChatCompletionStreamResponseDelta.RoleEnum"
        }    ];

    static getAttributeTypeMap() {
        return ChatCompletionStreamResponseDelta.attributeTypeMap;
    }
}

export namespace ChatCompletionStreamResponseDelta {
    export enum RoleEnum {
        System = <any> 'system',
        User = <any> 'user',
        Assistant = <any> 'assistant',
        Tool = <any> 'tool'
    }
}
