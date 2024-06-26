// tslint:disable
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

import { exists, mapValues } from '../runtime';
/**
 * Usage statistics for the completion request.
 * @export
 * @interface CompletionUsage
 */
export interface CompletionUsage  {
    /**
     * Number of tokens in the generated completion.
     * @type {number}
     * @memberof CompletionUsage
     */
    completionTokens: number;
    /**
     * Number of tokens in the prompt.
     * @type {number}
     * @memberof CompletionUsage
     */
    promptTokens: number;
    /**
     * Total number of tokens used in the request (prompt + completion).
     * @type {number}
     * @memberof CompletionUsage
     */
    totalTokens: number;
}

export function CompletionUsageFromJSON(json: any): CompletionUsage {
    return {
        'completionTokens': json['completion_tokens'],
        'promptTokens': json['prompt_tokens'],
        'totalTokens': json['total_tokens'],
    };
}

export function CompletionUsageToJSON(value?: CompletionUsage): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'completion_tokens': value.completionTokens,
        'prompt_tokens': value.promptTokens,
        'total_tokens': value.totalTokens,
    };
}


