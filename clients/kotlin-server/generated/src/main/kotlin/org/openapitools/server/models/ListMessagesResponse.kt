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

import org.openapitools.server.models.MessageObject

/**
 * 
 * @param `object` 
 * @param `data` 
 * @param firstId 
 * @param lastId 
 * @param hasMore 
 */
data class ListMessagesResponse(
    val `object`: kotlin.String,
    val `data`: kotlin.collections.List<MessageObject>,
    val firstId: kotlin.String,
    val lastId: kotlin.String,
    val hasMore: kotlin.Boolean
) 

