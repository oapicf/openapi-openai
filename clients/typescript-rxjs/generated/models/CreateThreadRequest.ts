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
    CreateMessageRequest,
} from './';

/**
 * @export
 * @interface CreateThreadRequest
 */
export interface CreateThreadRequest {
    /**
     * A list of [messages](/docs/api-reference/messages) to start the thread with.
     * @type {Array<CreateMessageRequest>}
     * @memberof CreateThreadRequest
     */
    messages?: Array<CreateMessageRequest>;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
     * @type {object}
     * @memberof CreateThreadRequest
     */
    metadata?: object | null;
}