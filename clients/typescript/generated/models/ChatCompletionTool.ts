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

import { FunctionObject } from '../models/FunctionObject';
import { HttpFile } from '../http/http';

export class ChatCompletionTool {
    /**
    * The type of the tool. Currently, only `function` is supported.
    */
    'type': ChatCompletionToolTypeEnum;
    '_function': FunctionObject;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "ChatCompletionToolTypeEnum",
            "format": ""
        },
        {
            "name": "_function",
            "baseName": "function",
            "type": "FunctionObject",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ChatCompletionTool.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum ChatCompletionToolTypeEnum {
    Function = 'function'
}

