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

import org.openapitools.server.api.model.MessageContentTextAnnotationsFilePathObjectFilePath

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 * @param type Always `file_path`.
 * @param text The text in the message content that needs to be replaced.
 * @param filePath 
 * @param startIndex 
 * @param endIndex 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class MessageContentTextAnnotationsFilePathObject (
    /* Always `file_path`. */
    @SerializedName("type") private val _type: MessageContentTextAnnotationsFilePathObject.Type?,
    /* The text in the message content that needs to be replaced. */
    @SerializedName("text") private val _text: kotlin.String?,
    @SerializedName("filePath") private val _filePath: MessageContentTextAnnotationsFilePathObjectFilePath?,
    @SerializedName("startIndex") private val _startIndex: kotlin.Int?,
    @SerializedName("endIndex") private val _endIndex: kotlin.Int?
) {

    /**
    * Always `file_path`.
    * Values: file_path
    */
    enum class Type(val value: kotlin.String){
    
        file_path("file_path");
    
    }

        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
        val text get() = _text ?: throw IllegalArgumentException("text is required")
                    
        val filePath get() = _filePath ?: throw IllegalArgumentException("filePath is required")
                    
        val startIndex get() = _startIndex ?: throw IllegalArgumentException("startIndex is required")
                    
        val endIndex get() = _endIndex ?: throw IllegalArgumentException("endIndex is required")
                    
}
