package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * Details on why the run is incomplete. Will be `null` if the run is not incomplete.
 * @param reason The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
 */
data class RunObjectIncompleteDetails(

    @Schema(description = "The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("reason")
    @get:JsonProperty("reason") val reason: RunObjectIncompleteDetails.Reason? = null
) {

    /**
    * The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
    * Values: max_completion_tokens,max_prompt_tokens
    */
    enum class Reason(@get:JsonValue val value: kotlin.String) {

        max_completion_tokens("max_completion_tokens"),
        max_prompt_tokens("max_prompt_tokens");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Reason {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Reason'")
            }
        }
    }

}

