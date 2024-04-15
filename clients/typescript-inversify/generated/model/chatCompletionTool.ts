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
import { FunctionObject } from './functionObject';


export interface ChatCompletionTool { 
    /**
     * The type of the tool. Currently, only `function` is supported.
     */
    type: ChatCompletionTool.TypeEnum;
    _function: FunctionObject;
}
export namespace ChatCompletionTool {
    export type TypeEnum = 'function';
    export const TypeEnum = {
        Function: 'function' as TypeEnum
    }
}