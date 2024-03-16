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

import * as models from './models';

export interface ChatCompletionResponseMessage {
    /**
     * The role of the author of this message.
     */
    role: ChatCompletionResponseMessage.RoleEnum;

    /**
     * The contents of the message.
     */
    content?: string;

    function_call?: models.ChatCompletionRequestMessageFunctionCall;

}
export namespace ChatCompletionResponseMessage {
    export enum RoleEnum {
        System = <any> 'system',
        User = <any> 'user',
        Assistant = <any> 'assistant',
        Function = <any> 'function'
    }
}
