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
    FineTuningJob,
    FineTuningJobFromJSON,
    FineTuningJobToJSON,
} from './';

/**
 * 
 * @export
 * @interface ListPaginatedFineTuningJobsResponse
 */
export interface ListPaginatedFineTuningJobsResponse  {
    /**
     * 
     * @type {Array<FineTuningJob>}
     * @memberof ListPaginatedFineTuningJobsResponse
     */
    data: Array<FineTuningJob>;
    /**
     * 
     * @type {boolean}
     * @memberof ListPaginatedFineTuningJobsResponse
     */
    hasMore: boolean;
    /**
     * 
     * @type {string}
     * @memberof ListPaginatedFineTuningJobsResponse
     */
    object: ListPaginatedFineTuningJobsResponseObjectEnum;
}

export function ListPaginatedFineTuningJobsResponseFromJSON(json: any): ListPaginatedFineTuningJobsResponse {
    return {
        'data': (json['data'] as Array<any>).map(FineTuningJobFromJSON),
        'hasMore': json['has_more'],
        'object': json['object'],
    };
}

export function ListPaginatedFineTuningJobsResponseToJSON(value?: ListPaginatedFineTuningJobsResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'data': (value.data as Array<any>).map(FineTuningJobToJSON),
        'has_more': value.hasMore,
        'object': value.object,
    };
}

/**
* @export
* @enum {string}
*/
export enum ListPaginatedFineTuningJobsResponseObjectEnum {
    List = 'list'
}

