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
 * @interface CreateEmbeddingResponseUsage
 */
export interface CreateEmbeddingResponseUsage  {
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

export function CreateEmbeddingResponseUsageFromJSON(json: any): CreateEmbeddingResponseUsage {
    return {
        'promptTokens': json['prompt_tokens'],
        'totalTokens': json['total_tokens'],
    };
}

export function CreateEmbeddingResponseUsageToJSON(value?: CreateEmbeddingResponseUsage): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'prompt_tokens': value.promptTokens,
        'total_tokens': value.totalTokens,
    };
}

