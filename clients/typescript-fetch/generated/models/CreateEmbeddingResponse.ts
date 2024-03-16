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
import type { CreateEmbeddingResponseDataInner } from './CreateEmbeddingResponseDataInner';
import {
    CreateEmbeddingResponseDataInnerFromJSON,
    CreateEmbeddingResponseDataInnerFromJSONTyped,
    CreateEmbeddingResponseDataInnerToJSON,
} from './CreateEmbeddingResponseDataInner';
import type { CreateEmbeddingResponseUsage } from './CreateEmbeddingResponseUsage';
import {
    CreateEmbeddingResponseUsageFromJSON,
    CreateEmbeddingResponseUsageFromJSONTyped,
    CreateEmbeddingResponseUsageToJSON,
} from './CreateEmbeddingResponseUsage';

/**
 * 
 * @export
 * @interface CreateEmbeddingResponse
 */
export interface CreateEmbeddingResponse {
    /**
     * 
     * @type {string}
     * @memberof CreateEmbeddingResponse
     */
    object: string;
    /**
     * 
     * @type {string}
     * @memberof CreateEmbeddingResponse
     */
    model: string;
    /**
     * 
     * @type {Array<CreateEmbeddingResponseDataInner>}
     * @memberof CreateEmbeddingResponse
     */
    data: Array<CreateEmbeddingResponseDataInner>;
    /**
     * 
     * @type {CreateEmbeddingResponseUsage}
     * @memberof CreateEmbeddingResponse
     */
    usage: CreateEmbeddingResponseUsage;
}

/**
 * Check if a given object implements the CreateEmbeddingResponse interface.
 */
export function instanceOfCreateEmbeddingResponse(value: object): boolean {
    if (!('object' in value)) return false;
    if (!('model' in value)) return false;
    if (!('data' in value)) return false;
    if (!('usage' in value)) return false;
    return true;
}

export function CreateEmbeddingResponseFromJSON(json: any): CreateEmbeddingResponse {
    return CreateEmbeddingResponseFromJSONTyped(json, false);
}

export function CreateEmbeddingResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateEmbeddingResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'object': json['object'],
        'model': json['model'],
        'data': ((json['data'] as Array<any>).map(CreateEmbeddingResponseDataInnerFromJSON)),
        'usage': CreateEmbeddingResponseUsageFromJSON(json['usage']),
    };
}

export function CreateEmbeddingResponseToJSON(value?: CreateEmbeddingResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'object': value['object'],
        'model': value['model'],
        'data': ((value['data'] as Array<any>).map(CreateEmbeddingResponseDataInnerToJSON)),
        'usage': CreateEmbeddingResponseUsageToJSON(value['usage']),
    };
}
