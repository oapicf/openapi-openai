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

import { ChatCompletionMessageToolCallFunction } from '../models/ChatCompletionMessageToolCallFunction';
import { HttpFile } from '../http/http';

export class ChatCompletionMessageToolCall {
    /**
    * The ID of the tool call.
    */
    'id': string;
    /**
    * The type of the tool. Currently, only `function` is supported.
    */
    'type': ChatCompletionMessageToolCallTypeEnum;
    '_function': ChatCompletionMessageToolCallFunction;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "ChatCompletionMessageToolCallTypeEnum",
            "format": ""
        },
        {
            "name": "_function",
            "baseName": "function",
            "type": "ChatCompletionMessageToolCallFunction",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ChatCompletionMessageToolCall.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum ChatCompletionMessageToolCallTypeEnum {
    Function = 'function'
}

