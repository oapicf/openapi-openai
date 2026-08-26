package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CreateFineTuningJobRequestIntegrationsInnerWandb
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param type The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
 * @param wandb 
 */
data class CreateFineTuningJobRequestIntegrationsInner(

    @Schema(required = true, description = "The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. ")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: CreateFineTuningJobRequestIntegrationsInner.Type,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("wandb")
    @get:JsonProperty("wandb", required = true) val wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
) {

    /**
    * The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
    * Values: wandb
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        wandb("wandb");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Type'")
            }
        }
    }

}

