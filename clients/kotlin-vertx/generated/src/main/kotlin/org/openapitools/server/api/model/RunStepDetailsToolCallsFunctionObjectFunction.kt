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


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * The definition of the function that was called.
 * @param name The name of the function.
 * @param arguments The arguments passed to the function.
 * @param output The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class RunStepDetailsToolCallsFunctionObjectFunction (
    /* The name of the function. */
    @SerializedName("name") private val _name: kotlin.String?,
    /* The arguments passed to the function. */
    @SerializedName("arguments") private val _arguments: kotlin.String?,
    /* The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. */
    @SerializedName("output") private val _output: kotlin.String?
) {

        val name get() = _name ?: throw IllegalArgumentException("name is required")
                    
        val arguments get() = _arguments ?: throw IllegalArgumentException("arguments is required")
                    
        val output get() = _output ?: throw IllegalArgumentException("output is required")
                    
}
