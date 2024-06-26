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
package org.openapitools.server.api.model


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Usage statistics for the completion request.
 * @param completionTokens Number of tokens in the generated completion.
 * @param promptTokens Number of tokens in the prompt.
 * @param totalTokens Total number of tokens used in the request (prompt + completion).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CompletionUsage (
    /* Number of tokens in the generated completion. */
    @SerializedName("completionTokens") private val _completionTokens: kotlin.Int?,
    /* Number of tokens in the prompt. */
    @SerializedName("promptTokens") private val _promptTokens: kotlin.Int?,
    /* Total number of tokens used in the request (prompt + completion). */
    @SerializedName("totalTokens") private val _totalTokens: kotlin.Int?
) {

        val completionTokens get() = _completionTokens ?: throw IllegalArgumentException("completionTokens is required")
                    
        val promptTokens get() = _promptTokens ?: throw IllegalArgumentException("promptTokens is required")
                    
        val totalTokens get() = _totalTokens ?: throw IllegalArgumentException("totalTokens is required")
                    
}

