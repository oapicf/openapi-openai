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

import org.openapitools.server.models.MessageContentImageFileObject
import org.openapitools.server.models.MessageContentImageFileObjectImageFile
import org.openapitools.server.models.MessageContentTextObject
import org.openapitools.server.models.MessageContentTextObjectText

/**
 * 
 * @param type Always `image_file`.
 * @param imageFile 
 * @param text 
 */
data class MessageObjectContentInner(
    /* Always `image_file`. */
    val type: MessageObjectContentInner.Type,
    val imageFile: MessageContentImageFileObjectImageFile,
    val text: MessageContentTextObjectText
) 
{
    /**
    * Always `image_file`.
    * Values: image_file,text
    */
    enum class Type(val value: kotlin.String){
        image_file("image_file"),
        text("text");
    }
}
