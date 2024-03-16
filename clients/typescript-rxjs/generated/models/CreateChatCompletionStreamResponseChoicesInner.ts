// tslint:disable
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

import type {
    ChatCompletionStreamResponseDelta,
} from './';

/**
 * @export
 * @interface CreateChatCompletionStreamResponseChoicesInner
 */
export interface CreateChatCompletionStreamResponseChoicesInner {
    /**
     * @type {number}
     * @memberof CreateChatCompletionStreamResponseChoicesInner
     */
    index?: number;
    /**
     * @type {ChatCompletionStreamResponseDelta}
     * @memberof CreateChatCompletionStreamResponseChoicesInner
     */
    delta?: ChatCompletionStreamResponseDelta;
    /**
     * @type {string}
     * @memberof CreateChatCompletionStreamResponseChoicesInner
     */
    finish_reason?: CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum;
}

/**
 * @export
 * @enum {string}
 */
export enum CreateChatCompletionStreamResponseChoicesInnerFinishReasonEnum {
    Stop = 'stop',
    Length = 'length',
    FunctionCall = 'function_call'
}

