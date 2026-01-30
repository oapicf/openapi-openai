package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * The ranking options for the file search.
 * @param ranker The ranker used for the file search.
 * @param scoreThreshold The score threshold for the file search. All values must be a floating point number between 0 and 1.
 */
data class RunStepDetailsToolCallsFileSearchRankingOptionsObject(

    @Schema(example = "null", required = true, description = "The ranker used for the file search.")
    @get:JsonProperty("ranker", required = true) val ranker: RunStepDetailsToolCallsFileSearchRankingOptionsObject.Ranker,

    @get:DecimalMin(value="0")
    @get:DecimalMax(value="1")
    @Schema(example = "null", required = true, description = "The score threshold for the file search. All values must be a floating point number between 0 and 1.")
    @get:JsonProperty("score_threshold", required = true) val scoreThreshold: java.math.BigDecimal
) {

    /**
    * The ranker used for the file search.
    * Values: default_2024_08_21
    */
    enum class Ranker(@get:JsonValue val value: kotlin.String) {

        default_2024_08_21("default_2024_08_21");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Ranker {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RunStepDetailsToolCallsFileSearchRankingOptionsObject'")
            }
        }
    }

}

