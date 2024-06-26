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

import org.openapitools.server.api.model.CreateModerationResponseResultsInner

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Represents if a given text input is potentially harmful.
 * @param id The unique identifier for the moderation request.
 * @param model The model used to generate the moderation results.
 * @param results A list of moderation objects.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CreateModerationResponse (
    /* The unique identifier for the moderation request. */
    @SerializedName("id") private val _id: kotlin.String?,
    /* The model used to generate the moderation results. */
    @SerializedName("model") private val _model: kotlin.String?,
    /* A list of moderation objects. */
    @SerializedName("results") private val _results: kotlin.Array<CreateModerationResponseResultsInner>?
) {

        val id get() = _id ?: throw IllegalArgumentException("id is required")
                    
        val model get() = _model ?: throw IllegalArgumentException("model is required")
                    
        val results get() = _results ?: throw IllegalArgumentException("results is required")
                    
}

