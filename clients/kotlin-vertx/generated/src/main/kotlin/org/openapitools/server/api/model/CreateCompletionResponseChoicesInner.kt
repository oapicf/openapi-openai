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

import org.openapitools.server.api.model.CreateCompletionResponseChoicesInnerLogprobs

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param text 
 * @param index 
 * @param logprobs 
 * @param finishReason 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CreateCompletionResponseChoicesInner (
    @SerializedName("text") private val _text: kotlin.String?,
    @SerializedName("index") private val _index: kotlin.Int?,
    @SerializedName("logprobs") private val _logprobs: CreateCompletionResponseChoicesInnerLogprobs?,
    @SerializedName("finishReason") private val _finishReason: CreateCompletionResponseChoicesInner.FinishReason?
) {

    /**
    * 
    * Values: stop,length
    */
    enum class FinishReason(val value: kotlin.String){
    
        stop("stop"),
    
        length("length");
    
    }

        val text get() = _text ?: throw IllegalArgumentException("text is required")
                    
        val index get() = _index ?: throw IllegalArgumentException("index is required")
                    
        val logprobs get() = _logprobs ?: throw IllegalArgumentException("logprobs is required")
                    
        val finishReason get() = _finishReason ?: throw IllegalArgumentException("finishReason is required")
                    
}

