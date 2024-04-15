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
import { ChatCompletionResponseMessage } from './chatCompletionResponseMessage';

export class CreateChatCompletionFunctionResponseChoicesInner {
    /**
    * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
    */
    'finishReason': CreateChatCompletionFunctionResponseChoicesInner.FinishReasonEnum;
    /**
    * The index of the choice in the list of choices.
    */
    'index': number;
    'message': ChatCompletionResponseMessage;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "finishReason",
            "baseName": "finish_reason",
            "type": "CreateChatCompletionFunctionResponseChoicesInner.FinishReasonEnum"
        },
        {
            "name": "index",
            "baseName": "index",
            "type": "number"
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "ChatCompletionResponseMessage"
        }    ];

    static getAttributeTypeMap() {
        return CreateChatCompletionFunctionResponseChoicesInner.attributeTypeMap;
    }
}

export namespace CreateChatCompletionFunctionResponseChoicesInner {
    export enum FinishReasonEnum {
        Stop = <any> 'stop',
        Length = <any> 'length',
        FunctionCall = <any> 'function_call',
        ContentFilter = <any> 'content_filter'
    }
}