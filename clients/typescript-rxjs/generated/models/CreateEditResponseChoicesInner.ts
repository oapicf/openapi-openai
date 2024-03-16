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
 * @interface CreateEditResponseChoicesInner
 */
export interface CreateEditResponseChoicesInner {
    /**
     * @type {string}
     * @memberof CreateEditResponseChoicesInner
     */
    text?: string;
    /**
     * @type {number}
     * @memberof CreateEditResponseChoicesInner
     */
    index?: number;
    /**
     * @type {CreateCompletionResponseChoicesInnerLogprobs}
     * @memberof CreateEditResponseChoicesInner
     */
    logprobs?: CreateCompletionResponseChoicesInnerLogprobs | null;
    /**
     * @type {string}
     * @memberof CreateEditResponseChoicesInner
     */
    finish_reason?: CreateEditResponseChoicesInnerFinishReasonEnum;
}

/**
 * @export
 * @enum {string}
 */
export enum CreateEditResponseChoicesInnerFinishReasonEnum {
    Stop = 'stop',
    Length = 'length'
}

