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

import { HttpFile } from '../http/http';

export class ChatCompletionRequestFunctionMessage {
    /**
    * The role of the messages author, in this case `function`.
    */
    'role': ChatCompletionRequestFunctionMessageRoleEnum;
    /**
    * The contents of the function message.
    */
    'content': string | null;
    /**
    * The name of the function to call.
    */
    'name': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "role",
            "baseName": "role",
            "type": "ChatCompletionRequestFunctionMessageRoleEnum",
            "format": ""
        },
        {
            "name": "content",
            "baseName": "content",
            "type": "string",
            "format": ""
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ChatCompletionRequestFunctionMessage.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum ChatCompletionRequestFunctionMessageRoleEnum {
    Function = 'function'
}

