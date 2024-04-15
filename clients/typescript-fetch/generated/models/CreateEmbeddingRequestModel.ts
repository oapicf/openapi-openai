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
 * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.
 * 
 * @export
 * @interface CreateEmbeddingRequestModel
 */
export interface CreateEmbeddingRequestModel {
}

/**
 * Check if a given object implements the CreateEmbeddingRequestModel interface.
 */
export function instanceOfCreateEmbeddingRequestModel(value: object): boolean {
    return true;
}

export function CreateEmbeddingRequestModelFromJSON(json: any): CreateEmbeddingRequestModel {
    return CreateEmbeddingRequestModelFromJSONTyped(json, false);
}

export function CreateEmbeddingRequestModelFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateEmbeddingRequestModel {
    return json;
}

export function CreateEmbeddingRequestModelToJSON(value?: CreateEmbeddingRequestModel | null): any {
    return value;
}
