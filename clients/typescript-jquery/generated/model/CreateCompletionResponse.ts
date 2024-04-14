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

/**
 * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
 */
export interface CreateCompletionResponse {
    /**
     * A unique identifier for the completion.
     */
    id: string;

    /**
     * The list of completion choices the model generated for the input prompt.
     */
    choices: Array<models.CreateCompletionResponseChoicesInner>;

    /**
     * The Unix timestamp (in seconds) of when the completion was created.
     */
    created: number;

    /**
     * The model used for completion.
     */
    model: string;

    /**
     * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
     */
    system_fingerprint?: string;

    /**
     * The object type, which is always \"text_completion\"
     */
    object: CreateCompletionResponse.ObjectEnum;

    usage?: models.CompletionUsage;

}
export namespace CreateCompletionResponse {
    export enum ObjectEnum {
        TextCompletion = <any> 'text_completion'
    }
}
