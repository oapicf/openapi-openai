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
import { CreateCompletionResponseChoicesInnerLogprobs } from './createCompletionResponseChoicesInnerLogprobs';


export interface CreateEditResponseChoicesInner { 
    text?: string;
    index?: number;
    logprobs?: CreateCompletionResponseChoicesInnerLogprobs | null;
    finish_reason?: CreateEditResponseChoicesInner.FinishReasonEnum;
}
export namespace CreateEditResponseChoicesInner {
    export type FinishReasonEnum = 'stop' | 'length';
    export const FinishReasonEnum = {
        Stop: 'stop' as FinishReasonEnum,
        Length: 'length' as FinishReasonEnum
    };
}

