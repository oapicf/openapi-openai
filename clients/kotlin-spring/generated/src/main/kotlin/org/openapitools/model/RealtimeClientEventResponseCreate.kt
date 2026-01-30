package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RealtimeResponseCreateParams
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
 * This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a `response.created` event, events for Items  and content created, and finally a `response.done` event to indicate the  Response is complete.  The `response.create` event includes inference configuration like  `instructions`, and `temperature`. These fields will override the Session's  configuration for this Response only. 
 * @param type The event type, must be `response.create`.
 * @param eventId Optional client-generated ID used to identify this event.
 * @param response 
 */
data class RealtimeClientEventResponseCreate(

    @Schema(example = "null", required = true, description = "The event type, must be `response.create`.")
    @get:JsonProperty("type", required = true) val type: RealtimeClientEventResponseCreate.Type,

    @Schema(example = "null", description = "Optional client-generated ID used to identify this event.")
    @get:JsonProperty("event_id") val eventId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("response") val response: RealtimeResponseCreateParams? = null
) {

    /**
    * The event type, must be `response.create`.
    * Values: responsePeriodCreate
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        responsePeriodCreate("response.create");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeClientEventResponseCreate'")
            }
        }
    }

}

