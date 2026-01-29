package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RunObject
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
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.
 * @param event 
 * @param &#x60;data&#x60; 
 */
data class RunStreamEventOneOf6(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("event", required = true) val event: RunStreamEventOneOf6.Event,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: RunObject
) {

    /**
    * 
    * Values: threadPeriodRunPeriodCancelling
    */
    enum class Event(@get:JsonValue val value: kotlin.String) {

        threadPeriodRunPeriodCancelling("thread.run.cancelling");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Event {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RunStreamEventOneOf6'")
            }
        }
    }

}

