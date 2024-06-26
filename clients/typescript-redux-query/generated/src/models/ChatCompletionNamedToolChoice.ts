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
    ChatCompletionNamedToolChoiceFunction,
    ChatCompletionNamedToolChoiceFunctionFromJSON,
    ChatCompletionNamedToolChoiceFunctionToJSON,
} from './';

/**
 * Specifies a tool the model should use. Use to force the model to call a specific function.
 * @export
 * @interface ChatCompletionNamedToolChoice
 */
export interface ChatCompletionNamedToolChoice  {
    /**
     * The type of the tool. Currently, only `function` is supported.
     * @type {string}
     * @memberof ChatCompletionNamedToolChoice
     */
    type: ChatCompletionNamedToolChoiceTypeEnum;
    /**
     * 
     * @type {ChatCompletionNamedToolChoiceFunction}
     * @memberof ChatCompletionNamedToolChoice
     */
    _function: ChatCompletionNamedToolChoiceFunction;
}

export function ChatCompletionNamedToolChoiceFromJSON(json: any): ChatCompletionNamedToolChoice {
    return {
        'type': json['type'],
        '_function': ChatCompletionNamedToolChoiceFunctionFromJSON(json['function']),
    };
}

export function ChatCompletionNamedToolChoiceToJSON(value?: ChatCompletionNamedToolChoice): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'type': value.type,
        'function': ChatCompletionNamedToolChoiceFunctionToJSON(value._function),
    };
}

/**
* @export
* @enum {string}
*/
export enum ChatCompletionNamedToolChoiceTypeEnum {
    Function = 'function'
}


