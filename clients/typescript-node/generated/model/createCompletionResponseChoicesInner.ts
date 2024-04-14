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
import { CreateCompletionResponseChoicesInnerLogprobs } from './createCompletionResponseChoicesInnerLogprobs';

export class CreateCompletionResponseChoicesInner {
    /**
    * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
    */
    'finishReason': CreateCompletionResponseChoicesInner.FinishReasonEnum;
    'index': number;
    'logprobs': CreateCompletionResponseChoicesInnerLogprobs | null;
    'text': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "finishReason",
            "baseName": "finish_reason",
            "type": "CreateCompletionResponseChoicesInner.FinishReasonEnum"
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
            "name": "text",
            "baseName": "text",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CreateCompletionResponseChoicesInner.attributeTypeMap;
    }
}

export namespace CreateCompletionResponseChoicesInner {
    export enum FinishReasonEnum {
        Stop = <any> 'stop',
        Length = <any> 'length',
        ContentFilter = <any> 'content_filter'
    }
}
