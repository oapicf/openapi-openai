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
/**
 * 
 * @export
 * @interface CreateCompletionResponseUsage
 */
export interface CreateCompletionResponseUsage {
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

/**
 * Check if a given object implements the CreateCompletionResponseUsage interface.
 */
export function instanceOfCreateCompletionResponseUsage(value: object): boolean {
    if (!('promptTokens' in value)) return false;
    if (!('completionTokens' in value)) return false;
    if (!('totalTokens' in value)) return false;
    return true;
}

export function CreateCompletionResponseUsageFromJSON(json: any): CreateCompletionResponseUsage {
    return CreateCompletionResponseUsageFromJSONTyped(json, false);
}

export function CreateCompletionResponseUsageFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateCompletionResponseUsage {
    if (json == null) {
        return json;
    }
    return {
        
        'promptTokens': json['prompt_tokens'],
        'completionTokens': json['completion_tokens'],
        'totalTokens': json['total_tokens'],
    };
}

export function CreateCompletionResponseUsageToJSON(value?: CreateCompletionResponseUsage | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'prompt_tokens': value['promptTokens'],
        'completion_tokens': value['completionTokens'],
        'total_tokens': value['totalTokens'],
    };
}

