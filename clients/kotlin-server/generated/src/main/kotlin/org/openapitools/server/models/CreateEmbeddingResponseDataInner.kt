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
 * @param index 
 * @param `object` 
 * @param embedding 
 */
data class CreateEmbeddingResponseDataInner(
    val index: kotlin.Int,
    val `object`: kotlin.String,
    val embedding: kotlin.collections.List<java.math.BigDecimal>
) 
