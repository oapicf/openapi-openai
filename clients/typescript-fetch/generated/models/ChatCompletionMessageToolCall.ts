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
import type { ChatCompletionMessageToolCallFunction } from './ChatCompletionMessageToolCallFunction';
import {
    ChatCompletionMessageToolCallFunctionFromJSON,
    ChatCompletionMessageToolCallFunctionFromJSONTyped,
    ChatCompletionMessageToolCallFunctionToJSON,
} from './ChatCompletionMessageToolCallFunction';

/**
 * 
 * @export
 * @interface ChatCompletionMessageToolCall
 */
export interface ChatCompletionMessageToolCall {
    /**
     * The ID of the tool call.
     * @type {string}
     * @memberof ChatCompletionMessageToolCall
     */
    id: string;
    /**
     * The type of the tool. Currently, only `function` is supported.
     * @type {string}
     * @memberof ChatCompletionMessageToolCall
     */
    type: ChatCompletionMessageToolCallTypeEnum;
    /**
     * 
     * @type {ChatCompletionMessageToolCallFunction}
     * @memberof ChatCompletionMessageToolCall
     */
    _function: ChatCompletionMessageToolCallFunction;
}


/**
 * @export
 */
export const ChatCompletionMessageToolCallTypeEnum = {
    Function: 'function'
} as const;
export type ChatCompletionMessageToolCallTypeEnum = typeof ChatCompletionMessageToolCallTypeEnum[keyof typeof ChatCompletionMessageToolCallTypeEnum];


/**
 * Check if a given object implements the ChatCompletionMessageToolCall interface.
 */
export function instanceOfChatCompletionMessageToolCall(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('type' in value)) return false;
    if (!('_function' in value)) return false;
    return true;
}

export function ChatCompletionMessageToolCallFromJSON(json: any): ChatCompletionMessageToolCall {
    return ChatCompletionMessageToolCallFromJSONTyped(json, false);
}

export function ChatCompletionMessageToolCallFromJSONTyped(json: any, ignoreDiscriminator: boolean): ChatCompletionMessageToolCall {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'type': json['type'],
        '_function': ChatCompletionMessageToolCallFunctionFromJSON(json['function']),
    };
}

export function ChatCompletionMessageToolCallToJSON(value?: ChatCompletionMessageToolCall | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'type': value['type'],
        'function': ChatCompletionMessageToolCallFunctionToJSON(value['_function']),
    };
}

