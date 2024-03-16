/* tslint:disable */
/* eslint-disable */
/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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
} from './CreateChatCompletionStreamResponseChoicesInner';

/**
 * 
 * @export
 * @interface CreateChatCompletionStreamResponse
 */
export interface CreateChatCompletionStreamResponse {
    /**
     * 
     * @type {string}
     * @memberof CreateChatCompletionStreamResponse
     */
    id: string;
    /**
     * 
     * @type {string}
     * @memberof CreateChatCompletionStreamResponse
     */
    object: string;
    /**
     * 
     * @type {number}
     * @memberof CreateChatCompletionStreamResponse
     */
    created: number;
    /**
     * 
     * @type {string}
     * @memberof CreateChatCompletionStreamResponse
     */
    model: string;
    /**
     * 
     * @type {Array<CreateChatCompletionStreamResponseChoicesInner>}
     * @memberof CreateChatCompletionStreamResponse
     */
    choices: Array<CreateChatCompletionStreamResponseChoicesInner>;
}

/**
 * Check if a given object implements the CreateChatCompletionStreamResponse interface.
 */
export function instanceOfCreateChatCompletionStreamResponse(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('object' in value)) return false;
    if (!('created' in value)) return false;
    if (!('model' in value)) return false;
    if (!('choices' in value)) return false;
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
        'object': json['object'],
        'created': json['created'],
        'model': json['model'],
        'choices': ((json['choices'] as Array<any>).map(CreateChatCompletionStreamResponseChoicesInnerFromJSON)),
    };
}

export function CreateChatCompletionStreamResponseToJSON(value?: CreateChatCompletionStreamResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'object': value['object'],
        'created': value['created'],
        'model': value['model'],
        'choices': ((value['choices'] as Array<any>).map(CreateChatCompletionStreamResponseChoicesInnerToJSON)),
    };
}

