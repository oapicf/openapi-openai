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


/**
 * On an incomplete message, details about why the message is incomplete.
 */
export interface MessageObjectIncompleteDetails { 
    /**
     * The reason the message is incomplete.
     */
    reason: MessageObjectIncompleteDetails.ReasonEnum;
}
export namespace MessageObjectIncompleteDetails {
    export type ReasonEnum = 'content_filter' | 'max_tokens' | 'run_cancelled' | 'run_expired' | 'run_failed';
    export const ReasonEnum = {
        ContentFilter: 'content_filter' as ReasonEnum,
        MaxTokens: 'max_tokens' as ReasonEnum,
        RunCancelled: 'run_cancelled' as ReasonEnum,
        RunExpired: 'run_expired' as ReasonEnum,
        RunFailed: 'run_failed' as ReasonEnum
    };
}


