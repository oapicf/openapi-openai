package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MessageObject
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
 * Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.
 * @param event 
 * @param &#x60;data&#x60; 
 */
data class MessageStreamEventOneOf1(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("event", required = true) val event: MessageStreamEventOneOf1.Event,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: MessageObject
) {

    /**
    * 
    * Values: threadPeriodMessagePeriodIn_progress
    */
    enum class Event(@get:JsonValue val value: kotlin.String) {

        threadPeriodMessagePeriodIn_progress("thread.message.in_progress");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Event {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'MessageStreamEventOneOf1'")
            }
        }
    }

}

