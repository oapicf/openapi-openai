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
/**
 * 
 * @export
 * @interface ChatCompletionTokenLogprobTopLogprobsInner
 */
export interface ChatCompletionTokenLogprobTopLogprobsInner {
    /**
     * The token.
     * @type {string}
     * @memberof ChatCompletionTokenLogprobTopLogprobsInner
     */
    token: string;
    /**
     * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
     * @type {number}
     * @memberof ChatCompletionTokenLogprobTopLogprobsInner
     */
    logprob: number;
    /**
     * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
     * @type {Array<number>}
     * @memberof ChatCompletionTokenLogprobTopLogprobsInner
     */
    bytes: Array<number> | null;
}

/**
 * Check if a given object implements the ChatCompletionTokenLogprobTopLogprobsInner interface.
 */
export function instanceOfChatCompletionTokenLogprobTopLogprobsInner(value: object): boolean {
    if (!('token' in value)) return false;
    if (!('logprob' in value)) return false;
    if (!('bytes' in value)) return false;
    return true;
}

export function ChatCompletionTokenLogprobTopLogprobsInnerFromJSON(json: any): ChatCompletionTokenLogprobTopLogprobsInner {
    return ChatCompletionTokenLogprobTopLogprobsInnerFromJSONTyped(json, false);
}

export function ChatCompletionTokenLogprobTopLogprobsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): ChatCompletionTokenLogprobTopLogprobsInner {
    if (json == null) {
        return json;
    }
    return {
        
        'token': json['token'],
        'logprob': json['logprob'],
        'bytes': json['bytes'],
    };
}

export function ChatCompletionTokenLogprobTopLogprobsInnerToJSON(value?: ChatCompletionTokenLogprobTopLogprobsInner | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'token': value['token'],
        'logprob': value['logprob'],
        'bytes': value['bytes'],
    };
}

