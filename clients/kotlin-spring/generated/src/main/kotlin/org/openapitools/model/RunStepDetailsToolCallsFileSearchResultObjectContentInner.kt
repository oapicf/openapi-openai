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
 * 
 * @param type The type of the content.
 * @param text The text content of the file.
 */
data class RunStepDetailsToolCallsFileSearchResultObjectContentInner(

    @Schema(example = "null", description = "The type of the content.")
    @get:JsonProperty("type") val type: RunStepDetailsToolCallsFileSearchResultObjectContentInner.Type? = null,

    @Schema(example = "null", description = "The text content of the file.")
    @get:JsonProperty("text") val text: kotlin.String? = null
) {

    /**
    * The type of the content.
    * Values: text
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        text("text");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RunStepDetailsToolCallsFileSearchResultObjectContentInner'")
            }
        }
    }

}

