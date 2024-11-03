package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.MessageObject
import org.openapitools.model.MessageStreamEventOneOf
import org.openapitools.model.MessageStreamEventOneOf1
import org.openapitools.model.MessageStreamEventOneOf2
import org.openapitools.model.MessageStreamEventOneOf3
import org.openapitools.model.MessageStreamEventOneOf4
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
 * @param event 
 * @param &#x60;data&#x60; 
 */
data class MessageStreamEvent(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("event", required = true) val event: MessageStreamEvent.Event,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data", required = true) val `data`: MessageObject
    ) {

    /**
    * 
    * Values: threadPeriodMessagePeriodIncomplete
    */
    enum class Event(@get:JsonValue val value: kotlin.String) {

        threadPeriodMessagePeriodIncomplete("thread.message.incomplete");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Event {
                return values().first{it -> it.value == value}
            }
        }
    }

}

