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
 * The model to use for image generation.
 * @export
 * @interface CreateImageRequestModel
 */
export interface CreateImageRequestModel {
}

/**
 * Check if a given object implements the CreateImageRequestModel interface.
 */
export function instanceOfCreateImageRequestModel(value: object): boolean {
    return true;
}

export function CreateImageRequestModelFromJSON(json: any): CreateImageRequestModel {
    return CreateImageRequestModelFromJSONTyped(json, false);
}

export function CreateImageRequestModelFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateImageRequestModel {
    return json;
}

export function CreateImageRequestModelToJSON(value?: CreateImageRequestModel | null): any {
    return value;
}

