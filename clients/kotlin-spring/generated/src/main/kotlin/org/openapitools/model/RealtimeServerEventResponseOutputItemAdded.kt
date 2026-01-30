package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.RealtimeConversationItem
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
 * Returned when a new Item is created during Response generation.
 * @param eventId The unique ID of the server event.
 * @param type The event type, must be `response.output_item.added`.
 * @param responseId The ID of the Response to which the item belongs.
 * @param outputIndex The index of the output item in the Response.
 * @param item 
 */
data class RealtimeServerEventResponseOutputItemAdded(

    @Schema(example = "null", required = true, description = "The unique ID of the server event.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "null", required = true, description = "The event type, must be `response.output_item.added`.")
    @get:JsonProperty("type", required = true) val type: RealtimeServerEventResponseOutputItemAdded.Type,

    @Schema(example = "null", required = true, description = "The ID of the Response to which the item belongs.")
    @get:JsonProperty("response_id", required = true) val responseId: kotlin.String,

    @Schema(example = "null", required = true, description = "The index of the output item in the Response.")
    @get:JsonProperty("output_index", required = true) val outputIndex: kotlin.Int,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("item", required = true) val item: RealtimeConversationItem
) {

    /**
    * The event type, must be `response.output_item.added`.
    * Values: responsePeriodOutput_itemPeriodAdded
    */
    enum class Type(@get:JsonValue val value: kotlin.String) {

        responsePeriodOutput_itemPeriodAdded("response.output_item.added");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Type {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'RealtimeServerEventResponseOutputItemAdded'")
            }
        }
    }

}

