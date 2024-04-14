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


/**
 * Represents an embedding vector returned by embedding endpoint. 
 * @param index The index of the embedding in the list of embeddings.
 * @param embedding The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
 * @param `object` The object type, which is always \"embedding\".
 */
data class Embedding(
    /* The index of the embedding in the list of embeddings. */
    val index: kotlin.Int,
    /* The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).  */
    val embedding: kotlin.collections.List<java.math.BigDecimal>,
    /* The object type, which is always \"embedding\". */
    val `object`: Embedding.`Object`
) 
{
    /**
    * The object type, which is always \"embedding\".
    * Values: embedding
    */
    enum class `Object`(val value: kotlin.String){
        embedding("embedding");
    }
}

