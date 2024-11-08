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
import type { ChatCompletionResponseMessage } from './ChatCompletionResponseMessage';
import {
    ChatCompletionResponseMessageFromJSON,
    ChatCompletionResponseMessageFromJSONTyped,
    ChatCompletionResponseMessageToJSON,
    ChatCompletionResponseMessageToJSONTyped,
} from './ChatCompletionResponseMessage';

/**
 * 
 * @export
 * @interface CreateChatCompletionFunctionResponseChoicesInner
 */
export interface CreateChatCompletionFunctionResponseChoicesInner {
    /**
     * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function.
     * 
     * @type {string}
     * @memberof CreateChatCompletionFunctionResponseChoicesInner
     */
    finishReason: CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum;
    /**
     * The index of the choice in the list of choices.
     * @type {number}
     * @memberof CreateChatCompletionFunctionResponseChoicesInner
     */
    index: number;
    /**
     * 
     * @type {ChatCompletionResponseMessage}
     * @memberof CreateChatCompletionFunctionResponseChoicesInner
     */
    message: ChatCompletionResponseMessage;
}


/**
 * @export
 */
export const CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum = {
    Stop: 'stop',
    Length: 'length',
    FunctionCall: 'function_call',
    ContentFilter: 'content_filter'
} as const;
export type CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum = typeof CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum[keyof typeof CreateChatCompletionFunctionResponseChoicesInnerFinishReasonEnum];


/**
 * Check if a given object implements the CreateChatCompletionFunctionResponseChoicesInner interface.
 */
export function instanceOfCreateChatCompletionFunctionResponseChoicesInner(value: object): value is CreateChatCompletionFunctionResponseChoicesInner {
    if (!('finishReason' in value) || value['finishReason'] === undefined) return false;
    if (!('index' in value) || value['index'] === undefined) return false;
    if (!('message' in value) || value['message'] === undefined) return false;
    return true;
}

export function CreateChatCompletionFunctionResponseChoicesInnerFromJSON(json: any): CreateChatCompletionFunctionResponseChoicesInner {
    return CreateChatCompletionFunctionResponseChoicesInnerFromJSONTyped(json, false);
}

export function CreateChatCompletionFunctionResponseChoicesInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateChatCompletionFunctionResponseChoicesInner {
    if (json == null) {
        return json;
    }
    return {
        
        'finishReason': json['finish_reason'],
        'index': json['index'],
        'message': ChatCompletionResponseMessageFromJSON(json['message']),
    };
}

  export function CreateChatCompletionFunctionResponseChoicesInnerToJSON(json: any): CreateChatCompletionFunctionResponseChoicesInner {
      return CreateChatCompletionFunctionResponseChoicesInnerToJSONTyped(json, false);
  }

  export function CreateChatCompletionFunctionResponseChoicesInnerToJSONTyped(value?: CreateChatCompletionFunctionResponseChoicesInner | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'finish_reason': value['finishReason'],
        'index': value['index'],
        'message': ChatCompletionResponseMessageToJSON(value['message']),
    };
}

