// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    CreateCompletionResponseChoicesInnerLogprobs,
    CreateCompletionResponseChoicesInnerLogprobsFromJSON,
    CreateCompletionResponseChoicesInnerLogprobsToJSON,
} from './';

/**
 * 
 * @export
 * @interface CreateEditResponseChoicesInner
 */
export interface CreateEditResponseChoicesInner  {
    /**
     * 
     * @type {string}
     * @memberof CreateEditResponseChoicesInner
     */
    text?: string;
    /**
     * 
     * @type {number}
     * @memberof CreateEditResponseChoicesInner
     */
    index?: number;
    /**
     * 
     * @type {CreateCompletionResponseChoicesInnerLogprobs}
     * @memberof CreateEditResponseChoicesInner
     */
    logprobs?: CreateCompletionResponseChoicesInnerLogprobs;
    /**
     * 
     * @type {string}
     * @memberof CreateEditResponseChoicesInner
     */
    finishReason?: CreateEditResponseChoicesInnerFinishReasonEnum;
}

export function CreateEditResponseChoicesInnerFromJSON(json: any): CreateEditResponseChoicesInner {
    return {
        'text': !exists(json, 'text') ? undefined : json['text'],
        'index': !exists(json, 'index') ? undefined : json['index'],
        'logprobs': !exists(json, 'logprobs') ? undefined : CreateCompletionResponseChoicesInnerLogprobsFromJSON(json['logprobs']),
        'finishReason': !exists(json, 'finish_reason') ? undefined : json['finish_reason'],
    };
}

export function CreateEditResponseChoicesInnerToJSON(value?: CreateEditResponseChoicesInner): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'text': value.text,
        'index': value.index,
        'logprobs': CreateCompletionResponseChoicesInnerLogprobsToJSON(value.logprobs),
        'finish_reason': value.finishReason,
    };
}

/**
* @export
* @enum {string}
*/
export enum CreateEditResponseChoicesInnerFinishReasonEnum {
    Stop = 'stop',
    Length = 'length'
}


