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

import * as models from './models';

export interface ChatCompletionMessageToolCallChunk {
    index: number;

    /**
     * The ID of the tool call.
     */
    id?: string;

    /**
     * The type of the tool. Currently, only `function` is supported.
     */
    type?: ChatCompletionMessageToolCallChunk.TypeEnum;

    _function?: models.ChatCompletionMessageToolCallChunkFunction;

}
export namespace ChatCompletionMessageToolCallChunk {
    export enum TypeEnum {
        Function = <any> 'function'
    }
}