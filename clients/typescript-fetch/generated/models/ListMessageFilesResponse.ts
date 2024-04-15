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
import type { MessageFileObject } from './MessageFileObject';
import {
    MessageFileObjectFromJSON,
    MessageFileObjectFromJSONTyped,
    MessageFileObjectToJSON,
} from './MessageFileObject';

/**
 * 
 * @export
 * @interface ListMessageFilesResponse
 */
export interface ListMessageFilesResponse {
    /**
     * 
     * @type {string}
     * @memberof ListMessageFilesResponse
     */
    object: string;
    /**
     * 
     * @type {Array<MessageFileObject>}
     * @memberof ListMessageFilesResponse
     */
    data: Array<MessageFileObject>;
    /**
     * 
     * @type {string}
     * @memberof ListMessageFilesResponse
     */
    firstId: string;
    /**
     * 
     * @type {string}
     * @memberof ListMessageFilesResponse
     */
    lastId: string;
    /**
     * 
     * @type {boolean}
     * @memberof ListMessageFilesResponse
     */
    hasMore: boolean;
}

/**
 * Check if a given object implements the ListMessageFilesResponse interface.
 */
export function instanceOfListMessageFilesResponse(value: object): boolean {
    if (!('object' in value)) return false;
    if (!('data' in value)) return false;
    if (!('firstId' in value)) return false;
    if (!('lastId' in value)) return false;
    if (!('hasMore' in value)) return false;
    return true;
}

export function ListMessageFilesResponseFromJSON(json: any): ListMessageFilesResponse {
    return ListMessageFilesResponseFromJSONTyped(json, false);
}

export function ListMessageFilesResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ListMessageFilesResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'object': json['object'],
        'data': ((json['data'] as Array<any>).map(MessageFileObjectFromJSON)),
        'firstId': json['first_id'],
        'lastId': json['last_id'],
        'hasMore': json['has_more'],
    };
}

export function ListMessageFilesResponseToJSON(value?: ListMessageFilesResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'object': value['object'],
        'data': ((value['data'] as Array<any>).map(MessageFileObjectToJSON)),
        'first_id': value['firstId'],
        'last_id': value['lastId'],
        'has_more': value['hasMore'],
    };
}
