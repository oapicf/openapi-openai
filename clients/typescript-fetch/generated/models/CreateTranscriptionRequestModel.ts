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
 * ID of the model to use. Only `whisper-1` (which is powered by our open source Whisper V2 model) is currently available.
 * 
 * @export
 * @interface CreateTranscriptionRequestModel
 */
export interface CreateTranscriptionRequestModel {
}

/**
 * Check if a given object implements the CreateTranscriptionRequestModel interface.
 */
export function instanceOfCreateTranscriptionRequestModel(value: object): boolean {
    return true;
}

export function CreateTranscriptionRequestModelFromJSON(json: any): CreateTranscriptionRequestModel {
    return CreateTranscriptionRequestModelFromJSONTyped(json, false);
}

export function CreateTranscriptionRequestModelFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateTranscriptionRequestModel {
    return json;
}

export function CreateTranscriptionRequestModelToJSON(value?: CreateTranscriptionRequestModel | null): any {
    return value;
}

