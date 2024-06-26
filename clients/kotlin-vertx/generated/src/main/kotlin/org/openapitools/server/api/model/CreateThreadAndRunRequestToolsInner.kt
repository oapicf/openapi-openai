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

import org.openapitools.server.api.model.AssistantToolsCode
import org.openapitools.server.api.model.AssistantToolsFunction
import org.openapitools.server.api.model.AssistantToolsRetrieval
import org.openapitools.server.api.model.FunctionObject

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param type The type of tool being defined: `code_interpreter`
 * @param function 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class CreateThreadAndRunRequestToolsInner (
    /* The type of tool being defined: `code_interpreter` */
    @SerializedName("type") private val _type: CreateThreadAndRunRequestToolsInner.Type?,
    @SerializedName("function") private val _function: FunctionObject?
) {

    /**
    * The type of tool being defined: `code_interpreter`
    * Values: code_interpreter,retrieval,function
    */
    enum class Type(val value: kotlin.String){
    
        code_interpreter("code_interpreter"),
    
        retrieval("retrieval"),
    
        function("function");
    
    }

        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
        val function get() = _function ?: throw IllegalArgumentException("function is required")
                    
}

