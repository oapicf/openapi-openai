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


export interface ChatCompletionRequestFunctionMessage { 
    /**
     * The role of the messages author, in this case `function`.
     */
    role: ChatCompletionRequestFunctionMessage.RoleEnum;
    /**
     * The contents of the function message.
     */
    content: string | null;
    /**
     * The name of the function to call.
     */
    name: string;
}
export namespace ChatCompletionRequestFunctionMessage {
    export type RoleEnum = 'function';
    export const RoleEnum = {
        Function: 'function' as RoleEnum
    }
}
