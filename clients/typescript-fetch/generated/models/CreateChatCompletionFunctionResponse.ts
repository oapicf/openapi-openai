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
import type { CompletionUsage } from './CompletionUsage';
import {
    CompletionUsageFromJSON,
    CompletionUsageFromJSONTyped,
    CompletionUsageToJSON,
} from './CompletionUsage';
import type { CreateChatCompletionFunctionResponseChoicesInner } from './CreateChatCompletionFunctionResponseChoicesInner';
import {
    CreateChatCompletionFunctionResponseChoicesInnerFromJSON,
    CreateChatCompletionFunctionResponseChoicesInnerFromJSONTyped,
    CreateChatCompletionFunctionResponseChoicesInnerToJSON,
} from './CreateChatCompletionFunctionResponseChoicesInner';

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * @export
 * @interface CreateChatCompletionFunctionResponse
 */
export interface CreateChatCompletionFunctionResponse {
    /**
     * A unique identifier for the chat completion.
     * @type {string}
     * @memberof CreateChatCompletionFunctionResponse
     */
    id: string;
    /**
     * A list of chat completion choices. Can be more than one if `n` is greater than 1.
     * @type {Array<CreateChatCompletionFunctionResponseChoicesInner>}
     * @memberof CreateChatCompletionFunctionResponse
     */
    choices: Array<CreateChatCompletionFunctionResponseChoicesInner>;
    /**
     * The Unix timestamp (in seconds) of when the chat completion was created.
     * @type {number}
     * @memberof CreateChatCompletionFunctionResponse
     */
    created: number;
    /**
     * The model used for the chat completion.
     * @type {string}
     * @memberof CreateChatCompletionFunctionResponse
     */
    model: string;
    /**
     * This fingerprint represents the backend configuration that the model runs with.
     * 
     * Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism.
     * 
     * @type {string}
     * @memberof CreateChatCompletionFunctionResponse
     */
    systemFingerprint?: string;
    /**
     * The object type, which is always `chat.completion`.
     * @type {string}
     * @memberof CreateChatCompletionFunctionResponse
     */
    object: CreateChatCompletionFunctionResponseObjectEnum;
    /**
     * 
     * @type {CompletionUsage}
     * @memberof CreateChatCompletionFunctionResponse
     */
    usage?: CompletionUsage;
}


/**
 * @export
 */
export const CreateChatCompletionFunctionResponseObjectEnum = {
    ChatCompletion: 'chat.completion'
} as const;
export type CreateChatCompletionFunctionResponseObjectEnum = typeof CreateChatCompletionFunctionResponseObjectEnum[keyof typeof CreateChatCompletionFunctionResponseObjectEnum];


/**
 * Check if a given object implements the CreateChatCompletionFunctionResponse interface.
 */
export function instanceOfCreateChatCompletionFunctionResponse(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('choices' in value)) return false;
    if (!('created' in value)) return false;
    if (!('model' in value)) return false;
    if (!('object' in value)) return false;
    return true;
}

export function CreateChatCompletionFunctionResponseFromJSON(json: any): CreateChatCompletionFunctionResponse {
    return CreateChatCompletionFunctionResponseFromJSONTyped(json, false);
}

export function CreateChatCompletionFunctionResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateChatCompletionFunctionResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'choices': ((json['choices'] as Array<any>).map(CreateChatCompletionFunctionResponseChoicesInnerFromJSON)),
        'created': json['created'],
        'model': json['model'],
        'systemFingerprint': json['system_fingerprint'] == null ? undefined : json['system_fingerprint'],
        'object': json['object'],
        'usage': json['usage'] == null ? undefined : CompletionUsageFromJSON(json['usage']),
    };
}

export function CreateChatCompletionFunctionResponseToJSON(value?: CreateChatCompletionFunctionResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'choices': ((value['choices'] as Array<any>).map(CreateChatCompletionFunctionResponseChoicesInnerToJSON)),
        'created': value['created'],
        'model': value['model'],
        'system_fingerprint': value['systemFingerprint'],
        'object': value['object'],
        'usage': CompletionUsageToJSON(value['usage']),
    };
}
