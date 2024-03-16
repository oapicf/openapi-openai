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
package org.openapitools.server.api.model


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param promptTokens 
 * @param completionTokens 
 * @param totalTokens 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CreateCompletionResponseUsage (
    @SerializedName("promptTokens") private val _promptTokens: kotlin.Int?,
    @SerializedName("completionTokens") private val _completionTokens: kotlin.Int?,
    @SerializedName("totalTokens") private val _totalTokens: kotlin.Int?
) {

        val promptTokens get() = _promptTokens ?: throw IllegalArgumentException("promptTokens is required")
                    
        val completionTokens get() = _completionTokens ?: throw IllegalArgumentException("completionTokens is required")
                    
        val totalTokens get() = _totalTokens ?: throw IllegalArgumentException("totalTokens is required")
                    
}

