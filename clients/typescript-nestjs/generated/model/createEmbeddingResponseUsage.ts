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
 * The usage information for the request.
 */
export interface CreateEmbeddingResponseUsage { 
    /**
     * The number of tokens used by the prompt.
     */
    prompt_tokens: number;
    /**
     * The total number of tokens used by the request.
     */
    total_tokens: number;
}

