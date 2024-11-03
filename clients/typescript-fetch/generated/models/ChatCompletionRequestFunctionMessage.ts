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
 * @interface ChatCompletionRequestFunctionMessage
 */
export interface ChatCompletionRequestFunctionMessage {
    /**
     * The role of the messages author, in this case `function`.
     * @type {string}
     * @memberof ChatCompletionRequestFunctionMessage
     */
    role: ChatCompletionRequestFunctionMessageRoleEnum;
    /**
     * The contents of the function message.
     * @type {string}
     * @memberof ChatCompletionRequestFunctionMessage
     */
    content: string | null;
    /**
     * The name of the function to call.
     * @type {string}
     * @memberof ChatCompletionRequestFunctionMessage
     */
    name: string;
}


/**
 * @export
 */
export const ChatCompletionRequestFunctionMessageRoleEnum = {
    Function: 'function'
} as const;
export type ChatCompletionRequestFunctionMessageRoleEnum = typeof ChatCompletionRequestFunctionMessageRoleEnum[keyof typeof ChatCompletionRequestFunctionMessageRoleEnum];


/**
 * Check if a given object implements the ChatCompletionRequestFunctionMessage interface.
 */
export function instanceOfChatCompletionRequestFunctionMessage(value: object): value is ChatCompletionRequestFunctionMessage {
    if (!('role' in value) || value['role'] === undefined) return false;
    if (!('content' in value) || value['content'] === undefined) return false;
    if (!('name' in value) || value['name'] === undefined) return false;
    return true;
}

export function ChatCompletionRequestFunctionMessageFromJSON(json: any): ChatCompletionRequestFunctionMessage {
    return ChatCompletionRequestFunctionMessageFromJSONTyped(json, false);
}

export function ChatCompletionRequestFunctionMessageFromJSONTyped(json: any, ignoreDiscriminator: boolean): ChatCompletionRequestFunctionMessage {
    if (json == null) {
        return json;
    }
    return {
        
        'role': json['role'],
        'content': json['content'],
        'name': json['name'],
    };
}

  export function ChatCompletionRequestFunctionMessageToJSON(json: any): ChatCompletionRequestFunctionMessage {
      return ChatCompletionRequestFunctionMessageToJSONTyped(json, false);
  }

  export function ChatCompletionRequestFunctionMessageToJSONTyped(value?: ChatCompletionRequestFunctionMessage | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'role': value['role'],
        'content': value['content'],
        'name': value['name'],
    };
}

