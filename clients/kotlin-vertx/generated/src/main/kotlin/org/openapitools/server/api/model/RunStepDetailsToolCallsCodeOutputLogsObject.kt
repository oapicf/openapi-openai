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
 * @param type Always `logs`.
 * @param logs The text output from the Code Interpreter tool call.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class RunStepDetailsToolCallsCodeOutputLogsObject (
    /* Always `logs`. */
    @SerializedName("type") private val _type: RunStepDetailsToolCallsCodeOutputLogsObject.Type?,
    /* The text output from the Code Interpreter tool call. */
    @SerializedName("logs") private val _logs: kotlin.String?
) {

    /**
    * Always `logs`.
    * Values: logs
    */
    enum class Type(val value: kotlin.String){
    
        logs("logs");
    
    }

        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
        val logs get() = _logs ?: throw IllegalArgumentException("logs is required")
                    
}

