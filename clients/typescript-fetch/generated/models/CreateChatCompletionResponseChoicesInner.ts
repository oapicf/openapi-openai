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
import type { ChatCompletionResponseMessage } from './ChatCompletionResponseMessage';
import {
    ChatCompletionResponseMessageFromJSON,
    ChatCompletionResponseMessageFromJSONTyped,
    ChatCompletionResponseMessageToJSON,
} from './ChatCompletionResponseMessage';

/**
 * 
 * @export
 * @interface CreateChatCompletionResponseChoicesInner
 */
export interface CreateChatCompletionResponseChoicesInner {
    /**
     * 
     * @type {number}
     * @memberof CreateChatCompletionResponseChoicesInner
     */
    index?: number;
    /**
     * 
     * @type {ChatCompletionResponseMessage}
     * @memberof CreateChatCompletionResponseChoicesInner
     */
    message?: ChatCompletionResponseMessage;
    /**
     * 
     * @type {string}
     * @memberof CreateChatCompletionResponseChoicesInner
     */
    finishReason?: CreateChatCompletionResponseChoicesInnerFinishReasonEnum;
}


/**
 * @export
 */
export const CreateChatCompletionResponseChoicesInnerFinishReasonEnum = {
    Stop: 'stop',
    Length: 'length',
    FunctionCall: 'function_call'
} as const;
export type CreateChatCompletionResponseChoicesInnerFinishReasonEnum = typeof CreateChatCompletionResponseChoicesInnerFinishReasonEnum[keyof typeof CreateChatCompletionResponseChoicesInnerFinishReasonEnum];


/**
 * Check if a given object implements the CreateChatCompletionResponseChoicesInner interface.
 */
export function instanceOfCreateChatCompletionResponseChoicesInner(value: object): boolean {
    return true;
}

export function CreateChatCompletionResponseChoicesInnerFromJSON(json: any): CreateChatCompletionResponseChoicesInner {
    return CreateChatCompletionResponseChoicesInnerFromJSONTyped(json, false);
}

export function CreateChatCompletionResponseChoicesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateChatCompletionResponseChoicesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'index': json['index'] == null ? undefined : json['index'],
        'message': json['message'] == null ? undefined : ChatCompletionResponseMessageFromJSON(json['message']),
        'finishReason': json['finish_reason'] == null ? undefined : json['finish_reason'],
    };
}

export function CreateChatCompletionResponseChoicesInnerToJSON(value?: CreateChatCompletionResponseChoicesInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'index': value['index'],
        'message': ChatCompletionResponseMessageToJSON(value['message']),
        'finish_reason': value['finishReason'],
    };
}

