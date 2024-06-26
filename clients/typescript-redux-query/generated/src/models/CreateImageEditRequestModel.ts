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

import { exists, mapValues } from '../runtime';
/**
 * The model to use for image generation. Only `dall-e-2` is supported at this time.
 * @export
 * @interface CreateImageEditRequestModel
 */
export interface CreateImageEditRequestModel  {
}

export function CreateImageEditRequestModelFromJSON(json: any): CreateImageEditRequestModel {
    return json;
}

export function CreateImageEditRequestModelToJSON(value?: CreateImageEditRequestModel): any {
    return value;
}


