/**
* OpenAI API
* APIs for sampling from and fine-tuning language models
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models


/**
 * 
 * @param `object` 
 * @param createdAt 
 * @param level 
 * @param message 
 */
data class FineTuneEvent(
    val `object`: kotlin.String,
    val createdAt: kotlin.Int,
    val level: kotlin.String,
    val message: kotlin.String
) 

