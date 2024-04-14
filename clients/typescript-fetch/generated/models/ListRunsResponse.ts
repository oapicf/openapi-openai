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
import type { RunObject } from './RunObject';
import {
    RunObjectFromJSON,
    RunObjectFromJSONTyped,
    RunObjectToJSON,
} from './RunObject';

/**
 * 
 * @export
 * @interface ListRunsResponse
 */
export interface ListRunsResponse {
    /**
     * 
     * @type {string}
     * @memberof ListRunsResponse
     */
    object: string;
    /**
     * 
     * @type {Array<RunObject>}
     * @memberof ListRunsResponse
     */
    data: Array<RunObject>;
    /**
     * 
     * @type {string}
     * @memberof ListRunsResponse
     */
    firstId: string;
    /**
     * 
     * @type {string}
     * @memberof ListRunsResponse
     */
    lastId: string;
    /**
     * 
     * @type {boolean}
     * @memberof ListRunsResponse
     */
    hasMore: boolean;
}

/**
 * Check if a given object implements the ListRunsResponse interface.
 */
export function instanceOfListRunsResponse(value: object): boolean {
    if (!('object' in value)) return false;
    if (!('data' in value)) return false;
    if (!('firstId' in value)) return false;
    if (!('lastId' in value)) return false;
    if (!('hasMore' in value)) return false;
    return true;
}

export function ListRunsResponseFromJSON(json: any): ListRunsResponse {
    return ListRunsResponseFromJSONTyped(json, false);
}

export function ListRunsResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ListRunsResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'object': json['object'],
        'data': ((json['data'] as Array<any>).map(RunObjectFromJSON)),
        'firstId': json['first_id'],
        'lastId': json['last_id'],
        'hasMore': json['has_more'],
    };
}

export function ListRunsResponseToJSON(value?: ListRunsResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'object': value['object'],
        'data': ((value['data'] as Array<any>).map(RunObjectToJSON)),
        'first_id': value['firstId'],
        'last_id': value['lastId'],
        'has_more': value['hasMore'],
    };
}

