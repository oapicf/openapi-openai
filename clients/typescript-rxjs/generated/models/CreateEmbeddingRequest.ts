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

import type {
    CreateEmbeddingRequestInput,
    CreateEmbeddingRequestModel,
} from './';

/**
 * @export
 * @interface CreateEmbeddingRequest
 */
export interface CreateEmbeddingRequest {
    /**
     * @type {CreateEmbeddingRequestInput}
     * @memberof CreateEmbeddingRequest
     */
    input: CreateEmbeddingRequestInput;
    /**
     * @type {CreateEmbeddingRequestModel}
     * @memberof CreateEmbeddingRequest
     */
    model: CreateEmbeddingRequestModel;
    /**
     * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
     * @type {string}
     * @memberof CreateEmbeddingRequest
     */
    encoding_format?: CreateEmbeddingRequestEncodingFormatEnum;
    /**
     * The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
     * @type {number}
     * @memberof CreateEmbeddingRequest
     */
    dimensions?: number;
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     * @type {string}
     * @memberof CreateEmbeddingRequest
     */
    user?: string;
}

/**
 * @export
 * @enum {string}
 */
export enum CreateEmbeddingRequestEncodingFormatEnum {
    Float = 'float',
    Base64 = 'base64'
}

