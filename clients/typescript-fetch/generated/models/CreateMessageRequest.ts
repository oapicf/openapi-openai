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
 * 
 * @export
 * @interface CreateMessageRequest
 */
export interface CreateMessageRequest {
    /**
     * The role of the entity that is creating the message. Allowed values include:
     * - `user`: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages.
     * - `assistant`: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation.
     * 
     * @type {string}
     * @memberof CreateMessageRequest
     */
    role: CreateMessageRequestRoleEnum;
    /**
     * The content of the message.
     * @type {string}
     * @memberof CreateMessageRequest
     */
    content: string;
    /**
     * A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and `code_interpreter` that can access and use files.
     * @type {Array<string>}
     * @memberof CreateMessageRequest
     */
    fileIds?: Array<string>;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * 
     * @type {object}
     * @memberof CreateMessageRequest
     */
    metadata?: object | null;
}


/**
 * @export
 */
export const CreateMessageRequestRoleEnum = {
    User: 'user',
    Assistant: 'assistant'
} as const;
export type CreateMessageRequestRoleEnum = typeof CreateMessageRequestRoleEnum[keyof typeof CreateMessageRequestRoleEnum];


/**
 * Check if a given object implements the CreateMessageRequest interface.
 */
export function instanceOfCreateMessageRequest(value: object): value is CreateMessageRequest {
    if (!('role' in value) || value['role'] === undefined) return false;
    if (!('content' in value) || value['content'] === undefined) return false;
    return true;
}

export function CreateMessageRequestFromJSON(json: any): CreateMessageRequest {
    return CreateMessageRequestFromJSONTyped(json, false);
}

export function CreateMessageRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateMessageRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'role': json['role'],
        'content': json['content'],
        'fileIds': json['file_ids'] == null ? undefined : json['file_ids'],
        'metadata': json['metadata'] == null ? undefined : json['metadata'],
    };
}

  export function CreateMessageRequestToJSON(json: any): CreateMessageRequest {
      return CreateMessageRequestToJSONTyped(json, false);
  }

  export function CreateMessageRequestToJSONTyped(value?: CreateMessageRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'role': value['role'],
        'content': value['content'],
        'file_ids': value['fileIds'],
        'metadata': value['metadata'],
    };
}

