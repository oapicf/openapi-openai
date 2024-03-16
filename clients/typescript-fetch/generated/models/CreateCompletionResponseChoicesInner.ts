/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { CreateCompletionResponseChoicesInnerLogprobs } from './CreateCompletionResponseChoicesInnerLogprobs';
import {
    CreateCompletionResponseChoicesInnerLogprobsFromJSON,
    CreateCompletionResponseChoicesInnerLogprobsFromJSONTyped,
    CreateCompletionResponseChoicesInnerLogprobsToJSON,
} from './CreateCompletionResponseChoicesInnerLogprobs';

/**
 * 
 * @export
 * @interface CreateCompletionResponseChoicesInner
 */
export interface CreateCompletionResponseChoicesInner {
    /**
     * 
     * @type {string}
     * @memberof CreateCompletionResponseChoicesInner
     */
    text: string;
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
    finishReason: CreateCompletionResponseChoicesInnerFinishReasonEnum;
}


/**
 * @export
 */
export const CreateCompletionResponseChoicesInnerFinishReasonEnum = {
    Stop: 'stop',
    Length: 'length'
} as const;
export type CreateCompletionResponseChoicesInnerFinishReasonEnum = typeof CreateCompletionResponseChoicesInnerFinishReasonEnum[keyof typeof CreateCompletionResponseChoicesInnerFinishReasonEnum];


/**
 * Check if a given object implements the CreateCompletionResponseChoicesInner interface.
 */
export function instanceOfCreateCompletionResponseChoicesInner(value: object): boolean {
    if (!('text' in value)) return false;
    if (!('index' in value)) return false;
    if (!('logprobs' in value)) return false;
    if (!('finishReason' in value)) return false;
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
        
        'text': json['text'],
        'index': json['index'],
        'logprobs': CreateCompletionResponseChoicesInnerLogprobsFromJSON(json['logprobs']),
        'finishReason': json['finish_reason'],
    };
}

export function CreateCompletionResponseChoicesInnerToJSON(value?: CreateCompletionResponseChoicesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'text': value['text'],
        'index': value['index'],
        'logprobs': CreateCompletionResponseChoicesInnerLogprobsToJSON(value['logprobs']),
        'finish_reason': value['finishReason'],
    };
}
