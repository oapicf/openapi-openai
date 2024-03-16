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
    CreateCompletionResponseUsage,
    CreateEditResponseChoicesInner,
} from './';

/**
 * @export
 * @interface CreateEditResponse
 */
export interface CreateEditResponse {
    /**
     * @type {string}
     * @memberof CreateEditResponse
     */
    object: string;
    /**
     * @type {number}
     * @memberof CreateEditResponse
     */
    created: number;
    /**
     * @type {Array<CreateEditResponseChoicesInner>}
     * @memberof CreateEditResponse
     */
    choices: Array<CreateEditResponseChoicesInner>;
    /**
     * @type {CreateCompletionResponseUsage}
     * @memberof CreateEditResponse
     */
    usage: CreateCompletionResponseUsage;
}