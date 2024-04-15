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
    FineTuningJobCheckpoint,
    FineTuningJobCheckpointFromJSON,
    FineTuningJobCheckpointToJSON,
} from './';

/**
 * 
 * @export
 * @interface ListFineTuningJobCheckpointsResponse
 */
export interface ListFineTuningJobCheckpointsResponse  {
    /**
     * 
     * @type {Array<FineTuningJobCheckpoint>}
     * @memberof ListFineTuningJobCheckpointsResponse
     */
    data: Array<FineTuningJobCheckpoint>;
    /**
     * 
     * @type {string}
     * @memberof ListFineTuningJobCheckpointsResponse
     */
    object: ListFineTuningJobCheckpointsResponseObjectEnum;
    /**
     * 
     * @type {string}
     * @memberof ListFineTuningJobCheckpointsResponse
     */
    firstId?: string;
    /**
     * 
     * @type {string}
     * @memberof ListFineTuningJobCheckpointsResponse
     */
    lastId?: string;
    /**
     * 
     * @type {boolean}
     * @memberof ListFineTuningJobCheckpointsResponse
     */
    hasMore: boolean;
}

export function ListFineTuningJobCheckpointsResponseFromJSON(json: any): ListFineTuningJobCheckpointsResponse {
    return {
        'data': (json['data'] as Array<any>).map(FineTuningJobCheckpointFromJSON),
        'object': json['object'],
        'firstId': !exists(json, 'first_id') ? undefined : json['first_id'],
        'lastId': !exists(json, 'last_id') ? undefined : json['last_id'],
        'hasMore': json['has_more'],
    };
}

export function ListFineTuningJobCheckpointsResponseToJSON(value?: ListFineTuningJobCheckpointsResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'data': (value.data as Array<any>).map(FineTuningJobCheckpointToJSON),
        'object': value.object,
        'first_id': value.firstId,
        'last_id': value.lastId,
        'has_more': value.hasMore,
    };
}

/**
* @export
* @enum {string}
*/
export enum ListFineTuningJobCheckpointsResponseObjectEnum {
    List = 'list'
}

