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
 * Text output from the Code Interpreter tool call as part of a run step.
 * @param index The index of the output in the outputs array.
 * @param type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject (
    /* The index of the output in the outputs array. */
    @SerializedName("index") private val _index: kotlin.Int?,
    /* Always `logs`. */
    @SerializedName("type") private val _type: RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.Type?,
    /* The text output from the Code Interpreter tool call. */
    val logs: kotlin.String? = null
) {

    /**
    * Always `logs`.
    * Values: logs
    */
    enum class Type(val value: kotlin.String){
    
        logs("logs");
    
    }

        val index get() = _index ?: throw IllegalArgumentException("index is required")
                    
        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
}

