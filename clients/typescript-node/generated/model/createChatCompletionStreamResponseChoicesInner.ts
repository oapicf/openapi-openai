/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';
import { ChatCompletionStreamResponseDelta } from './chatCompletionStreamResponseDelta';

export class CreateChatCompletionStreamResponseChoicesInner {
    'index'?: number;
    'delta'?: ChatCompletionStreamResponseDelta;
    'finishReason'?: CreateChatCompletionStreamResponseChoicesInner.FinishReasonEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "index",
            "baseName": "index",
            "type": "number"
        },
        {
            "name": "delta",
            "baseName": "delta",
            "type": "ChatCompletionStreamResponseDelta"
        },
        {
            "name": "finishReason",
            "baseName": "finish_reason",
            "type": "CreateChatCompletionStreamResponseChoicesInner.FinishReasonEnum"
        }    ];

    static getAttributeTypeMap() {
        return CreateChatCompletionStreamResponseChoicesInner.attributeTypeMap;
    }
}

export namespace CreateChatCompletionStreamResponseChoicesInner {
    export enum FinishReasonEnum {
        Stop = <any> 'stop',
        Length = <any> 'length',
        FunctionCall = <any> 'function_call'
    }
}