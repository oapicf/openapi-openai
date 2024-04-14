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

import { ChatCompletionMessageToolCallChunkFunction } from '../models/ChatCompletionMessageToolCallChunkFunction';
import { HttpFile } from '../http/http';

export class ChatCompletionMessageToolCallChunk {
    'index': number;
    /**
    * The ID of the tool call.
    */
    'id'?: string;
    /**
    * The type of the tool. Currently, only `function` is supported.
    */
    'type'?: ChatCompletionMessageToolCallChunkTypeEnum;
    '_function'?: ChatCompletionMessageToolCallChunkFunction;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "index",
            "baseName": "index",
            "type": "number",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "ChatCompletionMessageToolCallChunkTypeEnum",
            "format": ""
        },
        {
            "name": "_function",
            "baseName": "function",
            "type": "ChatCompletionMessageToolCallChunkFunction",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ChatCompletionMessageToolCallChunk.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum ChatCompletionMessageToolCallChunkTypeEnum {
    Function = 'function'
}

