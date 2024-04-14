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

import org.openapitools.server.api.model.ChatCompletionResponseMessage

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param index 
 * @param message 
 * @param finishReason 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CreateChatCompletionResponseChoicesInner (
    val index: kotlin.Int? = null,
    val message: ChatCompletionResponseMessage? = null,
    val finishReason: CreateChatCompletionResponseChoicesInner.FinishReason? = null
) {

    /**
    * 
    * Values: stop,length,function_call
    */
    enum class FinishReason(val value: kotlin.String){
    
        stop("stop"),
    
        length("length"),
    
        function_call("function_call");
    
    }

}
