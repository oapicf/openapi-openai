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
    FunctionObject,
} from './';

/**
 * @export
 * @interface ChatCompletionTool
 */
export interface ChatCompletionTool {
    /**
     * The type of the tool. Currently, only `function` is supported.
     * @type {string}
     * @memberof ChatCompletionTool
     */
    type: ChatCompletionToolTypeEnum;
    /**
     * @type {FunctionObject}
     * @memberof ChatCompletionTool
     */
    _function: FunctionObject;
}

/**
 * @export
 * @enum {string}
 */
export enum ChatCompletionToolTypeEnum {
    Function = 'function'
}
