/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { CreateChatCompletionStreamResponseChoicesInner } from './createChatCompletionStreamResponseChoicesInner';


/**
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 */
export interface CreateChatCompletionStreamResponse { 
    /**
     * A unique identifier for the chat completion. Each chunk has the same ID.
     */
    id: string;
    /**
     * A list of chat completion choices. Can be more than one if `n` is greater than 1.
     */
    choices: Array<CreateChatCompletionStreamResponseChoicesInner>;
    /**
     * The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
     */
    created: number;
    /**
     * The model to generate the completion.
     */
    model: string;
    /**
     * This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
     */
    system_fingerprint?: string;
    /**
     * The object type, which is always `chat.completion.chunk`.
     */
    object: CreateChatCompletionStreamResponse.ObjectEnum;
}
export namespace CreateChatCompletionStreamResponse {
    export type ObjectEnum = 'chat.completion.chunk';
    export const ObjectEnum = {
        ChatCompletionChunk: 'chat.completion.chunk' as ObjectEnum
    };
}


