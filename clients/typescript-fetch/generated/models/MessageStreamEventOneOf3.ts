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
 * Occurs when a [message](/docs/api-reference/messages/object) is completed.
 * @export
 * @interface MessageStreamEventOneOf3
 */
export interface MessageStreamEventOneOf3 {
    /**
     * 
     * @type {string}
     * @memberof MessageStreamEventOneOf3
     */
    event: MessageStreamEventOneOf3EventEnum;
    /**
     * 
     * @type {MessageObject}
     * @memberof MessageStreamEventOneOf3
     */
    data: MessageObject;
}


/**
 * @export
 */
export const MessageStreamEventOneOf3EventEnum = {
    ThreadMessageCompleted: 'thread.message.completed'
} as const;
export type MessageStreamEventOneOf3EventEnum = typeof MessageStreamEventOneOf3EventEnum[keyof typeof MessageStreamEventOneOf3EventEnum];


/**
 * Check if a given object implements the MessageStreamEventOneOf3 interface.
 */
export function instanceOfMessageStreamEventOneOf3(value: object): boolean {
    if (!('event' in value)) return false;
    if (!('data' in value)) return false;
    return true;
}

export function MessageStreamEventOneOf3FromJSON(json: any): MessageStreamEventOneOf3 {
    return MessageStreamEventOneOf3FromJSONTyped(json, false);
}

export function MessageStreamEventOneOf3FromJSONTyped(json: any, ignoreDiscriminator: boolean): MessageStreamEventOneOf3 {
    if (json == null) {
        return json;
    }
    return {
        
        'event': json['event'],
        'data': MessageObjectFromJSON(json['data']),
    };
}

export function MessageStreamEventOneOf3ToJSON(value?: MessageStreamEventOneOf3 | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'event': value['event'],
        'data': MessageObjectToJSON(value['data']),
    };
}

