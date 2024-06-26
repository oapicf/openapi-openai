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

import org.openapitools.server.api.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Details of the Code Interpreter tool call the run step was involved in.
 * @param id The ID of the tool call.
 * @param type The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @param codeInterpreter 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class RunStepDetailsToolCallsCodeObject (
    /* The ID of the tool call. */
    @SerializedName("id") private val _id: kotlin.String?,
    /* The type of tool call. This is always going to be `code_interpreter` for this type of tool call. */
    @SerializedName("type") private val _type: RunStepDetailsToolCallsCodeObject.Type?,
    @SerializedName("codeInterpreter") private val _codeInterpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter?
) {

    /**
    * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
    * Values: code_interpreter
    */
    enum class Type(val value: kotlin.String){
    
        code_interpreter("code_interpreter");
    
    }

        val id get() = _id ?: throw IllegalArgumentException("id is required")
                    
        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
        val codeInterpreter get() = _codeInterpreter ?: throw IllegalArgumentException("codeInterpreter is required")
                    
}

