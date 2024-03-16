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
 * @interface CreateEmbeddingResponseUsage
 */
export interface CreateEmbeddingResponseUsage {
    /**
     * 
     * @type {number}
     * @memberof CreateEmbeddingResponseUsage
     */
    promptTokens: number;
    /**
     * 
     * @type {number}
     * @memberof CreateEmbeddingResponseUsage
     */
    totalTokens: number;
}

/**
 * Check if a given object implements the CreateEmbeddingResponseUsage interface.
 */
export function instanceOfCreateEmbeddingResponseUsage(value: object): boolean {
    if (!('promptTokens' in value)) return false;
    if (!('totalTokens' in value)) return false;
    return true;
}

export function CreateEmbeddingResponseUsageFromJSON(json: any): CreateEmbeddingResponseUsage {
    return CreateEmbeddingResponseUsageFromJSONTyped(json, false);
}

export function CreateEmbeddingResponseUsageFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateEmbeddingResponseUsage {
    if (json == null) {
        return json;
    }
    return {
        
        'promptTokens': json['prompt_tokens'],
        'totalTokens': json['total_tokens'],
    };
}

export function CreateEmbeddingResponseUsageToJSON(value?: CreateEmbeddingResponseUsage | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'prompt_tokens': value['promptTokens'],
        'total_tokens': value['totalTokens'],
    };
}

