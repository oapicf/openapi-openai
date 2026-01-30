package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.FineTuneDPOMethod
import org.openapitools.model.FineTuneSupervisedMethod
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
 * The method used for fine-tuning.
 * @param type The type of method. Is either `supervised` or `dpo`.
 * @param supervised 
 * @param dpo 
 */
data class FineTuneMethod(

    @Schema(example = "null", description = "The type of method. Is either `supervised` or `dpo`.")
    @get:JsonProperty("type") val type: FineTuneMethod.Type? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("supervised") val supervised: FineTuneSupervisedMethod? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("dpo") val dpo: FineTuneDPOMethod? = null
) {

    /**
    * The type of method. Is either `supervised` or `dpo`.
    * Values: supervised,dpo
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        supervised("supervised"),
        dpo("dpo");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'FineTuneMethod'")
            }
        }
    }

}

