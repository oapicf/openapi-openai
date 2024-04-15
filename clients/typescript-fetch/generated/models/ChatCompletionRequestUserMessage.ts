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
import type { ChatCompletionRequestUserMessageContent } from './ChatCompletionRequestUserMessageContent';
import {
    ChatCompletionRequestUserMessageContentFromJSON,
    ChatCompletionRequestUserMessageContentFromJSONTyped,
    ChatCompletionRequestUserMessageContentToJSON,
} from './ChatCompletionRequestUserMessageContent';

/**
 * 
 * @export
 * @interface ChatCompletionRequestUserMessage
 */
export interface ChatCompletionRequestUserMessage {
    /**
     * 
     * @type {ChatCompletionRequestUserMessageContent}
     * @memberof ChatCompletionRequestUserMessage
     */
    content: ChatCompletionRequestUserMessageContent;
    /**
     * The role of the messages author, in this case `user`.
     * @type {string}
     * @memberof ChatCompletionRequestUserMessage
     */
    role: ChatCompletionRequestUserMessageRoleEnum;
    /**
     * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
     * @type {string}
     * @memberof ChatCompletionRequestUserMessage
     */
    name?: string;
}


/**
 * @export
 */
export const ChatCompletionRequestUserMessageRoleEnum = {
    User: 'user'
} as const;
export type ChatCompletionRequestUserMessageRoleEnum = typeof ChatCompletionRequestUserMessageRoleEnum[keyof typeof ChatCompletionRequestUserMessageRoleEnum];


/**
 * Check if a given object implements the ChatCompletionRequestUserMessage interface.
 */
export function instanceOfChatCompletionRequestUserMessage(value: object): boolean {
    if (!('content' in value)) return false;
    if (!('role' in value)) return false;
    return true;
}

export function ChatCompletionRequestUserMessageFromJSON(json: any): ChatCompletionRequestUserMessage {
    return ChatCompletionRequestUserMessageFromJSONTyped(json, false);
}

export function ChatCompletionRequestUserMessageFromJSONTyped(json: any, ignoreDiscriminator: boolean): ChatCompletionRequestUserMessage {
    if (json == null) {
        return json;
    }
    return {
        
        'content': ChatCompletionRequestUserMessageContentFromJSON(json['content']),
        'role': json['role'],
        'name': json['name'] == null ? undefined : json['name'],
    };
}

export function ChatCompletionRequestUserMessageToJSON(value?: ChatCompletionRequestUserMessage | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'content': ChatCompletionRequestUserMessageContentToJSON(value['content']),
        'role': value['role'],
        'name': value['name'],
    };
}
