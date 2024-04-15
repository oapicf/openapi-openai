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
    AssistantFileObject,
    AssistantFileObjectFromJSON,
    AssistantFileObjectToJSON,
} from './';

/**
 * 
 * @export
 * @interface ListAssistantFilesResponse
 */
export interface ListAssistantFilesResponse  {
    /**
     * 
     * @type {string}
     * @memberof ListAssistantFilesResponse
     */
    object: string;
    /**
     * 
     * @type {Array<AssistantFileObject>}
     * @memberof ListAssistantFilesResponse
     */
    data: Array<AssistantFileObject>;
    /**
     * 
     * @type {string}
     * @memberof ListAssistantFilesResponse
     */
    firstId: string;
    /**
     * 
     * @type {string}
     * @memberof ListAssistantFilesResponse
     */
    lastId: string;
    /**
     * 
     * @type {boolean}
     * @memberof ListAssistantFilesResponse
     */
    hasMore: boolean;
}

export function ListAssistantFilesResponseFromJSON(json: any): ListAssistantFilesResponse {
    return {
        'object': json['object'],
        'data': (json['data'] as Array<any>).map(AssistantFileObjectFromJSON),
        'firstId': json['first_id'],
        'lastId': json['last_id'],
        'hasMore': json['has_more'],
    };
}

export function ListAssistantFilesResponseToJSON(value?: ListAssistantFilesResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'object': value.object,
        'data': (value.data as Array<any>).map(AssistantFileObjectToJSON),
        'first_id': value.firstId,
        'last_id': value.lastId,
        'has_more': value.hasMore,
    };
}

