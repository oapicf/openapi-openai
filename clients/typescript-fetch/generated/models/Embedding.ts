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
 * Represents an embedding vector returned by embedding endpoint.
 * 
 * @export
 * @interface Embedding
 */
export interface Embedding {
    /**
     * The index of the embedding in the list of embeddings.
     * @type {number}
     * @memberof Embedding
     */
    index: number;
    /**
     * The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).
     * 
     * @type {Array<number>}
     * @memberof Embedding
     */
    embedding: Array<number>;
    /**
     * The object type, which is always "embedding".
     * @type {string}
     * @memberof Embedding
     */
    object: EmbeddingObjectEnum;
}


/**
 * @export
 */
export const EmbeddingObjectEnum = {
    Embedding: 'embedding'
} as const;
export type EmbeddingObjectEnum = typeof EmbeddingObjectEnum[keyof typeof EmbeddingObjectEnum];


/**
 * Check if a given object implements the Embedding interface.
 */
export function instanceOfEmbedding(value: object): boolean {
    if (!('index' in value)) return false;
    if (!('embedding' in value)) return false;
    if (!('object' in value)) return false;
    return true;
}

export function EmbeddingFromJSON(json: any): Embedding {
    return EmbeddingFromJSONTyped(json, false);
}

export function EmbeddingFromJSONTyped(json: any, ignoreDiscriminator: boolean): Embedding {
    if (json == null) {
        return json;
    }
    return {
        
        'index': json['index'],
        'embedding': json['embedding'],
        'object': json['object'],
    };
}

export function EmbeddingToJSON(value?: Embedding | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'index': value['index'],
        'embedding': value['embedding'],
        'object': value['object'],
    };
}

