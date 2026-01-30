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
 * The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.
 * @param type Always `auto`.
 */
data class AutoChunkingStrategy(

    @Schema(example = "null", required = true, description = "Always `auto`.")
    @get:JsonProperty("type", required = true) val type: AutoChunkingStrategy.Type
) {

    /**
    * Always `auto`.
    * Values: auto
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        auto("auto");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AutoChunkingStrategy'")
            }
        }
    }

}

