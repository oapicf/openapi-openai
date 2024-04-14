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

export interface CreateChatCompletionStreamResponseChoicesInner {
    index?: number;

    delta?: models.ChatCompletionStreamResponseDelta;

    finish_reason?: CreateChatCompletionStreamResponseChoicesInner.FinishReasonEnum;

}
export namespace CreateChatCompletionStreamResponseChoicesInner {
    export enum FinishReasonEnum {
        Stop = <any> 'stop',
        Length = <any> 'length',
        FunctionCall = <any> 'function_call'
    }
}