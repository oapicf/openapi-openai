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
import type { CreateModerationResponseResultsInner } from './CreateModerationResponseResultsInner';
import {
    CreateModerationResponseResultsInnerFromJSON,
    CreateModerationResponseResultsInnerFromJSONTyped,
    CreateModerationResponseResultsInnerToJSON,
} from './CreateModerationResponseResultsInner';

/**
 * Represents if a given text input is potentially harmful.
 * @export
 * @interface CreateModerationResponse
 */
export interface CreateModerationResponse {
    /**
     * The unique identifier for the moderation request.
     * @type {string}
     * @memberof CreateModerationResponse
     */
    id: string;
    /**
     * The model used to generate the moderation results.
     * @type {string}
     * @memberof CreateModerationResponse
     */
    model: string;
    /**
     * A list of moderation objects.
     * @type {Array<CreateModerationResponseResultsInner>}
     * @memberof CreateModerationResponse
     */
    results: Array<CreateModerationResponseResultsInner>;
}

/**
 * Check if a given object implements the CreateModerationResponse interface.
 */
export function instanceOfCreateModerationResponse(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('model' in value)) return false;
    if (!('results' in value)) return false;
    return true;
}

export function CreateModerationResponseFromJSON(json: any): CreateModerationResponse {
    return CreateModerationResponseFromJSONTyped(json, false);
}

export function CreateModerationResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateModerationResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'model': json['model'],
        'results': ((json['results'] as Array<any>).map(CreateModerationResponseResultsInnerFromJSON)),
    };
}

export function CreateModerationResponseToJSON(value?: CreateModerationResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'model': value['model'],
        'results': ((value['results'] as Array<any>).map(CreateModerationResponseResultsInnerToJSON)),
    };
}

