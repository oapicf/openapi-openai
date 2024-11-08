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
    MessageObjectToJSONTyped,
} from './MessageObject';

/**
 * Occurs when a [message](/docs/api-reference/messages/object) is created.
 * @export
 * @interface MessageStreamEventOneOf
 */
export interface MessageStreamEventOneOf {
    /**
     * 
     * @type {string}
     * @memberof MessageStreamEventOneOf
     */
    event: MessageStreamEventOneOfEventEnum;
    /**
     * 
     * @type {MessageObject}
     * @memberof MessageStreamEventOneOf
     */
    data: MessageObject;
}


/**
 * @export
 */
export const MessageStreamEventOneOfEventEnum = {
    ThreadMessageCreated: 'thread.message.created'
} as const;
export type MessageStreamEventOneOfEventEnum = typeof MessageStreamEventOneOfEventEnum[keyof typeof MessageStreamEventOneOfEventEnum];


/**
 * Check if a given object implements the MessageStreamEventOneOf interface.
 */
export function instanceOfMessageStreamEventOneOf(value: object): value is MessageStreamEventOneOf {
    if (!('event' in value) || value['event'] === undefined) return false;
    if (!('data' in value) || value['data'] === undefined) return false;
    return true;
}

export function MessageStreamEventOneOfFromJSON(json: any): MessageStreamEventOneOf {
    return MessageStreamEventOneOfFromJSONTyped(json, false);
}

export function MessageStreamEventOneOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): MessageStreamEventOneOf {
    if (json == null) {
        return json;
    }
    return {
        
        'event': json['event'],
        'data': MessageObjectFromJSON(json['data']),
    };
}

  export function MessageStreamEventOneOfToJSON(json: any): MessageStreamEventOneOf {
      return MessageStreamEventOneOfToJSONTyped(json, false);
  }

  export function MessageStreamEventOneOfToJSONTyped(value?: MessageStreamEventOneOf | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'event': value['event'],
        'data': MessageObjectToJSON(value['data']),
    };
}

