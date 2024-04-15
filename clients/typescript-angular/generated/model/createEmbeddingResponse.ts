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
import { Embedding } from './embedding';
import { CreateEmbeddingResponseUsage } from './createEmbeddingResponseUsage';


export interface CreateEmbeddingResponse { 
    /**
     * The list of embeddings generated by the model.
     */
    data: Array<Embedding>;
    /**
     * The name of the model used to generate the embedding.
     */
    model: string;
    /**
     * The object type, which is always \"list\".
     */
    object: CreateEmbeddingResponse.ObjectEnum;
    usage: CreateEmbeddingResponseUsage;
}
export namespace CreateEmbeddingResponse {
    export type ObjectEnum = 'list';
    export const ObjectEnum = {
        List: 'list' as ObjectEnum
    };
}

