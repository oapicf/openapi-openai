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
 * @param type 
 * @param message 
 * @param `param` 
 * @param code 
 */
data class Error(
    val type: kotlin.String,
    val message: kotlin.String,
    val `param`: kotlin.String,
    val code: kotlin.String
) 
