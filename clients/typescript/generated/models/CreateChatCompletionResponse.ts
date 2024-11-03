/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { CompletionUsage } from '../models/CompletionUsage';
import { CreateChatCompletionResponseChoicesInner } from '../models/CreateChatCompletionResponseChoicesInner';
import { HttpFile } from '../http/http';

/**
* Represents a chat completion response returned by model, based on the provided input.
*/
export class CreateChatCompletionResponse {
    /**
    * A unique identifier for the chat completion.
    */
    'id': string;
    /**
    * A list of chat completion choices. Can be more than one if `n` is greater than 1.
    */
    'choices': Array<CreateChatCompletionResponseChoicesInner>;
    /**
    * The Unix timestamp (in seconds) of when the chat completion was created.
    */
    'created': number;
    /**
    * The model used for the chat completion.
    */
    'model': string;
    /**
    * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
    */
    'systemFingerprint'?: string;
    /**
    * The object type, which is always `chat.completion`.
    */
    'object': CreateChatCompletionResponseObjectEnum;
    'usage'?: CompletionUsage;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "choices",
            "baseName": "choices",
            "type": "Array<CreateChatCompletionResponseChoicesInner>",
            "format": ""
        },
        {
            "name": "created",
            "baseName": "created",
            "type": "number",
            "format": ""
        },
        {
            "name": "model",
            "baseName": "model",
            "type": "string",
            "format": ""
        },
        {
            "name": "systemFingerprint",
            "baseName": "system_fingerprint",
            "type": "string",
            "format": ""
        },
        {
            "name": "object",
            "baseName": "object",
            "type": "CreateChatCompletionResponseObjectEnum",
            "format": ""
        },
        {
            "name": "usage",
            "baseName": "usage",
            "type": "CompletionUsage",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateChatCompletionResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum CreateChatCompletionResponseObjectEnum {
    ChatCompletion = 'chat.completion'
}

