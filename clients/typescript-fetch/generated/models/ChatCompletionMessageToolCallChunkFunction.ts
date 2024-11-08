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
 * @interface ChatCompletionMessageToolCallChunkFunction
 */
export interface ChatCompletionMessageToolCallChunkFunction {
    /**
     * The name of the function to call.
     * @type {string}
     * @memberof ChatCompletionMessageToolCallChunkFunction
     */
    name?: string;
    /**
     * The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
     * @type {string}
     * @memberof ChatCompletionMessageToolCallChunkFunction
     */
    arguments?: string;
}

/**
 * Check if a given object implements the ChatCompletionMessageToolCallChunkFunction interface.
 */
export function instanceOfChatCompletionMessageToolCallChunkFunction(value: object): value is ChatCompletionMessageToolCallChunkFunction {
    return true;
}

export function ChatCompletionMessageToolCallChunkFunctionFromJSON(json: any): ChatCompletionMessageToolCallChunkFunction {
    return ChatCompletionMessageToolCallChunkFunctionFromJSONTyped(json, false);
}

export function ChatCompletionMessageToolCallChunkFunctionFromJSONTyped(json: any, ignoreDiscriminator: boolean): ChatCompletionMessageToolCallChunkFunction {
    if (json == null) {
        return json;
    }
    return {
        
        'name': json['name'] == null ? undefined : json['name'],
        'arguments': json['arguments'] == null ? undefined : json['arguments'],
    };
}

  export function ChatCompletionMessageToolCallChunkFunctionToJSON(json: any): ChatCompletionMessageToolCallChunkFunction {
      return ChatCompletionMessageToolCallChunkFunctionToJSONTyped(json, false);
  }

  export function ChatCompletionMessageToolCallChunkFunctionToJSONTyped(value?: ChatCompletionMessageToolCallChunkFunction | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'name': value['name'],
        'arguments': value['arguments'],
    };
}

