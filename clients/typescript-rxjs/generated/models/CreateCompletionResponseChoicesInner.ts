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

import type {
    CreateCompletionResponseChoicesInnerLogprobs,
} from './';

/**
 * @export
 * @interface CreateCompletionResponseChoicesInner
 */
export interface CreateCompletionResponseChoicesInner {
    /**
     * @type {string}
     * @memberof CreateCompletionResponseChoicesInner
     */
    text: string;
    /**
     * @type {number}
     * @memberof CreateCompletionResponseChoicesInner
     */
    index: number;
    /**
     * @type {CreateCompletionResponseChoicesInnerLogprobs}
     * @memberof CreateCompletionResponseChoicesInner
     */
    logprobs: CreateCompletionResponseChoicesInnerLogprobs | null;
    /**
     * @type {string}
     * @memberof CreateCompletionResponseChoicesInner
     */
    finish_reason: CreateCompletionResponseChoicesInnerFinishReasonEnum;
}

/**
 * @export
 * @enum {string}
 */
export enum CreateCompletionResponseChoicesInnerFinishReasonEnum {
    Stop = 'stop',
    Length = 'length'
}
