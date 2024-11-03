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
import type { CreateChatCompletionStreamResponseChoicesInner } from './CreateChatCompletionStreamResponseChoicesInner';
import {
    CreateChatCompletionStreamResponseChoicesInnerFromJSON,
    CreateChatCompletionStreamResponseChoicesInnerFromJSONTyped,
    CreateChatCompletionStreamResponseChoicesInnerToJSON,
    CreateChatCompletionStreamResponseChoicesInnerToJSONTyped,
} from './CreateChatCompletionStreamResponseChoicesInner';

/**
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 * @export
 * @interface CreateChatCompletionStreamResponse
 */
export interface CreateChatCompletionStreamResponse {
    /**
     * A unique identifier for the chat completion. Each chunk has the same ID.
     * @type {string}
     * @memberof CreateChatCompletionStreamResponse
     */
    id: string;
    /**
     * A list of chat completion choices. Can be more than one if `n` is greater than 1.
     * @type {Array<CreateChatCompletionStreamResponseChoicesInner>}
     * @memberof CreateChatCompletionStreamResponse
     */
    choices: Array<CreateChatCompletionStreamResponseChoicesInner>;
    /**
     * The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
     * @type {number}
     * @memberof CreateChatCompletionStreamResponse
     */
    created: number;
    /**
     * The model to generate the completion.
     * @type {string}
     * @memberof CreateChatCompletionStreamResponse
     */
    model: string;
    /**
     * This fingerprint represents the backend configuration that the model runs with.
     * Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.
     * 
     * @type {string}
     * @memberof CreateChatCompletionStreamResponse
     */
    systemFingerprint?: string;
    /**
     * The object type, which is always `chat.completion.chunk`.
     * @type {string}
     * @memberof CreateChatCompletionStreamResponse
     */
    object: CreateChatCompletionStreamResponseObjectEnum;
}


/**
 * @export
 */
export const CreateChatCompletionStreamResponseObjectEnum = {
    ChatCompletionChunk: 'chat.completion.chunk'
} as const;
export type CreateChatCompletionStreamResponseObjectEnum = typeof CreateChatCompletionStreamResponseObjectEnum[keyof typeof CreateChatCompletionStreamResponseObjectEnum];


/**
 * Check if a given object implements the CreateChatCompletionStreamResponse interface.
 */
export function instanceOfCreateChatCompletionStreamResponse(value: object): value is CreateChatCompletionStreamResponse {
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('choices' in value) || value['choices'] === undefined) return false;
    if (!('created' in value) || value['created'] === undefined) return false;
    if (!('model' in value) || value['model'] === undefined) return false;
    if (!('object' in value) || value['object'] === undefined) return false;
    return true;
}

export function CreateChatCompletionStreamResponseFromJSON(json: any): CreateChatCompletionStreamResponse {
    return CreateChatCompletionStreamResponseFromJSONTyped(json, false);
}

export function CreateChatCompletionStreamResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateChatCompletionStreamResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'choices': ((json['choices'] as Array<any>).map(CreateChatCompletionStreamResponseChoicesInnerFromJSON)),
        'created': json['created'],
        'model': json['model'],
        'systemFingerprint': json['system_fingerprint'] == null ? undefined : json['system_fingerprint'],
        'object': json['object'],
    };
}

  export function CreateChatCompletionStreamResponseToJSON(json: any): CreateChatCompletionStreamResponse {
      return CreateChatCompletionStreamResponseToJSONTyped(json, false);
  }

  export function CreateChatCompletionStreamResponseToJSONTyped(value?: CreateChatCompletionStreamResponse | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'id': value['id'],
        'choices': ((value['choices'] as Array<any>).map(CreateChatCompletionStreamResponseChoicesInnerToJSON)),
        'created': value['created'],
        'model': value['model'],
        'system_fingerprint': value['systemFingerprint'],
        'object': value['object'],
    };
}

