/* tslint:disable */
/* eslint-disable */
/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { ChatCompletionStreamResponseDelta } from './ChatCompletionStreamResponseDelta';
import {
    ChatCompletionStreamResponseDeltaFromJSON,
    ChatCompletionStreamResponseDeltaFromJSONTyped,
    ChatCompletionStreamResponseDeltaToJSON,
} from './ChatCompletionStreamResponseDelta';

/**
 * 
 * @export
 * @interface CreateChatCompletionStreamResponseChoicesInner
 */
export interface CreateChatCompletionStreamResponseChoicesInner {
    /**
     * 
     * @type {number}
     * @memberof CreateChatCompletionStreamResponseChoicesInner
     */
    index?: number;
    /**
     * 
     * @type {ChatCompletionStreamResponseDelta}
     * @memberof CreateChatCompletionStreamResponseChoicesInner
     */
    delta?: ChatCompletionStreamResponseDelta;
    /**
     * 
     * @type {string}
     * @memberof CreateChatCompletionStreamResponseChoicesInner
     */
    finishReason?: CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum;
}


/**
 * @export
 */
export const CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum = {
    Stop: 'stop',
    Length: 'length',
    FunctionCall: 'function_call'
} as const;
export type CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum = typeof CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum[keyof typeof CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum];


/**
 * Check if a given object implements the CreateChatCompletionStreamResponseChoicesInner interface.
 */
export function instanceOfCreateChatCompletionStreamResponseChoicesInner(value: object): boolean {
    return true;
}

export function CreateChatCompletionStreamResponseChoicesInnerFromJSON(json: any): CreateChatCompletionStreamResponseChoicesInner {
    return CreateChatCompletionStreamResponseChoicesInnerFromJSONTyped(json, false);
}

export function CreateChatCompletionStreamResponseChoicesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateChatCompletionStreamResponseChoicesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'index': json['index'] == null ? undefined : json['index'],
        'delta': json['delta'] == null ? undefined : ChatCompletionStreamResponseDeltaFromJSON(json['delta']),
        'finishReason': json['finish_reason'] == null ? undefined : json['finish_reason'],
    };
}

export function CreateChatCompletionStreamResponseChoicesInnerToJSON(value?: CreateChatCompletionStreamResponseChoicesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'index': value['index'],
        'delta': ChatCompletionStreamResponseDeltaToJSON(value['delta']),
        'finish_reason': value['finishReason'],
    };
}

