/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { CreateCompletionResponseChoicesInnerLogprobs } from './CreateCompletionResponseChoicesInnerLogprobs';
import {
    CreateCompletionResponseChoicesInnerLogprobsFromJSON,
    CreateCompletionResponseChoicesInnerLogprobsFromJSONTyped,
    CreateCompletionResponseChoicesInnerLogprobsToJSON,
    CreateCompletionResponseChoicesInnerLogprobsToJSONTyped,
} from './CreateCompletionResponseChoicesInnerLogprobs';

/**
 * 
 * @export
 * @interface CreateCompletionResponseChoicesInner
 */
export interface CreateCompletionResponseChoicesInner {
    /**
     * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence,
     * `length` if the maximum number of tokens specified in the request was reached,
     * or `content_filter` if content was omitted due to a flag from our content filters.
     * 
     * @type {string}
     * @memberof CreateCompletionResponseChoicesInner
     */
    finishReason: CreateCompletionResponseChoicesInnerFinishReasonEnum;
    /**
     * 
     * @type {number}
     * @memberof CreateCompletionResponseChoicesInner
     */
    index: number;
    /**
     * 
     * @type {CreateCompletionResponseChoicesInnerLogprobs}
     * @memberof CreateCompletionResponseChoicesInner
     */
    logprobs: CreateCompletionResponseChoicesInnerLogprobs | null;
    /**
     * 
     * @type {string}
     * @memberof CreateCompletionResponseChoicesInner
     */
    text: string;
}


/**
 * @export
 */
export const CreateCompletionResponseChoicesInnerFinishReasonEnum = {
    Stop: 'stop',
    Length: 'length',
    ContentFilter: 'content_filter'
} as const;
export type CreateCompletionResponseChoicesInnerFinishReasonEnum = typeof CreateCompletionResponseChoicesInnerFinishReasonEnum[keyof typeof CreateCompletionResponseChoicesInnerFinishReasonEnum];


/**
 * Check if a given object implements the CreateCompletionResponseChoicesInner interface.
 */
export function instanceOfCreateCompletionResponseChoicesInner(value: object): value is CreateCompletionResponseChoicesInner {
    if (!('finishReason' in value) || value['finishReason'] === undefined) return false;
    if (!('index' in value) || value['index'] === undefined) return false;
    if (!('logprobs' in value) || value['logprobs'] === undefined) return false;
    if (!('text' in value) || value['text'] === undefined) return false;
    return true;
}

export function CreateCompletionResponseChoicesInnerFromJSON(json: any): CreateCompletionResponseChoicesInner {
    return CreateCompletionResponseChoicesInnerFromJSONTyped(json, false);
}

export function CreateCompletionResponseChoicesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateCompletionResponseChoicesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'finishReason': json['finish_reason'],
        'index': json['index'],
        'logprobs': CreateCompletionResponseChoicesInnerLogprobsFromJSON(json['logprobs']),
        'text': json['text'],
    };
}

  export function CreateCompletionResponseChoicesInnerToJSON(json: any): CreateCompletionResponseChoicesInner {
      return CreateCompletionResponseChoicesInnerToJSONTyped(json, false);
  }

  export function CreateCompletionResponseChoicesInnerToJSONTyped(value?: CreateCompletionResponseChoicesInner | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'finish_reason': value['finishReason'],
        'index': value['index'],
        'logprobs': CreateCompletionResponseChoicesInnerLogprobsToJSON(value['logprobs']),
        'text': value['text'],
    };
}

