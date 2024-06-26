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
import type { ChatCompletionTokenLogprobTopLogprobsInner } from './ChatCompletionTokenLogprobTopLogprobsInner';
import {
    ChatCompletionTokenLogprobTopLogprobsInnerFromJSON,
    ChatCompletionTokenLogprobTopLogprobsInnerFromJSONTyped,
    ChatCompletionTokenLogprobTopLogprobsInnerToJSON,
} from './ChatCompletionTokenLogprobTopLogprobsInner';

/**
 * 
 * @export
 * @interface ChatCompletionTokenLogprob
 */
export interface ChatCompletionTokenLogprob {
    /**
     * The token.
     * @type {string}
     * @memberof ChatCompletionTokenLogprob
     */
    token: string;
    /**
     * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
     * @type {number}
     * @memberof ChatCompletionTokenLogprob
     */
    logprob: number;
    /**
     * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
     * @type {Array<number>}
     * @memberof ChatCompletionTokenLogprob
     */
    bytes: Array<number> | null;
    /**
     * List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
     * @type {Array<ChatCompletionTokenLogprobTopLogprobsInner>}
     * @memberof ChatCompletionTokenLogprob
     */
    topLogprobs: Array<ChatCompletionTokenLogprobTopLogprobsInner>;
}

/**
 * Check if a given object implements the ChatCompletionTokenLogprob interface.
 */
export function instanceOfChatCompletionTokenLogprob(value: object): boolean {
    if (!('token' in value)) return false;
    if (!('logprob' in value)) return false;
    if (!('bytes' in value)) return false;
    if (!('topLogprobs' in value)) return false;
    return true;
}

export function ChatCompletionTokenLogprobFromJSON(json: any): ChatCompletionTokenLogprob {
    return ChatCompletionTokenLogprobFromJSONTyped(json, false);
}

export function ChatCompletionTokenLogprobFromJSONTyped(json: any, ignoreDiscriminator: boolean): ChatCompletionTokenLogprob {
    if (json == null) {
        return json;
    }
    return {
        
        'token': json['token'],
        'logprob': json['logprob'],
        'bytes': json['bytes'],
        'topLogprobs': ((json['top_logprobs'] as Array<any>).map(ChatCompletionTokenLogprobTopLogprobsInnerFromJSON)),
    };
}

export function ChatCompletionTokenLogprobToJSON(value?: ChatCompletionTokenLogprob | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'token': value['token'],
        'logprob': value['logprob'],
        'bytes': value['bytes'],
        'top_logprobs': ((value['topLogprobs'] as Array<any>).map(ChatCompletionTokenLogprobTopLogprobsInnerToJSON)),
    };
}

