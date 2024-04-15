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
import type { MessageObject } from './MessageObject';
import {
    MessageObjectFromJSON,
    MessageObjectFromJSONTyped,
    MessageObjectToJSON,
} from './MessageObject';

/**
 * 
 * @export
 * @interface ListMessagesResponse
 */
export interface ListMessagesResponse {
    /**
     * 
     * @type {string}
     * @memberof ListMessagesResponse
     */
    object: string;
    /**
     * 
     * @type {Array<MessageObject>}
     * @memberof ListMessagesResponse
     */
    data: Array<MessageObject>;
    /**
     * 
     * @type {string}
     * @memberof ListMessagesResponse
     */
    firstId: string;
    /**
     * 
     * @type {string}
     * @memberof ListMessagesResponse
     */
    lastId: string;
    /**
     * 
     * @type {boolean}
     * @memberof ListMessagesResponse
     */
    hasMore: boolean;
}

/**
 * Check if a given object implements the ListMessagesResponse interface.
 */
export function instanceOfListMessagesResponse(value: object): boolean {
    if (!('object' in value)) return false;
    if (!('data' in value)) return false;
    if (!('firstId' in value)) return false;
    if (!('lastId' in value)) return false;
    if (!('hasMore' in value)) return false;
    return true;
}

export function ListMessagesResponseFromJSON(json: any): ListMessagesResponse {
    return ListMessagesResponseFromJSONTyped(json, false);
}

export function ListMessagesResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ListMessagesResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'object': json['object'],
        'data': ((json['data'] as Array<any>).map(MessageObjectFromJSON)),
        'firstId': json['first_id'],
        'lastId': json['last_id'],
        'hasMore': json['has_more'],
    };
}

export function ListMessagesResponseToJSON(value?: ListMessagesResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'object': value['object'],
        'data': ((value['data'] as Array<any>).map(MessageObjectToJSON)),
        'first_id': value['firstId'],
        'last_id': value['lastId'],
        'has_more': value['hasMore'],
    };
}
