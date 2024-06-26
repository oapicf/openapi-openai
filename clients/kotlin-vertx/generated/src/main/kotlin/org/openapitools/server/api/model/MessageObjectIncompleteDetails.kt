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
 * On an incomplete message, details about why the message is incomplete.
 * @param reason The reason the message is incomplete.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class MessageObjectIncompleteDetails (
    /* The reason the message is incomplete. */
    @SerializedName("reason") private val _reason: MessageObjectIncompleteDetails.Reason?
) {

    /**
    * The reason the message is incomplete.
    * Values: content_filter,max_tokens,run_cancelled,run_expired,run_failed
    */
    enum class Reason(val value: kotlin.String){
    
        content_filter("content_filter"),
    
        max_tokens("max_tokens"),
    
        run_cancelled("run_cancelled"),
    
        run_expired("run_expired"),
    
        run_failed("run_failed");
    
    }

        val reason get() = _reason ?: throw IllegalArgumentException("reason is required")
                    
}

