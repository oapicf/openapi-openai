/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { CreateCompletionResponseChoicesInnerLogprobs } from './createCompletionResponseChoicesInnerLogprobs';


export interface CreateCompletionResponseChoicesInner { 
    /**
     * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
     */
    finish_reason: CreateCompletionResponseChoicesInner.FinishReasonEnum;
    index: number;
    logprobs: CreateCompletionResponseChoicesInnerLogprobs | null;
    text: string;
}
export namespace CreateCompletionResponseChoicesInner {
    export type FinishReasonEnum = 'stop' | 'length' | 'content_filter';
    export const FinishReasonEnum = {
        Stop: 'stop' as FinishReasonEnum,
        Length: 'length' as FinishReasonEnum,
        ContentFilter: 'content_filter' as FinishReasonEnum
    };
}


