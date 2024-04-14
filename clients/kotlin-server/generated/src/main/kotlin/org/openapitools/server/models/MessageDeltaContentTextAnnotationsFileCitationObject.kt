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

import org.openapitools.server.models.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation

/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.
 * @param index The index of the annotation in the text content part.
 * @param type Always `file_citation`.
 * @param text The text in the message content that needs to be replaced.
 * @param fileCitation 
 * @param startIndex 
 * @param endIndex 
 */
data class MessageDeltaContentTextAnnotationsFileCitationObject(
    /* The index of the annotation in the text content part. */
    val index: kotlin.Int,
    /* Always `file_citation`. */
    val type: MessageDeltaContentTextAnnotationsFileCitationObject.Type,
    /* The text in the message content that needs to be replaced. */
    val text: kotlin.String? = null,
    val fileCitation: MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation? = null,
    val startIndex: kotlin.Int? = null,
    val endIndex: kotlin.Int? = null
) 
{
    /**
    * Always `file_citation`.
    * Values: file_citation
    */
    enum class Type(val value: kotlin.String){
        file_citation("file_citation");
    }
}

