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

import org.openapitools.server.models.MessageContentImageFileObjectImageFile

/**
 * References an image [File](/docs/api-reference/files) in the content of a message.
 * @param type Always `image_file`.
 * @param imageFile 
 */
data class MessageContentImageFileObject(
    /* Always `image_file`. */
    val type: MessageContentImageFileObject.Type,
    val imageFile: MessageContentImageFileObjectImageFile
) 
{
    /**
    * Always `image_file`.
    * Values: image_file
    */
    enum class Type(val value: kotlin.String){
        image_file("image_file");
    }
}
