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

import org.openapitools.server.api.model.CreateEmbeddingRequestInput
import org.openapitools.server.api.model.CreateEmbeddingRequestModel

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param input 
 * @param model 
 * @param encodingFormat The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
 * @param dimensions The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
 * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CreateEmbeddingRequest (
    @SerializedName("input") private val _input: CreateEmbeddingRequestInput?,
    @SerializedName("model") private val _model: CreateEmbeddingRequestModel?,
    /* The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/). */
    val encodingFormat: CreateEmbeddingRequest.EncodingFormat? = EncodingFormat.float,
    /* The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.  */
    val dimensions: kotlin.Int? = null,
    /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
    val user: kotlin.String? = null
) {

    /**
    * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
    * Values: float,base64
    */
    enum class EncodingFormat(val value: kotlin.String){
    
        float("float"),
    
        base64("base64");
    
    }

        val input get() = _input ?: throw IllegalArgumentException("input is required")
                    
        val model get() = _model ?: throw IllegalArgumentException("model is required")
                    
}

