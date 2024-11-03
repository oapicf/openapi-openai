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
 * A list of files attached to a `message`.
 * @param id The identifier, which can be referenced in API endpoints.
 * @param &#x60;object&#x60; The object type, which is always `thread.message.file`.
 * @param createdAt The Unix timestamp (in seconds) for when the message file was created.
 * @param messageId The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class MessageFileObject (
    /* The identifier, which can be referenced in API endpoints. */
    @SerializedName("id") private val _id: kotlin.String?,
    /* The object type, which is always `thread.message.file`. */
    @SerializedName("`object`") private val _`object`: MessageFileObject.&#x60;Object&#x60;?,
    /* The Unix timestamp (in seconds) for when the message file was created. */
    @SerializedName("createdAt") private val _createdAt: kotlin.Int?,
    /* The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. */
    @SerializedName("messageId") private val _messageId: kotlin.String?
) {

    /**
    * The object type, which is always `thread.message.file`.
    * Values: threadPeriodMessagePeriodFile
    */
    enum class &#x60;Object&#x60;(val value: kotlin.String){
    
        threadPeriodMessagePeriodFile("thread.message.file");
    
    }

        val id get() = _id ?: throw IllegalArgumentException("id is required")
                    
        val `object` get() = _`object` ?: throw IllegalArgumentException("`object` is required")
                    
        val createdAt get() = _createdAt ?: throw IllegalArgumentException("createdAt is required")
                    
        val messageId get() = _messageId ?: throw IllegalArgumentException("messageId is required")
                    
}

