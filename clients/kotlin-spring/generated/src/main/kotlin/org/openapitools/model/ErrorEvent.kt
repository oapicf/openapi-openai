package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Error
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
 * Occurs when an [error](/docs/guides/error-codes#api-errors) occurs. This can happen due to an internal server error or a timeout.
 * @param event 
 * @param &#x60;data&#x60; 
 */
data class ErrorEvent(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("event", required = true) val event: ErrorEvent.Event,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: Error
) {

    /**
    * 
    * Values: error
    */
    enum class Event(@get:JsonValue val value: kotlin.String) {

        error("error");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Event {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ErrorEvent'")
            }
        }
    }

}

