package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonSetter
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
 * Occurs when a stream ends.
 * @param event 
 * @param &#x60;data&#x60; 
 */
data class DoneEvent(

    @Schema(required = true, description = "")
    @param:JsonProperty("event")
    @get:JsonProperty("event", required = true) val event: DoneEvent.Event,

    @Schema(required = true, description = "")
    @param:JsonProperty("data")
    @get:JsonProperty("data", required = true) val `data`: DoneEvent.`Data`
) : AssistantStreamEvent {

    /**
    * 
    * Values: done
    */
    enum class Event(@get:JsonValue val value: kotlin.String) {

        done("done");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Event {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Event'")
            }
        }
    }

    /**
    * 
    * Values: Left_Square_BracketDONERight_Square_Bracket
    */
    enum class `Data`(@get:JsonValue val value: kotlin.String) {

        Left_Square_BracketDONERight_Square_Bracket("[DONE]");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Data` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum '&#x60;Data&#x60;'")
            }
        }
    }

}

