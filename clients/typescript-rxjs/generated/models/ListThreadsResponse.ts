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

import type {
    ThreadObject,
} from './';

/**
 * @export
 * @interface ListThreadsResponse
 */
export interface ListThreadsResponse {
    /**
     * @type {string}
     * @memberof ListThreadsResponse
     */
    object: string;
    /**
     * @type {Array<ThreadObject>}
     * @memberof ListThreadsResponse
     */
    data: Array<ThreadObject>;
    /**
     * @type {string}
     * @memberof ListThreadsResponse
     */
    first_id: string;
    /**
     * @type {string}
     * @memberof ListThreadsResponse
     */
    last_id: string;
    /**
     * @type {boolean}
     * @memberof ListThreadsResponse
     */
    has_more: boolean;
}