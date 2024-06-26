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

import org.openapitools.server.models.OpenAIFile

/**
 * 
 * @param `data` 
 * @param `object` 
 */
data class ListFilesResponse(
    val `data`: kotlin.collections.List<OpenAIFile>,
    val `object`: ListFilesResponse.`Object`
) 
{
    /**
    * 
    * Values: list
    */
    enum class `Object`(val value: kotlin.String){
        list("list");
    }
}

