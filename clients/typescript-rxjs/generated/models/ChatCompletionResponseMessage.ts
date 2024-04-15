// tslint:disable
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

import type {
    ChatCompletionMessageToolCall,
    ChatCompletionRequestAssistantMessageFunctionCall,
} from './';

/**
 * A chat completion message generated by the model.
 * @export
 * @interface ChatCompletionResponseMessage
 */
export interface ChatCompletionResponseMessage {
    /**
     * The contents of the message.
     * @type {string}
     * @memberof ChatCompletionResponseMessage
     */
    content: string | null;
    /**
     * The tool calls generated by the model, such as function calls.
     * @type {Array<ChatCompletionMessageToolCall>}
     * @memberof ChatCompletionResponseMessage
     */
    tool_calls?: Array<ChatCompletionMessageToolCall>;
    /**
     * The role of the author of this message.
     * @type {string}
     * @memberof ChatCompletionResponseMessage
     */
    role: ChatCompletionResponseMessageRoleEnum;
    /**
     * @type {ChatCompletionRequestAssistantMessageFunctionCall}
     * @memberof ChatCompletionResponseMessage
     */
    function_call?: ChatCompletionRequestAssistantMessageFunctionCall;
}

/**
 * @export
 * @enum {string}
 */
export enum ChatCompletionResponseMessageRoleEnum {
    Assistant = 'assistant'
}
