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

import org.openapitools.server.api.model.MessageDeltaContentTextObjectTextAnnotationsInner

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param &#x60;value&#x60; The data that makes up the text.
 * @param annotations 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class MessageDeltaContentTextObjectText (
    /* The data that makes up the text. */
    val `value`: kotlin.String? = null,
    val annotations: kotlin.Array<MessageDeltaContentTextObjectTextAnnotationsInner>? = null
) {

}

