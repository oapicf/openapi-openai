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

import { CreateCompletionResponseChoicesInnerLogprobs } from '../models/CreateCompletionResponseChoicesInnerLogprobs';
import { HttpFile } from '../http/http';

export class CreateEditResponseChoicesInner {
    'text'?: string;
    'index'?: number;
    'logprobs'?: CreateCompletionResponseChoicesInnerLogprobs | null;
    'finishReason'?: CreateEditResponseChoicesInnerFinishReasonEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "text",
            "baseName": "text",
            "type": "string",
            "format": ""
        },
        {
            "name": "index",
            "baseName": "index",
            "type": "number",
            "format": ""
        },
        {
            "name": "logprobs",
            "baseName": "logprobs",
            "type": "CreateCompletionResponseChoicesInnerLogprobs",
            "format": ""
        },
        {
            "name": "finishReason",
            "baseName": "finish_reason",
            "type": "CreateEditResponseChoicesInnerFinishReasonEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateEditResponseChoicesInner.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum CreateEditResponseChoicesInnerFinishReasonEnum {
    Stop = 'stop',
    Length = 'length'
}

