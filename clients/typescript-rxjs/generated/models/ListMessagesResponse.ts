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
    MessageObject,
} from './';

/**
 * @export
 * @interface ListMessagesResponse
 */
export interface ListMessagesResponse {
    /**
     * @type {string}
     * @memberof ListMessagesResponse
     */
    object: string;
    /**
     * @type {Array<MessageObject>}
     * @memberof ListMessagesResponse
     */
    data: Array<MessageObject>;
    /**
     * @type {string}
     * @memberof ListMessagesResponse
     */
    first_id: string;
    /**
     * @type {string}
     * @memberof ListMessagesResponse
     */
    last_id: string;
    /**
     * @type {boolean}
     * @memberof ListMessagesResponse
     */
    has_more: boolean;
}