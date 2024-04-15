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

import type {
    ChatCompletionTokenLogprob,
} from './';

/**
 * Log probability information for the choice.
 * @export
 * @interface CreateChatCompletionResponseChoicesInnerLogprobs
 */
export interface CreateChatCompletionResponseChoicesInnerLogprobs {
    /**
     * A list of message content tokens with log probability information.
     * @type {Array<ChatCompletionTokenLogprob>}
     * @memberof CreateChatCompletionResponseChoicesInnerLogprobs
     */
    content: Array<ChatCompletionTokenLogprob> | null;
}