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

import { ChatCompletionStreamResponseDelta } from '../models/ChatCompletionStreamResponseDelta';
import { HttpFile } from '../http/http';

export class CreateChatCompletionStreamResponseChoicesInner {
    'index'?: number;
    'delta'?: ChatCompletionStreamResponseDelta;
    'finishReason'?: CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "index",
            "baseName": "index",
            "type": "number",
            "format": ""
        },
        {
            "name": "delta",
            "baseName": "delta",
            "type": "ChatCompletionStreamResponseDelta",
            "format": ""
        },
        {
            "name": "finishReason",
            "baseName": "finish_reason",
            "type": "CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateChatCompletionStreamResponseChoicesInner.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum {
    Stop = 'stop',
    Length = 'length',
    FunctionCall = 'function_call'
}
