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
/**
 * Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
 * @export
 * @interface ChatCompletionFunctionCallOption
 */
export interface ChatCompletionFunctionCallOption  {
    /**
     * The name of the function to call.
     * @type {string}
     * @memberof ChatCompletionFunctionCallOption
     */
    name: string;
}

export function ChatCompletionFunctionCallOptionFromJSON(json: any): ChatCompletionFunctionCallOption {
    return {
        'name': json['name'],
    };
}

export function ChatCompletionFunctionCallOptionToJSON(value?: ChatCompletionFunctionCallOption): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'name': value.name,
    };
}

