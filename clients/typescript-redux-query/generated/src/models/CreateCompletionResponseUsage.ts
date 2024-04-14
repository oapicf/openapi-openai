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
/**
 * 
 * @export
 * @interface CreateCompletionResponseUsage
 */
export interface CreateCompletionResponseUsage  {
    /**
     * 
     * @type {number}
     * @memberof CreateCompletionResponseUsage
     */
    promptTokens: number;
    /**
     * 
     * @type {number}
     * @memberof CreateCompletionResponseUsage
     */
    completionTokens: number;
    /**
     * 
     * @type {number}
     * @memberof CreateCompletionResponseUsage
     */
    totalTokens: number;
}

export function CreateCompletionResponseUsageFromJSON(json: any): CreateCompletionResponseUsage {
    return {
        'promptTokens': json['prompt_tokens'],
        'completionTokens': json['completion_tokens'],
        'totalTokens': json['total_tokens'],
    };
}

export function CreateCompletionResponseUsageToJSON(value?: CreateCompletionResponseUsage): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'prompt_tokens': value.promptTokens,
        'completion_tokens': value.completionTokens,
        'total_tokens': value.totalTokens,
    };
}

