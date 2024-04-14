/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { ChatCompletionRequestMessageFunctionCall } from '../models/ChatCompletionRequestMessageFunctionCall';
import { HttpFile } from '../http/http';

export class ChatCompletionResponseMessage {
    /**
    * The role of the author of this message.
    */
    'role': ChatCompletionResponseMessageRoleEnum;
    /**
    * The contents of the message.
    */
    'content'?: string | null;
    'functionCall'?: ChatCompletionRequestMessageFunctionCall;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "role",
            "baseName": "role",
            "type": "ChatCompletionResponseMessageRoleEnum",
            "format": ""
        },
        {
            "name": "content",
            "baseName": "content",
            "type": "string",
            "format": ""
        },
        {
            "name": "functionCall",
            "baseName": "function_call",
            "type": "ChatCompletionRequestMessageFunctionCall",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ChatCompletionResponseMessage.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum ChatCompletionResponseMessageRoleEnum {
    System = 'system',
    User = 'user',
    Assistant = 'assistant',
    Function = 'function'
}
