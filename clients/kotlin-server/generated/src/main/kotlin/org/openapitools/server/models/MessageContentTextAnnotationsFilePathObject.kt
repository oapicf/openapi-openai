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

import org.openapitools.server.models.MessageContentTextAnnotationsFilePathObjectFilePath

/**
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 * @param type Always `file_path`.
 * @param text The text in the message content that needs to be replaced.
 * @param filePath 
 * @param startIndex 
 * @param endIndex 
 */
data class MessageContentTextAnnotationsFilePathObject(
    /* Always `file_path`. */
    val type: MessageContentTextAnnotationsFilePathObject.Type,
    /* The text in the message content that needs to be replaced. */
    val text: kotlin.String,
    val filePath: MessageContentTextAnnotationsFilePathObjectFilePath,
    val startIndex: kotlin.Int,
    val endIndex: kotlin.Int
) 
{
    /**
    * Always `file_path`.
    * Values: file_path
    */
    enum class Type(val value: kotlin.String){
        file_path("file_path");
    }
}
