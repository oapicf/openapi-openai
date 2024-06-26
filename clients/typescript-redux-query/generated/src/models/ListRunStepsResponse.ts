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
import {
    RunStepObject,
    RunStepObjectFromJSON,
    RunStepObjectToJSON,
} from './';

/**
 * 
 * @export
 * @interface ListRunStepsResponse
 */
export interface ListRunStepsResponse  {
    /**
     * 
     * @type {string}
     * @memberof ListRunStepsResponse
     */
    object: string;
    /**
     * 
     * @type {Array<RunStepObject>}
     * @memberof ListRunStepsResponse
     */
    data: Array<RunStepObject>;
    /**
     * 
     * @type {string}
     * @memberof ListRunStepsResponse
     */
    firstId: string;
    /**
     * 
     * @type {string}
     * @memberof ListRunStepsResponse
     */
    lastId: string;
    /**
     * 
     * @type {boolean}
     * @memberof ListRunStepsResponse
     */
    hasMore: boolean;
}

export function ListRunStepsResponseFromJSON(json: any): ListRunStepsResponse {
    return {
        'object': json['object'],
        'data': (json['data'] as Array<any>).map(RunStepObjectFromJSON),
        'firstId': json['first_id'],
        'lastId': json['last_id'],
        'hasMore': json['has_more'],
    };
}

export function ListRunStepsResponseToJSON(value?: ListRunStepsResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'object': value.object,
        'data': (value.data as Array<any>).map(RunStepObjectToJSON),
        'first_id': value.firstId,
        'last_id': value.lastId,
        'has_more': value.hasMore,
    };
}


