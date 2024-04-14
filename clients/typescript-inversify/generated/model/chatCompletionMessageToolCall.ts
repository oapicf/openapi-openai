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
import { ChatCompletionMessageToolCallFunction } from './chatCompletionMessageToolCallFunction';


export interface ChatCompletionMessageToolCall { 
    /**
     * The ID of the tool call.
     */
    id: string;
    /**
     * The type of the tool. Currently, only `function` is supported.
     */
    type: ChatCompletionMessageToolCall.TypeEnum;
    _function: ChatCompletionMessageToolCallFunction;
}
export namespace ChatCompletionMessageToolCall {
    export type TypeEnum = 'function';
    export const TypeEnum = {
        Function: 'function' as TypeEnum
    }
}
