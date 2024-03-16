// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    ChatCompletionRequestMessageFunctionCall,
    ChatCompletionRequestMessageFunctionCallFromJSON,
    ChatCompletionRequestMessageFunctionCallToJSON,
} from './';

/**
 * 
 * @export
 * @interface ChatCompletionRequestMessage
 */
export interface ChatCompletionRequestMessage  {
    /**
     * The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
     * @type {string}
     * @memberof ChatCompletionRequestMessage
     */
    role: ChatCompletionRequestMessageRoleEnum;
    /**
     * The contents of the message. `content` is required for all messages except assistant messages with function calls.
     * @type {string}
     * @memberof ChatCompletionRequestMessage
     */
    content?: string;
    /**
     * The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
     * @type {string}
     * @memberof ChatCompletionRequestMessage
     */
    name?: string;
    /**
     * 
     * @type {ChatCompletionRequestMessageFunctionCall}
     * @memberof ChatCompletionRequestMessage
     */
    functionCall?: ChatCompletionRequestMessageFunctionCall;
}

export function ChatCompletionRequestMessageFromJSON(json: any): ChatCompletionRequestMessage {
    return {
        'role': json['role'],
        'content': !exists(json, 'content') ? undefined : json['content'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'functionCall': !exists(json, 'function_call') ? undefined : ChatCompletionRequestMessageFunctionCallFromJSON(json['function_call']),
    };
}

export function ChatCompletionRequestMessageToJSON(value?: ChatCompletionRequestMessage): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'role': value.role,
        'content': value.content,
        'name': value.name,
        'function_call': ChatCompletionRequestMessageFunctionCallToJSON(value.functionCall),
    };
}

/**
* @export
* @enum {string}
*/
export enum ChatCompletionRequestMessageRoleEnum {
    System = 'system',
    User = 'user',
    Assistant = 'assistant',
    Function = 'function'
}


