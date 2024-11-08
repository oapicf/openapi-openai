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
/**
 * A list of files attached to a `message`.
 * @export
 * @interface MessageFileObject
 */
export interface MessageFileObject {
    /**
     * The identifier, which can be referenced in API endpoints.
     * @type {string}
     * @memberof MessageFileObject
     */
    id: string;
    /**
     * The object type, which is always `thread.message.file`.
     * @type {string}
     * @memberof MessageFileObject
     */
    object: MessageFileObjectObjectEnum;
    /**
     * The Unix timestamp (in seconds) for when the message file was created.
     * @type {number}
     * @memberof MessageFileObject
     */
    createdAt: number;
    /**
     * The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
     * @type {string}
     * @memberof MessageFileObject
     */
    messageId: string;
}


/**
 * @export
 */
export const MessageFileObjectObjectEnum = {
    ThreadMessageFile: 'thread.message.file'
} as const;
export type MessageFileObjectObjectEnum = typeof MessageFileObjectObjectEnum[keyof typeof MessageFileObjectObjectEnum];


/**
 * Check if a given object implements the MessageFileObject interface.
 */
export function instanceOfMessageFileObject(value: object): value is MessageFileObject {
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('object' in value) || value['object'] === undefined) return false;
    if (!('createdAt' in value) || value['createdAt'] === undefined) return false;
    if (!('messageId' in value) || value['messageId'] === undefined) return false;
    return true;
}

export function MessageFileObjectFromJSON(json: any): MessageFileObject {
    return MessageFileObjectFromJSONTyped(json, false);
}

export function MessageFileObjectFromJSONTyped(json: any, ignoreDiscriminator: boolean): MessageFileObject {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'object': json['object'],
        'createdAt': json['created_at'],
        'messageId': json['message_id'],
    };
}

  export function MessageFileObjectToJSON(json: any): MessageFileObject {
      return MessageFileObjectToJSONTyped(json, false);
  }

  export function MessageFileObjectToJSONTyped(value?: MessageFileObject | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'id': value['id'],
        'object': value['object'],
        'created_at': value['createdAt'],
        'message_id': value['messageId'],
    };
}

