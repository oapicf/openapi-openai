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
 * @param id 
 * @param `object` 
 * @param created 
 * @param ownedBy 
 */
data class Model(
    val id: kotlin.String,
    val `object`: kotlin.String,
    val created: kotlin.Int,
    val ownedBy: kotlin.String
) 

