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
import type { CreateChatCompletionResponseChoicesInnerLogprobs } from './CreateChatCompletionResponseChoicesInnerLogprobs';
import {
    CreateChatCompletionResponseChoicesInnerLogprobsFromJSON,
    CreateChatCompletionResponseChoicesInnerLogprobsFromJSONTyped,
    CreateChatCompletionResponseChoicesInnerLogprobsToJSON,
    CreateChatCompletionResponseChoicesInnerLogprobsToJSONTyped,
} from './CreateChatCompletionResponseChoicesInnerLogprobs';
import type { ChatCompletionStreamResponseDelta } from './ChatCompletionStreamResponseDelta';
import {
    ChatCompletionStreamResponseDeltaFromJSON,
    ChatCompletionStreamResponseDeltaFromJSONTyped,
    ChatCompletionStreamResponseDeltaToJSON,
    ChatCompletionStreamResponseDeltaToJSONTyped,
} from './ChatCompletionStreamResponseDelta';

/**
 * 
 * @export
 * @interface CreateChatCompletionStreamResponseChoicesInner
 */
export interface CreateChatCompletionStreamResponseChoicesInner {
    /**
     * 
     * @type {ChatCompletionStreamResponseDelta}
     * @memberof CreateChatCompletionStreamResponseChoicesInner
     */
    delta: ChatCompletionStreamResponseDelta;
    /**
     * 
     * @type {CreateChatCompletionResponseChoicesInnerLogprobs}
     * @memberof CreateChatCompletionStreamResponseChoicesInner
     */
    logprobs?: CreateChatCompletionResponseChoicesInnerLogprobs | null;
    /**
     * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence,
     * `length` if the maximum number of tokens specified in the request was reached,
     * `content_filter` if content was omitted due to a flag from our content filters,
     * `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.
     * 
     * @type {string}
     * @memberof CreateChatCompletionStreamResponseChoicesInner
     */
    finishReason: CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum | null;
    /**
     * The index of the choice in the list of choices.
     * @type {number}
     * @memberof CreateChatCompletionStreamResponseChoicesInner
     */
    index: number;
}


/**
 * @export
 */
export const CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum = {
    Stop: 'stop',
    Length: 'length',
    ToolCalls: 'tool_calls',
    ContentFilter: 'content_filter',
    FunctionCall: 'function_call'
} as const;
export type CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum = typeof CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum[keyof typeof CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum];


/**
 * Check if a given object implements the CreateChatCompletionStreamResponseChoicesInner interface.
 */
export function instanceOfCreateChatCompletionStreamResponseChoicesInner(value: object): value is CreateChatCompletionStreamResponseChoicesInner {
    if (!('delta' in value) || value['delta'] === undefined) return false;
    if (!('finishReason' in value) || value['finishReason'] === undefined) return false;
    if (!('index' in value) || value['index'] === undefined) return false;
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
        
        'delta': ChatCompletionStreamResponseDeltaFromJSON(json['delta']),
        'logprobs': json['logprobs'] == null ? undefined : CreateChatCompletionResponseChoicesInnerLogprobsFromJSON(json['logprobs']),
        'finishReason': json['finish_reason'],
        'index': json['index'],
    };
}

  export function CreateChatCompletionStreamResponseChoicesInnerToJSON(json: any): CreateChatCompletionStreamResponseChoicesInner {
      return CreateChatCompletionStreamResponseChoicesInnerToJSONTyped(json, false);
  }

  export function CreateChatCompletionStreamResponseChoicesInnerToJSONTyped(value?: CreateChatCompletionStreamResponseChoicesInner | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'delta': ChatCompletionStreamResponseDeltaToJSON(value['delta']),
        'logprobs': CreateChatCompletionResponseChoicesInnerLogprobsToJSON(value['logprobs']),
        'finish_reason': value['finishReason'],
        'index': value['index'],
    };
}

