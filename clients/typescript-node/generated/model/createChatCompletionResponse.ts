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

import { RequestFile } from './models';
import { CompletionUsage } from './completionUsage';
import { CreateChatCompletionResponseChoicesInner } from './createChatCompletionResponseChoicesInner';

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
    'object': CreateChatCompletionResponse.ObjectEnum;
    'usage'?: CompletionUsage;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "choices",
            "baseName": "choices",
            "type": "Array<CreateChatCompletionResponseChoicesInner>"
        },
        {
            "name": "created",
            "baseName": "created",
            "type": "number"
        },
        {
            "name": "model",
            "baseName": "model",
            "type": "string"
        },
        {
            "name": "systemFingerprint",
            "baseName": "system_fingerprint",
            "type": "string"
        },
        {
            "name": "object",
            "baseName": "object",
            "type": "CreateChatCompletionResponse.ObjectEnum"
        },
        {
            "name": "usage",
            "baseName": "usage",
            "type": "CompletionUsage"
        }    ];

    static getAttributeTypeMap() {
        return CreateChatCompletionResponse.attributeTypeMap;
    }
}

export namespace CreateChatCompletionResponse {
    export enum ObjectEnum {
        ChatCompletion = <any> 'chat.completion'
    }
}
