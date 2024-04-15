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
import type { ChatCompletionMessageToolCallChunkFunction } from './ChatCompletionMessageToolCallChunkFunction';
import {
    ChatCompletionMessageToolCallChunkFunctionFromJSON,
    ChatCompletionMessageToolCallChunkFunctionFromJSONTyped,
    ChatCompletionMessageToolCallChunkFunctionToJSON,
} from './ChatCompletionMessageToolCallChunkFunction';

/**
 * 
 * @export
 * @interface ChatCompletionMessageToolCallChunk
 */
export interface ChatCompletionMessageToolCallChunk {
    /**
     * 
     * @type {number}
     * @memberof ChatCompletionMessageToolCallChunk
     */
    index: number;
    /**
     * The ID of the tool call.
     * @type {string}
     * @memberof ChatCompletionMessageToolCallChunk
     */
    id?: string;
    /**
     * The type of the tool. Currently, only `function` is supported.
     * @type {string}
     * @memberof ChatCompletionMessageToolCallChunk
     */
    type?: ChatCompletionMessageToolCallChunkTypeEnum;
    /**
     * 
     * @type {ChatCompletionMessageToolCallChunkFunction}
     * @memberof ChatCompletionMessageToolCallChunk
     */
    _function?: ChatCompletionMessageToolCallChunkFunction;
}


/**
 * @export
 */
export const ChatCompletionMessageToolCallChunkTypeEnum = {
    Function: 'function'
} as const;
export type ChatCompletionMessageToolCallChunkTypeEnum = typeof ChatCompletionMessageToolCallChunkTypeEnum[keyof typeof ChatCompletionMessageToolCallChunkTypeEnum];


/**
 * Check if a given object implements the ChatCompletionMessageToolCallChunk interface.
 */
export function instanceOfChatCompletionMessageToolCallChunk(value: object): boolean {
    if (!('index' in value)) return false;
    return true;
}

export function ChatCompletionMessageToolCallChunkFromJSON(json: any): ChatCompletionMessageToolCallChunk {
    return ChatCompletionMessageToolCallChunkFromJSONTyped(json, false);
}

export function ChatCompletionMessageToolCallChunkFromJSONTyped(json: any, ignoreDiscriminator: boolean): ChatCompletionMessageToolCallChunk {
    if (json == null) {
        return json;
    }
    return {
        
        'index': json['index'],
        'id': json['id'] == null ? undefined : json['id'],
        'type': json['type'] == null ? undefined : json['type'],
        '_function': json['function'] == null ? undefined : ChatCompletionMessageToolCallChunkFunctionFromJSON(json['function']),
    };
}

export function ChatCompletionMessageToolCallChunkToJSON(value?: ChatCompletionMessageToolCallChunk | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'index': value['index'],
        'id': value['id'],
        'type': value['type'],
        'function': ChatCompletionMessageToolCallChunkFunctionToJSON(value['_function']),
    };
}
