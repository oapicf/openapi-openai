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


/**
 * Represents an embedding vector returned by embedding endpoint. 
 */
export interface Embedding { 
    /**
     * The index of the embedding in the list of embeddings.
     */
    index: number;
    /**
     * The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
     */
    embedding: Array<number>;
    /**
     * The object type, which is always \"embedding\".
     */
    object: Embedding.ObjectEnum;
}
export namespace Embedding {
    export type ObjectEnum = 'embedding';
    export const ObjectEnum = {
        Embedding: 'embedding' as ObjectEnum
    };
}

