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
import { CreateCompletionResponseChoicesInnerLogprobs } from './createCompletionResponseChoicesInnerLogprobs';

export class CreateCompletionResponseChoicesInner {
    'text': string;
    'index': number;
    'logprobs': CreateCompletionResponseChoicesInnerLogprobs | null;
    'finishReason': CreateCompletionResponseChoicesInner.FinishReasonEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "text",
            "baseName": "text",
            "type": "string"
        },
        {
            "name": "index",
            "baseName": "index",
            "type": "number"
        },
        {
            "name": "logprobs",
            "baseName": "logprobs",
            "type": "CreateCompletionResponseChoicesInnerLogprobs"
        },
        {
            "name": "finishReason",
            "baseName": "finish_reason",
            "type": "CreateCompletionResponseChoicesInner.FinishReasonEnum"
        }    ];

    static getAttributeTypeMap() {
        return CreateCompletionResponseChoicesInner.attributeTypeMap;
    }
}

export namespace CreateCompletionResponseChoicesInner {
    export enum FinishReasonEnum {
        Stop = <any> 'stop',
        Length = <any> 'length'
    }
}