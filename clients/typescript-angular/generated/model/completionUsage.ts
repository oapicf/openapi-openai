/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Usage statistics for the completion request.
 */
export interface CompletionUsage { 
    /**
     * Number of tokens in the generated completion.
     */
    completion_tokens: number;
    /**
     * Number of tokens in the prompt.
     */
    prompt_tokens: number;
    /**
     * Total number of tokens used in the request (prompt + completion).
     */
    total_tokens: number;
}

