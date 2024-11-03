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
import { ChatCompletionMessageToolCallFunction } from './chatCompletionMessageToolCallFunction';

export class ChatCompletionMessageToolCall {
    /**
    * The ID of the tool call.
    */
    'id': string;
    /**
    * The type of the tool. Currently, only `function` is supported.
    */
    'type': ChatCompletionMessageToolCall.TypeEnum;
    '_function': ChatCompletionMessageToolCallFunction;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "ChatCompletionMessageToolCall.TypeEnum"
        },
        {
            "name": "_function",
            "baseName": "function",
            "type": "ChatCompletionMessageToolCallFunction"
        }    ];

    static getAttributeTypeMap() {
        return ChatCompletionMessageToolCall.attributeTypeMap;
    }
}

export namespace ChatCompletionMessageToolCall {
    export enum TypeEnum {
        Function = <any> 'function'
    }
}
