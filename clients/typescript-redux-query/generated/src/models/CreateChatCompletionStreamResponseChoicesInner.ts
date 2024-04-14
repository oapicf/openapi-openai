// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    ChatCompletionStreamResponseDelta,
    ChatCompletionStreamResponseDeltaFromJSON,
    ChatCompletionStreamResponseDeltaToJSON,
    CreateChatCompletionResponseChoicesInnerLogprobs,
    CreateChatCompletionResponseChoicesInnerLogprobsFromJSON,
    CreateChatCompletionResponseChoicesInnerLogprobsToJSON,
} from './';

/**
 * 
 * @export
 * @interface CreateChatCompletionStreamResponseChoicesInner
 */
export interface CreateChatCompletionStreamResponseChoicesInner  {
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
    logprobs?: CreateChatCompletionResponseChoicesInnerLogprobs;
    /**
     * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
     * @type {string}
     * @memberof CreateChatCompletionStreamResponseChoicesInner
     */
    finishReason: CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum;
    /**
     * The index of the choice in the list of choices.
     * @type {number}
     * @memberof CreateChatCompletionStreamResponseChoicesInner
     */
    index: number;
}

export function CreateChatCompletionStreamResponseChoicesInnerFromJSON(json: any): CreateChatCompletionStreamResponseChoicesInner {
    return {
        'delta': ChatCompletionStreamResponseDeltaFromJSON(json['delta']),
        'logprobs': !exists(json, 'logprobs') ? undefined : CreateChatCompletionResponseChoicesInnerLogprobsFromJSON(json['logprobs']),
        'finishReason': json['finish_reason'],
        'index': json['index'],
    };
}

export function CreateChatCompletionStreamResponseChoicesInnerToJSON(value?: CreateChatCompletionStreamResponseChoicesInner): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'delta': ChatCompletionStreamResponseDeltaToJSON(value.delta),
        'logprobs': CreateChatCompletionResponseChoicesInnerLogprobsToJSON(value.logprobs),
        'finish_reason': value.finishReason,
        'index': value.index,
    };
}

/**
* @export
* @enum {string}
*/
export enum CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum {
    Stop = 'stop',
    Length = 'length',
    ToolCalls = 'tool_calls',
    ContentFilter = 'content_filter',
    FunctionCall = 'function_call'
}


