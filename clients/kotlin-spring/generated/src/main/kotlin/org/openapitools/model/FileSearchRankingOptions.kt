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
 * The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 * @param scoreThreshold The score threshold for the file search. All values must be a floating point number between 0 and 1.
 * @param ranker The ranker to use for the file search. If not specified will use the `auto` ranker.
 */
data class FileSearchRankingOptions(

    @get:DecimalMin(value="0")
    @get:DecimalMax(value="1")
    @Schema(example = "null", required = true, description = "The score threshold for the file search. All values must be a floating point number between 0 and 1.")
    @get:JsonProperty("score_threshold", required = true) val scoreThreshold: java.math.BigDecimal,

    @Schema(example = "null", description = "The ranker to use for the file search. If not specified will use the `auto` ranker.")
    @get:JsonProperty("ranker") val ranker: FileSearchRankingOptions.Ranker? = null
) {

    /**
    * The ranker to use for the file search. If not specified will use the `auto` ranker.
    * Values: auto,default_2024_08_21
    */
    enum class Ranker(@get:JsonValue val value: kotlin.String) {

        auto("auto"),
        default_2024_08_21("default_2024_08_21");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Ranker {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'FileSearchRankingOptions'")
            }
        }
    }

}

