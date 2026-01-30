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
 * This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the `chunking_strategy` concept was introduced in the API.
 * @param type Always `other`.
 */
data class OtherChunkingStrategyResponseParam(

    @Schema(example = "null", required = true, description = "Always `other`.")
    @get:JsonProperty("type", required = true) val type: OtherChunkingStrategyResponseParam.Type
) {

    /**
    * Always `other`.
    * Values: other
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        other("other");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OtherChunkingStrategyResponseParam'")
            }
        }
    }

}

