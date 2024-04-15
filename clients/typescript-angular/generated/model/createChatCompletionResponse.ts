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
import { CreateChatCompletionResponseChoicesInner } from './createChatCompletionResponseChoicesInner';
import { CompletionUsage } from './completionUsage';


/**
 * Represents a chat completion response returned by model, based on the provided input.
 */
export interface CreateChatCompletionResponse { 
    /**
     * A unique identifier for the chat completion.
     */
    id: string;
    /**
     * A list of chat completion choices. Can be more than one if `n` is greater than 1.
     */
    choices: Array<CreateChatCompletionResponseChoicesInner>;
    /**
     * The Unix timestamp (in seconds) of when the chat completion was created.
     */
    created: number;
    /**
     * The model used for the chat completion.
     */
    model: string;
    /**
     * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
     */
    system_fingerprint?: string;
    /**
     * The object type, which is always `chat.completion`.
     */
    object: CreateChatCompletionResponse.ObjectEnum;
    usage?: CompletionUsage;
}
export namespace CreateChatCompletionResponse {
    export type ObjectEnum = 'chat.completion';
    export const ObjectEnum = {
        ChatCompletion: 'chat.completion' as ObjectEnum
    };
}

