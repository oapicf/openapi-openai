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

import org.openapitools.server.api.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 * @param index The index of the annotation in the text content part.
 * @param type Always `file_path`.
 * @param text The text in the message content that needs to be replaced.
 * @param filePath 
 * @param startIndex 
 * @param endIndex 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class MessageDeltaContentTextAnnotationsFilePathObject (
    /* The index of the annotation in the text content part. */
    @SerializedName("index") private val _index: kotlin.Int?,
    /* Always `file_path`. */
    @SerializedName("type") private val _type: MessageDeltaContentTextAnnotationsFilePathObject.Type?,
    /* The text in the message content that needs to be replaced. */
    val text: kotlin.String? = null,
    val filePath: MessageDeltaContentTextAnnotationsFilePathObjectFilePath? = null,
    val startIndex: kotlin.Int? = null,
    val endIndex: kotlin.Int? = null
) {

    /**
    * Always `file_path`.
    * Values: file_path
    */
    enum class Type(val value: kotlin.String){
    
        file_path("file_path");
    
    }

        val index get() = _index ?: throw IllegalArgumentException("index is required")
                    
        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
}

