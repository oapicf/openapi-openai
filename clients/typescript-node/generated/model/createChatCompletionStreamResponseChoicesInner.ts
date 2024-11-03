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
import { ChatCompletionStreamResponseDelta } from './chatCompletionStreamResponseDelta';
import { CreateChatCompletionResponseChoicesInnerLogprobs } from './createChatCompletionResponseChoicesInnerLogprobs';

export class CreateChatCompletionStreamResponseChoicesInner {
    'delta': ChatCompletionStreamResponseDelta;
    'logprobs'?: CreateChatCompletionResponseChoicesInnerLogprobs | null;
    /**
    * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
    */
    'finishReason': CreateChatCompletionStreamResponseChoicesInner.FinishReasonEnum;
    /**
    * The index of the choice in the list of choices.
    */
    'index': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "delta",
            "baseName": "delta",
            "type": "ChatCompletionStreamResponseDelta"
        },
        {
            "name": "logprobs",
            "baseName": "logprobs",
            "type": "CreateChatCompletionResponseChoicesInnerLogprobs"
        },
        {
            "name": "finishReason",
            "baseName": "finish_reason",
            "type": "CreateChatCompletionStreamResponseChoicesInner.FinishReasonEnum"
        },
        {
            "name": "index",
            "baseName": "index",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CreateChatCompletionStreamResponseChoicesInner.attributeTypeMap;
    }
}

export namespace CreateChatCompletionStreamResponseChoicesInner {
    export enum FinishReasonEnum {
        Stop = <any> 'stop',
        Length = <any> 'length',
        ToolCalls = <any> 'tool_calls',
        ContentFilter = <any> 'content_filter',
        FunctionCall = <any> 'function_call'
    }
}
