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

import org.openapitools.server.models.RunStepDetailsToolCallsCodeOutputImageObjectImage

/**
 * 
 * @param type Always `image`.
 * @param image 
 */
data class RunStepDetailsToolCallsCodeOutputImageObject(
    /* Always `image`. */
    val type: RunStepDetailsToolCallsCodeOutputImageObject.Type,
    val image: RunStepDetailsToolCallsCodeOutputImageObjectImage
) 
{
    /**
    * Always `image`.
    * Values: image
    */
    enum class Type(val value: kotlin.String){
        image("image");
    }
}
