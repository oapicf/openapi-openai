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

import org.openapitools.server.models.ChatCompletionRequestMessageContentPartImage
import org.openapitools.server.models.ChatCompletionRequestMessageContentPartImageImageUrl
import org.openapitools.server.models.ChatCompletionRequestMessageContentPartText

/**
 * 
 * @param type The type of the content part.
 * @param text The text content.
 * @param imageUrl 
 */
data class ChatCompletionRequestMessageContentPart(
    /* The type of the content part. */
    val type: ChatCompletionRequestMessageContentPart.Type,
    /* The text content. */
    val text: kotlin.String,
    val imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl
) 
{
    /**
    * The type of the content part.
    * Values: text,image_url
    */
    enum class Type(val value: kotlin.String){
        text("text"),
        image_url("image_url");
    }
}

