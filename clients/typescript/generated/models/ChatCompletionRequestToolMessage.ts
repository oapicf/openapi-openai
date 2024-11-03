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

export class ChatCompletionRequestToolMessage {
    /**
    * The role of the messages author, in this case `tool`.
    */
    'role': ChatCompletionRequestToolMessageRoleEnum;
    /**
    * The contents of the tool message.
    */
    'content': string;
    /**
    * Tool call that this message is responding to.
    */
    'toolCallId': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "role",
            "baseName": "role",
            "type": "ChatCompletionRequestToolMessageRoleEnum",
            "format": ""
        },
        {
            "name": "content",
            "baseName": "content",
            "type": "string",
            "format": ""
        },
        {
            "name": "toolCallId",
            "baseName": "tool_call_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ChatCompletionRequestToolMessage.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum ChatCompletionRequestToolMessageRoleEnum {
    Tool = 'tool'
}

