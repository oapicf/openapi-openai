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

import * as models from './models';

/**
 * Represents a thread that contains [messages](/docs/api-reference/messages).
 */
export interface ThreadObject {
    /**
     * The identifier, which can be referenced in API endpoints.
     */
    id: string;

    /**
     * The object type, which is always `thread`.
     */
    object: ThreadObject.ObjectEnum;

    /**
     * The Unix timestamp (in seconds) for when the thread was created.
     */
    created_at: number;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
     */
    metadata: object;

}
export namespace ThreadObject {
    export enum ObjectEnum {
        Thread = <any> 'thread'
    }
}
