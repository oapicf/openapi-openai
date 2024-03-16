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
import {
    CreateEmbeddingRequestInput,
    CreateEmbeddingRequestInputFromJSON,
    CreateEmbeddingRequestInputToJSON,
    CreateEmbeddingRequestModel,
    CreateEmbeddingRequestModelFromJSON,
    CreateEmbeddingRequestModelToJSON,
} from './';

/**
 * 
 * @export
 * @interface CreateEmbeddingRequest
 */
export interface CreateEmbeddingRequest  {
    /**
     * 
     * @type {CreateEmbeddingRequestModel}
     * @memberof CreateEmbeddingRequest
     */
    model: CreateEmbeddingRequestModel;
    /**
     * 
     * @type {CreateEmbeddingRequestInput}
     * @memberof CreateEmbeddingRequest
     */
    input: CreateEmbeddingRequestInput;
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     * @type {string}
     * @memberof CreateEmbeddingRequest
     */
    user?: string;
}

export function CreateEmbeddingRequestFromJSON(json: any): CreateEmbeddingRequest {
    return {
        'model': CreateEmbeddingRequestModelFromJSON(json['model']),
        'input': CreateEmbeddingRequestInputFromJSON(json['input']),
        'user': !exists(json, 'user') ? undefined : json['user'],
    };
}

export function CreateEmbeddingRequestToJSON(value?: CreateEmbeddingRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'model': CreateEmbeddingRequestModelToJSON(value.model),
        'input': CreateEmbeddingRequestInputToJSON(value.input),
        'user': value.user,
    };
}


