/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * An object specifying the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 
 */
export interface CreateChatCompletionRequestResponseFormat { 
    /**
     * Must be one of `text` or `json_object`.
     */
    type?: CreateChatCompletionRequestResponseFormat.TypeEnum;
}
export namespace CreateChatCompletionRequestResponseFormat {
    export type TypeEnum = 'text' | 'json_object';
    export const TypeEnum = {
        Text: 'text' as TypeEnum,
        JsonObject: 'json_object' as TypeEnum
    };
}


