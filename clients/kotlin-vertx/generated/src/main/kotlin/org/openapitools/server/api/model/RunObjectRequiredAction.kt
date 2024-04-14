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

import org.openapitools.server.api.model.RunObjectRequiredActionSubmitToolOutputs

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Details on the action required to continue the run. Will be `null` if no action is required.
 * @param type For now, this is always `submit_tool_outputs`.
 * @param submitToolOutputs 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class RunObjectRequiredAction (
    /* For now, this is always `submit_tool_outputs`. */
    @SerializedName("type") private val _type: RunObjectRequiredAction.Type?,
    @SerializedName("submitToolOutputs") private val _submitToolOutputs: RunObjectRequiredActionSubmitToolOutputs?
) {

    /**
    * For now, this is always `submit_tool_outputs`.
    * Values: submit_tool_outputs
    */
    enum class Type(val value: kotlin.String){
    
        submit_tool_outputs("submit_tool_outputs");
    
    }

        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
        val submitToolOutputs get() = _submitToolOutputs ?: throw IllegalArgumentException("submitToolOutputs is required")
                    
}

