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
import { CreateCompletionResponseChoicesInner } from './createCompletionResponseChoicesInner';

/**
* Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
*/
export class CreateCompletionResponse {
    /**
    * A unique identifier for the completion.
    */
    'id': string;
    /**
    * The list of completion choices the model generated for the input prompt.
    */
    'choices': Array<CreateCompletionResponseChoicesInner>;
    /**
    * The Unix timestamp (in seconds) of when the completion was created.
    */
    'created': number;
    /**
    * The model used for completion.
    */
    'model': string;
    /**
    * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
    */
    'systemFingerprint'?: string;
    /**
    * The object type, which is always \"text_completion\"
    */
    'object': CreateCompletionResponse.ObjectEnum;
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
            "type": "Array<CreateCompletionResponseChoicesInner>"
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
            "type": "CreateCompletionResponse.ObjectEnum"
        },
        {
            "name": "usage",
            "baseName": "usage",
            "type": "CompletionUsage"
        }    ];

    static getAttributeTypeMap() {
        return CreateCompletionResponse.attributeTypeMap;
    }
}

export namespace CreateCompletionResponse {
    export enum ObjectEnum {
        TextCompletion = <any> 'text_completion'
    }
}
