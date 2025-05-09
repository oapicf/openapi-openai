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
import type { MessageDeltaObjectDeltaContentInner } from './MessageDeltaObjectDeltaContentInner';
import {
    MessageDeltaObjectDeltaContentInnerFromJSON,
    MessageDeltaObjectDeltaContentInnerFromJSONTyped,
    MessageDeltaObjectDeltaContentInnerToJSON,
    MessageDeltaObjectDeltaContentInnerToJSONTyped,
} from './MessageDeltaObjectDeltaContentInner';

/**
 * The delta containing the fields that have changed on the Message.
 * @export
 * @interface MessageDeltaObjectDelta
 */
export interface MessageDeltaObjectDelta {
    /**
     * The entity that produced the message. One of `user` or `assistant`.
     * @type {string}
     * @memberof MessageDeltaObjectDelta
     */
    role?: MessageDeltaObjectDeltaRoleEnum;
    /**
     * The content of the message in array of text and/or images.
     * @type {Array<MessageDeltaObjectDeltaContentInner>}
     * @memberof MessageDeltaObjectDelta
     */
    content?: Array<MessageDeltaObjectDeltaContentInner>;
    /**
     * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
     * @type {Array<string>}
     * @memberof MessageDeltaObjectDelta
     */
    fileIds?: Array<string>;
}


/**
 * @export
 */
export const MessageDeltaObjectDeltaRoleEnum = {
    User: 'user',
    Assistant: 'assistant'
} as const;
export type MessageDeltaObjectDeltaRoleEnum = typeof MessageDeltaObjectDeltaRoleEnum[keyof typeof MessageDeltaObjectDeltaRoleEnum];


/**
 * Check if a given object implements the MessageDeltaObjectDelta interface.
 */
export function instanceOfMessageDeltaObjectDelta(value: object): value is MessageDeltaObjectDelta {
    return true;
}

export function MessageDeltaObjectDeltaFromJSON(json: any): MessageDeltaObjectDelta {
    return MessageDeltaObjectDeltaFromJSONTyped(json, false);
}

export function MessageDeltaObjectDeltaFromJSONTyped(json: any, ignoreDiscriminator: boolean): MessageDeltaObjectDelta {
    if (json == null) {
        return json;
    }
    return {
        
        'role': json['role'] == null ? undefined : json['role'],
        'content': json['content'] == null ? undefined : ((json['content'] as Array<any>).map(MessageDeltaObjectDeltaContentInnerFromJSON)),
        'fileIds': json['file_ids'] == null ? undefined : json['file_ids'],
    };
}

  export function MessageDeltaObjectDeltaToJSON(json: any): MessageDeltaObjectDelta {
      return MessageDeltaObjectDeltaToJSONTyped(json, false);
  }

  export function MessageDeltaObjectDeltaToJSONTyped(value?: MessageDeltaObjectDelta | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'role': value['role'],
        'content': value['content'] == null ? undefined : ((value['content'] as Array<any>).map(MessageDeltaObjectDeltaContentInnerToJSON)),
        'file_ids': value['fileIds'],
    };
}

