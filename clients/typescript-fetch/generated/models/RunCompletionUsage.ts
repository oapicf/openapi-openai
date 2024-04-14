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
/**
 * Usage statistics related to the run. This value will be `null` if the run is not in a terminal state (i.e. `in_progress`, `queued`, etc.).
 * @export
 * @interface RunCompletionUsage
 */
export interface RunCompletionUsage {
    /**
     * Number of completion tokens used over the course of the run.
     * @type {number}
     * @memberof RunCompletionUsage
     */
    completionTokens: number;
    /**
     * Number of prompt tokens used over the course of the run.
     * @type {number}
     * @memberof RunCompletionUsage
     */
    promptTokens: number;
    /**
     * Total number of tokens used (prompt + completion).
     * @type {number}
     * @memberof RunCompletionUsage
     */
    totalTokens: number;
}

/**
 * Check if a given object implements the RunCompletionUsage interface.
 */
export function instanceOfRunCompletionUsage(value: object): boolean {
    if (!('completionTokens' in value)) return false;
    if (!('promptTokens' in value)) return false;
    if (!('totalTokens' in value)) return false;
    return true;
}

export function RunCompletionUsageFromJSON(json: any): RunCompletionUsage {
    return RunCompletionUsageFromJSONTyped(json, false);
}

export function RunCompletionUsageFromJSONTyped(json: any, ignoreDiscriminator: boolean): RunCompletionUsage {
    if (json == null) {
        return json;
    }
    return {
        
        'completionTokens': json['completion_tokens'],
        'promptTokens': json['prompt_tokens'],
        'totalTokens': json['total_tokens'],
    };
}

export function RunCompletionUsageToJSON(value?: RunCompletionUsage | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'completion_tokens': value['completionTokens'],
        'prompt_tokens': value['promptTokens'],
        'total_tokens': value['totalTokens'],
    };
}

