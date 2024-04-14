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

import org.openapitools.server.api.model.CreateFineTuningJobRequestIntegrationsInnerWandb
import org.openapitools.server.api.model.FineTuningIntegration

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param type The type of the integration being enabled for the fine-tuning job
 * @param wandb 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class FineTuningJobIntegrationsInner (
    /* The type of the integration being enabled for the fine-tuning job */
    @SerializedName("type") private val _type: FineTuningJobIntegrationsInner.Type?,
    @SerializedName("wandb") private val _wandb: CreateFineTuningJobRequestIntegrationsInnerWandb?
) {

    /**
    * The type of the integration being enabled for the fine-tuning job
    * Values: wandb
    */
    enum class Type(val value: kotlin.String){
    
        wandb("wandb");
    
    }

        val type get() = _type ?: throw IllegalArgumentException("type is required")
                    
        val wandb get() = _wandb ?: throw IllegalArgumentException("wandb is required")
                    
}

