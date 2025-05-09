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
 * @interface CreateCompletionResponseChoicesInnerLogprobs
 */
export interface CreateCompletionResponseChoicesInnerLogprobs {
    /**
     * 
     * @type {Array<number>}
     * @memberof CreateCompletionResponseChoicesInnerLogprobs
     */
    textOffset?: Array<number>;
    /**
     * 
     * @type {Array<number>}
     * @memberof CreateCompletionResponseChoicesInnerLogprobs
     */
    tokenLogprobs?: Array<number>;
    /**
     * 
     * @type {Array<string>}
     * @memberof CreateCompletionResponseChoicesInnerLogprobs
     */
    tokens?: Array<string>;
    /**
     * 
     * @type {Array<{ [key: string]: number; }>}
     * @memberof CreateCompletionResponseChoicesInnerLogprobs
     */
    topLogprobs?: Array<{ [key: string]: number; }>;
}

/**
 * Check if a given object implements the CreateCompletionResponseChoicesInnerLogprobs interface.
 */
export function instanceOfCreateCompletionResponseChoicesInnerLogprobs(value: object): value is CreateCompletionResponseChoicesInnerLogprobs {
    return true;
}

export function CreateCompletionResponseChoicesInnerLogprobsFromJSON(json: any): CreateCompletionResponseChoicesInnerLogprobs {
    return CreateCompletionResponseChoicesInnerLogprobsFromJSONTyped(json, false);
}

export function CreateCompletionResponseChoicesInnerLogprobsFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateCompletionResponseChoicesInnerLogprobs {
    if (json == null) {
        return json;
    }
    return {
        
        'textOffset': json['text_offset'] == null ? undefined : json['text_offset'],
        'tokenLogprobs': json['token_logprobs'] == null ? undefined : json['token_logprobs'],
        'tokens': json['tokens'] == null ? undefined : json['tokens'],
        'topLogprobs': json['top_logprobs'] == null ? undefined : json['top_logprobs'],
    };
}

  export function CreateCompletionResponseChoicesInnerLogprobsToJSON(json: any): CreateCompletionResponseChoicesInnerLogprobs {
      return CreateCompletionResponseChoicesInnerLogprobsToJSONTyped(json, false);
  }

  export function CreateCompletionResponseChoicesInnerLogprobsToJSONTyped(value?: CreateCompletionResponseChoicesInnerLogprobs | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'text_offset': value['textOffset'],
        'token_logprobs': value['tokenLogprobs'],
        'tokens': value['tokens'],
        'top_logprobs': value['topLogprobs'],
    };
}

