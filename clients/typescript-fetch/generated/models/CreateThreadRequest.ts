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
import type { CreateMessageRequest } from './CreateMessageRequest';
import {
    CreateMessageRequestFromJSON,
    CreateMessageRequestFromJSONTyped,
    CreateMessageRequestToJSON,
} from './CreateMessageRequest';

/**
 * 
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
     * 
     * @type {object}
     * @memberof CreateThreadRequest
     */
    metadata?: object;
}

/**
 * Check if a given object implements the CreateThreadRequest interface.
 */
export function instanceOfCreateThreadRequest(value: object): boolean {
    return true;
}

export function CreateThreadRequestFromJSON(json: any): CreateThreadRequest {
    return CreateThreadRequestFromJSONTyped(json, false);
}

export function CreateThreadRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateThreadRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'messages': json['messages'] == null ? undefined : ((json['messages'] as Array<any>).map(CreateMessageRequestFromJSON)),
        'metadata': json['metadata'] == null ? undefined : json['metadata'],
    };
}

export function CreateThreadRequestToJSON(value?: CreateThreadRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'messages': value['messages'] == null ? undefined : ((value['messages'] as Array<any>).map(CreateMessageRequestToJSON)),
        'metadata': value['metadata'],
    };
}
