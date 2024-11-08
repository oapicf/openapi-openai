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
 * An object specifying the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than `gpt-3.5-turbo-1106`.
 * 
 * Setting to `{ "type": "json_object" }` enables JSON mode, which guarantees the message the model generates is valid JSON.
 * 
 * **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly "stuck" request. Also note that the message content may be partially cut off if `finish_reason="length"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length.
 * 
 * @export
 * @interface CreateChatCompletionRequestResponseFormat
 */
export interface CreateChatCompletionRequestResponseFormat {
    /**
     * Must be one of `text` or `json_object`.
     * @type {string}
     * @memberof CreateChatCompletionRequestResponseFormat
     */
    type?: CreateChatCompletionRequestResponseFormatTypeEnum;
}


/**
 * @export
 */
export const CreateChatCompletionRequestResponseFormatTypeEnum = {
    Text: 'text',
    JsonObject: 'json_object'
} as const;
export type CreateChatCompletionRequestResponseFormatTypeEnum = typeof CreateChatCompletionRequestResponseFormatTypeEnum[keyof typeof CreateChatCompletionRequestResponseFormatTypeEnum];


/**
 * Check if a given object implements the CreateChatCompletionRequestResponseFormat interface.
 */
export function instanceOfCreateChatCompletionRequestResponseFormat(value: object): value is CreateChatCompletionRequestResponseFormat {
    return true;
}

export function CreateChatCompletionRequestResponseFormatFromJSON(json: any): CreateChatCompletionRequestResponseFormat {
    return CreateChatCompletionRequestResponseFormatFromJSONTyped(json, false);
}

export function CreateChatCompletionRequestResponseFormatFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateChatCompletionRequestResponseFormat {
    if (json == null) {
        return json;
    }
    return {
        
        'type': json['type'] == null ? undefined : json['type'],
    };
}

  export function CreateChatCompletionRequestResponseFormatToJSON(json: any): CreateChatCompletionRequestResponseFormat {
      return CreateChatCompletionRequestResponseFormatToJSONTyped(json, false);
  }

  export function CreateChatCompletionRequestResponseFormatToJSONTyped(value?: CreateChatCompletionRequestResponseFormat | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'type': value['type'],
    };
}

