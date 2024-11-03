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

import { CreateCompletionResponseChoicesInnerLogprobs } from '../models/CreateCompletionResponseChoicesInnerLogprobs';
import { HttpFile } from '../http/http';

export class CreateCompletionResponseChoicesInner {
    /**
    * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
    */
    'finishReason': CreateCompletionResponseChoicesInnerFinishReasonEnum;
    'index': number;
    'logprobs': CreateCompletionResponseChoicesInnerLogprobs | null;
    'text': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "finishReason",
            "baseName": "finish_reason",
            "type": "CreateCompletionResponseChoicesInnerFinishReasonEnum",
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
            "name": "text",
            "baseName": "text",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateCompletionResponseChoicesInner.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum CreateCompletionResponseChoicesInnerFinishReasonEnum {
    Stop = 'stop',
    Length = 'length',
    ContentFilter = 'content_filter'
}

