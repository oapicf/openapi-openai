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
package org.openapitools.server.models


/**
 * Usage statistics for the completion request.
 * @param completionTokens Number of tokens in the generated completion.
 * @param promptTokens Number of tokens in the prompt.
 * @param totalTokens Total number of tokens used in the request (prompt + completion).
 */
data class CompletionUsage(
    /* Number of tokens in the generated completion. */
    val completionTokens: kotlin.Int,
    /* Number of tokens in the prompt. */
    val promptTokens: kotlin.Int,
    /* Total number of tokens used in the request (prompt + completion). */
    val totalTokens: kotlin.Int
) 

