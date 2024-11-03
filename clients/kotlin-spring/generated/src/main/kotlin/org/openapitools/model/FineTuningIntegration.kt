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
 * @param type The type of the integration being enabled for the fine-tuning job
 * @param wandb 
 */
data class FineTuningIntegration(

    @Schema(example = "null", required = true, description = "The type of the integration being enabled for the fine-tuning job")
    @get:JsonProperty("type", required = true) val type: FineTuningIntegration.Type,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("wandb", required = true) val wandb: CreateFineTuningJobRequestIntegrationsInnerWandb
    ) {

    /**
    * The type of the integration being enabled for the fine-tuning job
    * Values: wandb
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        wandb("wandb");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().first{it -> it.value == value}
            }
        }
    }

}

